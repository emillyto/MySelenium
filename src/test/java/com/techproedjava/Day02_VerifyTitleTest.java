package com.techproedjava;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyTitleTest {
    /*
    ----TITLE PAGE TEST____

    Title of the page is information that is on the top of the page-include the page name
    1.Create a new class: VerifyTitleTest
	2.Navigate to amazon homepage
	3.Verify if page title contain “Amazon”
     */
    public static void main(String[] args) {
        // Set up the driver
        WebDriverManager.chromedriver().setup();
        // Create Driver
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        // start testing
        driver.get("https://www.amazon.com");

        // Verify if the page title contains "Amazon"
        String actualPageTitle=driver.getTitle();
        String expectedPageTitle="Amazon";

        if(actualPageTitle.contains(expectedPageTitle)){
            System.out.println("PASS..");


        }else{
            System.out.println("FAIL..");
            System.out.println("ACTUAL TITLE :" + driver.getTitle());
            System.out.println("BUT EXPECTED DATA : Amazon");
            System.out.println("Actual title does not contain Amazon");

        }
        driver.quit();



    }
}
