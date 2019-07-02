package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenNumTest {

    @Test
    public void givenIntegerShouldReturnTrue() {
        boolean result = EvenNum.isEven(22);
        assertEquals(true, result);
    }
    @Test
    public void givenIntegerShouldReturnFalse() {
        boolean result = EvenNum.isEven(23);
        assertEquals(false, result);
    }
    @Test
    public void givenNegativeEvenIntegerShouldReturnTrue() {
        boolean result = EvenNum.isEven(-22);
        assertEquals(true, result);
    }
    @Test
    public void givenNegativeOddIntegerShouldReturnFalse() {
        boolean result = EvenNum.isEven(-23);
        assertEquals(false, result);
    }


}