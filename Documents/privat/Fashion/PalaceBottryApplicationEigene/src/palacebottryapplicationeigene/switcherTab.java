/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palacebottryapplicationeigene;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Lukas
 */
public class switcherTab {
    public void run(){
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lukas\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
    
   driver.get("http://google.com");  
    ((JavascriptExecutor)driver).executeScript("window.open()");
    
    
    ((JavascriptExecutor)driver).executeScript("window.open()");
  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
    driver.get("http://google.com");
    driver.switchTo().window(tabs.get(2));
    driver.get("http://google.com");
    
    }
    
}
