package com.stackroute.pe2;

public class Palindrome {
    public String isAPalindrome(String input) {

        //checks whether the given string is a palindrome or not
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