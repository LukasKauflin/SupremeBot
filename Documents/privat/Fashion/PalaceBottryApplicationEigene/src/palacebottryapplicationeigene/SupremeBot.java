/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palacebottryapplicationeigene;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Lukas
 */
public class SupremeBot {

    public void cop() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lukas\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.supremenewyork.com/shop/all/sweatshirts");
        do {

            System.out.println(driver.getCurrentUrl());

            try {
                Thread.sleep(100L);
            } catch (InterruptedException ex) {
                Logger.getLogger(Starter.class.getName()).log(Level.SEVERE, null, ex);
            }

            driver.navigate().refresh();
        } while (!(driver.getCurrentUrl().equalsIgnoreCase("https://www.supremenewyork.com/shop/all/sweatshirts")));

        
    }

}
