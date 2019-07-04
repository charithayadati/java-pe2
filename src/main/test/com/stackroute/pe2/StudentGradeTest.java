package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class StudentGradeTest {
    StudentGrade studentGrade;

    @Before
    public void setup() {
        System.out.println("Before");
        studentGrade = new StudentGrade();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        studentGrade = null;
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
    public void givenInputOfArrayShouldReturnAverageMinimumAndMinimum() {
        String result = studentGrade.printGrade(new int[]{86, 65, 98, 77});
        assertEquals("The average is 81.5\n" +"The minimum is 65\n" +"The maximum is 98", result);
    }

    @Test
    public void givenNoValuesShouldReturnMarksNotGiven(){
        String result = studentGrade.printGrade(new int[]{});
        assertEquals("Marks are not given", result);
    }
    @Test
    public void givenOneInputShouldReturnAverageMinimumAndMinimum(){
        String result = studentGrade.printGrade(new int[]{45});
        assertEquals("The average is 45.0\n" + "The minimum is 45\n" + "The maximum is 45", result);
    }
}

