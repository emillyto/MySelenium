package com.techproedjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Navigations {
    public static void main(String[] args) {
        /*
        Test Case Steps:
Create a new class under : BasicNavigations-Done
Create main method-Done
Set Path
Create chrome driver
Maximize the window
Open google home page https://www.walmart.com/.
On the same class, Navigate to amazon home page https://www.amazon.com/
Navigate back to google
Navigate forward to amazon
Refresh the page
Close/Quit the browser
         */

        //Set Path
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");

        // Create chrome driver

        WebDriver driver= new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Open google home page https://www.walmart.com/
        driver.get("https://www.walmart.com/");

        //On the same class, Navigate to amazon home page https://www.amazon.com/
       // driver.get("https://www.amazon.com/");//get() is used ALTERNATIVELY
        // Better to use NAVIGATION()
        driver.navigate().to("https://www.amazon.com/");

        //Navigate back to Walmart
        driver.navigate().back();// Back() will navigate us to previous page,website

        //Navigate forward to Amazon // forward() will navigate us to forward page,websaite
        // it is like buttons on Google(forward,back ,refresh buttons)
        driver.navigate().forward();

        //Refresh the page
        driver.navigate().refresh();

        //Close/Quit the browser
        //driver.quit() will close all open windows or browsers for the test case and is more stronger
        driver.quit();
        //driver.close will close just last open window or browser for the test case
        driver.close();
         /*
        1. What is the difference between get and navigate to?
        -Similarities : both is used to go to a URL
        -get()-is shorter and easier to use
        -get() - accepts only string parameter; however navigate to accepts either string or URL object in the parameter
        -navigate to() - has more options such as to, back, forward, refresh.

        2. What is the difference between close and quit?
        -close() - closes only the last active browser
        -quit() -  closes all active browsers
        -I prefer to use quit to close all browser after my test case
         */










    }
}
