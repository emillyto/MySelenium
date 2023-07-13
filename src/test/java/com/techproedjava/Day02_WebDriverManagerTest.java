package com.techproedjava;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Day02_WebDriverManagerTest {
    /*
    Create a class WebDriverManagerTest
Create a test case that will navigate to amazon page
Use WebDriverManager class to set up chrome driver
     */
    public static void main(String[] args) {

        // Testing On Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.close();
         /*
        WebDriverManager : This is an API that is used to set up the drivers
        From now on, use WebDriverManager to set up driver instead of System.setProperty
        We no longer need to use System.setProperty
         */

        // Testing on Firefox
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver1=new FirefoxDriver();
        driver1.get("https://www.amazon.com");
        driver1.close();

        // Testing on EDGE
        WebDriverManager.edgedriver().setup();
        WebDriver driver2=new EdgeDriver();
        driver2.get("https://www.amazon.com");
        driver2.close();

        // Testing on Safary
        WebDriverManager.safaridriver().setup();
        WebDriver driver3=new SafariDriver();
        driver3.get("https://www.amazon.com");
        driver3.close();

    }
}
