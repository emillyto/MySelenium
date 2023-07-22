package com.techproedjava;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyURLTest {
    /*
    1.Create a new class: VerifyURLTest
	2.Navigate to Amazon homepage
	3.Verify if google homepage url is “https://amazon.com/”
     */
    public static void main(String[] args) {
        // Set up the driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com/");
        String actualUrl=driver.getCurrentUrl();
        String expextedUrl="https://amazon.com/";
        if(actualUrl.equals(expextedUrl)){
            System.out.println("PASS..");

        }else{
            System.out.println("ACTUAL URL :"+ driver.getCurrentUrl());
            System.out.println("BUT EXPECTED  URL https://amazon.com/");
        }
        driver.quit();
        /*
        Test case fails because
        ACTUAL URL https://www.amazon.com/
        BUT EXPECTED URL https://amazon.com/
        ------
        Since the test case fails, as testers, we try to figure if this is a real bug, or documentation issue
        Maybe BA forgot to put www statement in the expected URL
        We should first check with dev, and then talk to the BA to make sure this is a bug or not
         */


    }
}
