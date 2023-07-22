package com.techproedjava;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Day04_AccountCreating {

   // Test Case 1: Register User
//1. Launch browser
    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
      driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }
    @Test
    public void AccountCreating() throws InterruptedException {


//2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
//3. Verify that home page is visible successfully
        Assert.assertTrue(driver.getTitle().equals("Automation Exercise"));
//4. Click on 'Signup / Login' button
        driver.findElement(By.partialLinkText("Signup / Login")).click();
//5. Verify 'New User Signup!' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//h2[.='New User Signup!']")).isDisplayed());
//6. Enter name and email address
        // USING FAKE DATA



        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("John Walker");
        driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("testab14349@gmail.com");
        driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
//7. Click 'Signup' button
       // N/A
//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        // N/A
//9. Fill details: Title, Name, Email, Password, Date of birth
        // We can use 3 options  to find the dropdown value-1)By Index,2)By Value 3)By visible txt
        driver.findElement(By.id("id_gender1")).click();
        // Name already filed
        //Email already filed
        //Password
        driver.findElement(By.id("password")).sendKeys("12345");
//       Date of birth -> DROPDOWN
//        1. locate the day dropdown element
        WebElement day = driver.findElement(By.xpath("//select[@data-qa='days']"));
//        2. create select object
        Select daySelect = new Select(day);
//        3. use select object to interact with dropdown
        daySelect.selectByIndex(5);//using index to select day 5
        // Month selection
        WebElement month= driver.findElement(By.cssSelector("select[data-qa='months']"));
        Select monthSelect=new Select(month);
        // Use monthSelect Object to interact with Month dropdown
        monthSelect.selectByValue("5");
        // Year Selection

        //Locate the Year dropdown by visible txt
        WebElement year= driver.findElement(By.cssSelector("select[data-qa='years']"));
        // Create a Select Object
        Select yearSelect=new Select(year);
        // Use Select Object to interact with Dropdown
        yearSelect.selectByVisibleText("2000");//using text to select 2000 by visible txt
        // by visible txt is case-sensitive we Must copy past to avoid errors


//10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.cssSelector("input#newsletter")).click();
//11. Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.cssSelector("input#optin")).click();
//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        /////First Name
        driver.findElement(By.id("first_name")).sendKeys("John");
        /////Last Name
        driver.findElement(By.id("last_name")).sendKeys("Walker");
        /////Company
        driver.findElement(By.id("company")).sendKeys("Amazon");
        ///// Address
        driver.findElement(By.id("address1")).sendKeys("123 main st");
        ////Country
        WebElement country= driver.findElement(By.id("country"));
        Select countrySelect=new Select(country);
        countrySelect.selectByVisibleText("United States");
        ////State
        driver.findElement(By.id("state")).sendKeys("TX");
        ////City
        driver.findElement(By.id("city")).sendKeys("Dallas");

        ///Zip
        driver.findElement(By.id("zipcode")).sendKeys("75001");

        ///Mobile
        driver.findElement(By.id("mobile_number")).sendKeys("+12141234567");

//13. Click 'Create Account button'
        driver.findElement(By.xpath("//button[.='Create Account']")).click();
//14. Verify that 'ACCOUNT CREATED!' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//b[.='Account Created!']")).isDisplayed());
//15. Click 'Continue' button
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
        //        NOTE: THERE IS A WEB POP UP THAT IS SHOWING UP AND WE MUST CLICK CLOSE TO PROCEED
//       driver.navigate().refresh();// refreshing because a window popup may show up.
//            Thread.sleep(5000);
//            driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();//second click is working
//            driver.navigate().refresh();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

//16. Verify that 'Logged in as username' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Logged in as')]")).isDisplayed());
//17. Click 'Delete Account' button
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[contains(text(),'Delete Account')")).
                click();
//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button"
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Account Deleted!')]")).isDisplayed());
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
    }
    }

