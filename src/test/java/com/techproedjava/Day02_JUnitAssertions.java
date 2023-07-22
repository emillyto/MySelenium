package com.techproedjava;

import org.junit.Assert;
import org.junit.Test;

public class Day02_JUnitAssertions {
      /*
    ***What is Assertion?
    Assertion is used to check if expected is equal to actual
    Assertion is very important and is a MUST to improve the quality of the application
    expected = actual => PASS
    expected != actual => FAIL
    * *************************
    * assertEquals
    * assertTrue
    * assertFalse
    * *************************
    * These assertions are HARD ASSERTION, meaning that if JUnit assertion fails, then test case stop executing
    * verification = soft assertion = not hard assert, meaning that if soft assert fails, test case continue to execute
    * Note that there is no soft assert in JUnit.
     */
    @Test
    public void assertions(){
        Assert.assertEquals(5,5);// If the test pass we will not see any message on the console
        Assert.assertEquals("Test Case fails",5,5);// If test case failed we will see message on the console
        Assert.assertTrue("apple".contains("a"));//This is Booleans and if it true statement the test will Pass
        Assert.assertFalse("apple".contains("b"));// If contain a True statement the Test will FAIL we expected False statement
    }

}
