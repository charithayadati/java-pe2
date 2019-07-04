package com.stackroute.pe2;

public class EvenNum {
    public static boolean isEven(int number)//checks whether the given number is even or not
    {
        boolean result=true;
        if(number%2==0)
            return result;
        else
            return !result;

    }

}
