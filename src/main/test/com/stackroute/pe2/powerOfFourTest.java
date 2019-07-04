package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class powerOfFourTest {
    powerOfFour check;

    @Before
    public void setup() {
        System.out.println("Before");
        check = new powerOfFour();
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
    public void givenCharacterShouldReturnTrue() {
        String result = check.power(16);
        assertEquals("True", result);
    }
    @Test
    public void givenCharacterShouldReturnFalse() {
        String result = check.power(22);
        assertEquals("False", result);
    }


}