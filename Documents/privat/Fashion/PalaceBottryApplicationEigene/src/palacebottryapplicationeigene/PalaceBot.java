/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palacebottryapplicationeigene;

import com.google.common.base.Strings;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Lukas
 */
public class PalaceBot {

    public void cop() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lukas\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://shop.palaceskateboards.com/collections/new");
        do {

            System.out.println(driver.getCurrentUrl());

            try {
                Thread.sleep(100L);
            } catch (InterruptedException ex) {
                Logger.getLogger(Starter.class.getName()).log(Level.SEVERE, null, ex);
            }

            driver.navigate().refresh();
        } while (!(driver.getCurrentUrl().equalsIgnoreCase("https://shop.palaceskateboards.com/collections/new")));

        List<WebElement> myElement = driver.findElements(By.xpath("//*[starts-with(text(), 'TREKNO FLEECE INTER')]"));

        ArrayList<String> parent = new ArrayList<String>();
        for (WebElement e : myElement) {
            WebElement w = (WebElement) ((JavascriptExecutor) driver).executeScript(
                    "return arguments[0].parentNode;", e);
            if (w != null) {
                
                parent.add(w.getAttribute("href"));
                
            }

        }
        System.out.println(parent.size());
      
int size = parent.size();
        if (size > 1) {

            
            for (int i = 0; i < size; i++) {
                
                System.out.println(parent.get(i));
               
                
                driver.navigate().to(parent.get(i));

                new Select(driver.findElement(By.id("product-select"))).selectByVisibleText("Large");
                WebElement button = driver.findElement(By.name("button"));

                button.click();
                //WebElement carthidden = driver.findElement(By.id("head-right"));


            }
               WebElement carthidden = driver.findElement(By.id("head-right"));
            System.out.println(carthidden.getAttribute("class"));
            System.out.println(carthidden);
            while (carthidden.getAttribute("class").contains(" ")) {
                System.out.println("space");
            }

            driver.navigate().to("https://shop.palaceskateboards.com/cart");

//            WebElement checkout = driver.findElement(By.name("checkout"));
//             try {
//                Thread.sleep(100L);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Starter.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            
//
//            checkout.click();
            
        } else {
            
             driver.navigate().to(parent.get(0));
            new Select(driver.findElement(By.id("product-select"))).selectByVisibleText("Large");
            WebElement button = driver.findElement(By.name("button"));

            button.click();
           WebElement carthidden = driver.findElement(By.id("head-right"));
            System.out.println(carthidden.getAttribute("class"));
            System.out.println(carthidden);
            while (carthidden.getAttribute("class").contains(" ")) {
                System.out.println("space");
            }

            driver.navigate().to("https://shop.palaceskateboards.com/cart");

            WebElement checkout = driver.findElement(By.name("checkout"));

            checkout.click();

        }
        

    }

}
