
package com.techproedjava;

import org.junit.*;

public class Day02_Day02_JUnitAnnotations {
     /* 1) @ Test (@Test annotation)- test cases must be void because
           we  never get return type of them
        2) @Before and @After annotation -they runs before or after each @Test annotation
        3) @BeforeClass and @AfterClass-they runs only once for each class
        4) @Ignore annotation is used to completely ignore(skip) the test case
      */
    @Before
    public void setUp(){
        System.out.println("Before method..");

    }
    @After
    public void tearDown(){
        System.out.println("Tear Down");
    }
    @BeforeClass//@BeforeClass and @AfterClass should be STATIC
    public static void setUpClass(){
        System.out.println("Before class");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
    }
    @Test
    public void test1(){
        System.out.println("Test case 1");
    }
    @Test @Ignore// When we use @Ignore this test case will be not executed
    public void test2(){
        System.out.println("Test case 2");

    }
    @Test
    public void test03(){
        System.out.println("Test case 3");
    }
    @Test
    public void test04(){
        System.out.println("Test case 4");

    }
    @Test
    public void test05(){
        System.out.println("Test case 5");
    }
    @Test
    public void test6(){
        System.out.println("Test case 6");
    }


}

