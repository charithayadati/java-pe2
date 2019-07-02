package com.stackroute.junitdemo;

public class Palindrome {
    public String isAPalindrome(String input) {


        StringBuilder result = new StringBuilder();
        char inputArray[] = input.toCharArray();
        int j = 0;

        for (int i = (input.length() - 1); i >= 0; i--) {

            result= result.append(inputArray[i]);

            j++;
        }
       if(result.toString().equals(input))
           return "Palindrome";
       else
           return "Not a Palindrome";
    }

}