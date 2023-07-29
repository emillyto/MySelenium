package com.techproedjava.practices.practic01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q01_Navigate {

    public static void main(String[] args) throws InterruptedException {
         // ...Practice 1...
        // Set Driver Path
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

       // Create chrome driver object
        WebDriver driver= new ChromeDriver();

      // Maximize the window
        driver.manage().window().maximize();

      // Open google home page https://www.google.com/
        driver.get("https://www.google.com/");

     // Navigate to techproeducation home page https://techproeducation.com/
        driver.navigate().to("https://techproeducation.com/");
        Thread.sleep(3000);

     // Navigate back to google
        driver.navigate().back();
        Thread.sleep(3000);

     // Navigate forward to techproeducation
        driver.navigate().forward();

     // Refresh the page
        driver.navigate().refresh();
     // Close/Quit the browser
        driver.quit();
     // And last step : print "ALL OK" on console
        System.out.println("All OK");


    }
}
