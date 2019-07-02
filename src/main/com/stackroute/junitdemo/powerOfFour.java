package com.stackroute.junitdemo;

public class powerOfFour {
    public String power(int number) {
        for (int i = 0; i <= number; i++) {
            if (number == Math.pow(4, i))
            return "True";
        }
        return "False";
    }
}