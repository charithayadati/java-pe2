package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial check;
    @Before
    public void setup() {
        System.out.println("Before");
        check = new Factorial();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        check = null;
    }

    @BeforeClass
    public static void setUpBeforeClass() {

        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() {

        System.out.println("AfterClass");
    }

    @Test
    public void giveninputShouldReturnFactorial() {
        String result = check.findFact(17);
        assertEquals("All factorials are printed", result);
    }
   @Test
    public void giveninputShouldReturnLongFactorial() {
       String result = check.findLongFact(30);
       assertEquals("All factorials are printed", result);
    }


}

