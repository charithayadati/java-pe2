package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class MemberTest {
    MemberVariable memberVariable;

    @Before
    public void setup() {
        System.out.println("Before");
        memberVariable = new MemberVariable();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        memberVariable = null;
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
    public void givenStringShouldReturnPalindromeOrNot() {
        String result =memberVariable.printMemberVariable("zona",22,20000);
        assertEquals("Member's Name: zona\n" + "Member's Age: 22\n" + "Member's Salary: 20000.0",result);
    }
    @Test
    public void givenIntegerShouldReturnPalindromeOrNot() {
        String result =memberVariable.printMemberVariable("Charitha");
        assertEquals("Member's Name: Charitha\n" + "Member's Age: 0\n" + "Member's Salary: 0.0", result);
    }
    @Test
    public void givenIntegerShouldReturnPalindromeOr() {
        String result =memberVariable.printMemberVariable("Shristi",25);
        assertEquals("Member's Name: Shristi\n" + "Member's Age: 25\n" + "Member's Salary: 0.0", result);
    }

}