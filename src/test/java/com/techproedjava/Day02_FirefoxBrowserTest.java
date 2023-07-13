package com.techproedjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day02_FirefoxBrowserTest {
    /*
    https://www.mozilla.org/en-US/firefox/new/
https://github.com/mozilla/geckodriver/releases
Create a new class under : FirefoxBrowserTest
Create main method
Set Path
Create gecko driver
Open google home page https://www.amazon.com/
Maximize the window
Close/Quit the browser

     */
    public static void main(String[] args) {

        // Set Path
        System.setProperty("webdriver.firefox.driver", "src/drivers/" +
                "geckodriver.exe");

        // Create gecko driver
        WebDriver driver = new FirefoxDriver();

        // Open google home page https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Maximize the window
        driver.manage().window().maximize();

        //Close/Quit the browser
        //driver.close();
        driver.quit();





    }
}
