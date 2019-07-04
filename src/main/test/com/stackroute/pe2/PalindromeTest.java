package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome check;

    @Before
    public void setup() {
        System.out.println("Before");
        check = new Palindrome();
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
        String result = check.isAPalindrome("level");
        assertEquals("Palindrome", result);
    }
    @Test
    public void givenCharacterShouldReturnFalse() {
        String result = check.isAPalindrome("stackroute");
        assertEquals("Not a Palindrome", result);
    }


}