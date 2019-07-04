package com.stackroute.pe2;

public class powerOfFour {
    public String power(int number) {   //checks whether the given number is a power of four or not
        for (int i = 0; i <= number; i++) {
            if (number == Math.pow(4, i))
            return "True";
        }
        return "False";
    }
}