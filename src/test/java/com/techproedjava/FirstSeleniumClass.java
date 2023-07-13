package com.techproedjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {
       // System.setProperty("web-driver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");



    }


}
