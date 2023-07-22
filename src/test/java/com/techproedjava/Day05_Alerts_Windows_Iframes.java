package com.techproedjava;

import com.techproedjava.Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class Day05_Alerts_Windows_Iframes extends TestBase {
    @Test
    public void alertWindowsIframeTest1(){
       //Given Go to https://testpages.herokuapp.com/styled/frames/frames-test.html
        driver.get("https://testpages.herokuapp.com/styled/frames/frames-test.html");
        /*
        Left List Item 29 element is inside on frame.
        driver must be switch in this frame first,otherwise driver can not find this element
        We can use
        1.index-driver.switchTo().frame(0)
        2.id or name-driver.switchTo().frame(left)
         3.webelement-driver.switchTo().frame(driver.finElement(By.name(left)))
        to switch to this frame
       */
        driver.switchTo().frame("left");
        // Getting all list item in this iframe
        List<WebElement>leftFrameListItems=driver.findElements(By.xpath("//li"));
        for(WebElement each : leftFrameListItems){
            System.out.println(each);
        }
        WebElement lastLeftItem=leftFrameListItems.get(leftFrameListItems.size()-1);
        Assert.assertEquals("Expected and Actual Not Equal",
                "Left List Item 29",lastLeftItem.getText());//message will only show up if test case fails
        // Then Assert that "Left List Item 39" is the last element in the "Left"
        /*
        Note1
        At this point driver is on the left frame and he can not see the elements in midille frame or
        anything outside of this frame that is why we need to switch in Midlle frame so we can work witth
        the elements in middle frame
        NOTE 2We can switch parent to child, or child tp parent.We can not directly
        switch to the siblings
         */
        // Going to the default content
        driver.switchTo().defaultContent();
        // Going to the middle frame
        WebElement middleFrame= driver.findElement(By.xpath("//frame[@name='middle']"));
        driver.switchTo().frame(middleFrame);//switching by middle frame
        // Getting All middleFrame elements
        List<WebElement> middleFrameListItems = driver.findElements(By.xpath("//li"));
        for (WebElement each : middleFrameListItems){
            System.out.println(each.getText());
        }
        //And Assert that "Middle List Item 39" is the last element in the "Middle"
        String lastItemText = middleFrameListItems.get(middleFrameListItems.size()-1).getText();
        Assert.assertEquals("Expected and Actual Not Equal","Middle List Item 39",lastItemText);

    }
    @Test
    public void alertWindowsIframeTest2(){
//        When Navigate to https://testpages.herokuapp.com/styled/windows-test.html
        driver.get("https://testpages.herokuapp.com/styled/windows-test.html");
//        When Click on "Alerts In A New Window From JavaScript"
        driver.findElement(By.id("goalerts")).click();
//        And Switch to new window
        /*
        NOTE:
        if a neew windows opens, then we must switch to that window
          1. get windows handles
            getWindowHandle()-> returns only current window handle as String
            getWindowHandles()-> returns ALL window handle as Set<String>
          2. driver.switchTo(windowHandle)
         */
        String window1Handle = driver.getWindowHandle();
        System.out.println(window1Handle);
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles);
        //we need to switch window2 handle
        for (String eachHandle : allWindowHandles){
            if (!eachHandle.equals(window1Handle)){
                System.out.println(eachHandle);
                driver.switchTo().window(eachHandle);
            }
        }
//        And Click on "Show alert box" button
        driver.findElement(By.id("alertexamples")).click();//clicking the button that in on window 2
//        And Accept alert
        driver.switchTo().alert().accept();
//       //        And Click on "Show confirm box" button
       driver.findElement(By.xpath("//input[@id='confirmexample']")).click();
////        And Cancel alert
       driver.switchTo().alert().dismiss();
//        Then Assert that alert is canceled
        Assert.assertTrue(driver.findElement(By.xpath
                ("//p[@id='confirmexplanation']")).getText().contains("Cancel"));
//        When Click on "Show prompt box" button
        driver.findElement(By.xpath("//input[@id='promptexample']")).click();
//        And Send "Hello World!" to the alert
        driver.switchTo().alert().sendKeys("Hello World!");
        driver.switchTo().alert().accept();
//        Then Assert that "Hello World!" is sent
        Assert.assertTrue(driver.findElement(By.cssSelector("#promptreturn")).getText().contains("Hello World!"));
    }


}










