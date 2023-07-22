package com.techproedjava;

import com.techproedjava.Utilities.TestBase;
import org.junit.Test;

public class Day04_TestBase extends TestBase {
    // Extend  the TestBase class so that the @Before and @After methods
    //are automatically implemented to our code in this class
    @Test
    public void testBaseTest(){
        // driver is comming from the TestBase class,we no longer need to do the test set
        // or create in the test classes,beacouse we use TestBase
        driver.get("https://www.amazon.com");
    }

}
