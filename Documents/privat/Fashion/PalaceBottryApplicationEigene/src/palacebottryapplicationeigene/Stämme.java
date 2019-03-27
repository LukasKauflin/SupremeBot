/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palacebottryapplicationeigene;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Lukas
 */
public class Stämme {

    public Stämme() {
        start();
    }
    private void start(){
    
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lukas\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.staemme.ch/");
        driver.navigate().to("https://ipp-facebook.innogames.de/?game=staemme&market=ch&ref=start&");
        

    }
}
