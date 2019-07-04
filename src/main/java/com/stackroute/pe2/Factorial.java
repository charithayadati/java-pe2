package com.stackroute.pe2;

    public class Factorial {
    public String findFact(int input)//finds the factorial for short integers
    {

        int fact = 1;
        for (int i = 1; i <= input; i++)
        {
            fact = fact * i;
            if(fact>=1&&fact<=Integer.MAX_VALUE)
                System.out.println("Factorial of  "+i+ " is " +fact);
            else
                System.out.println("Factorial of  "+i+" is out of bound");

        }
        return "All factorials are printed";
    }
   public String findLongFact(long input)//finds the factorial for long type of integers
    {
        long fact=1;

        System.out.println(Long.MAX_VALUE);
        for (int i = 1; i <= input; i++)
        {
            fact = fact * i;
            if(fact>=1&&fact<=Long.MAX_VALUE) {

                    System.out.println("Factorial of  " + i + " is " + fact);
            }
            else {
                System.out.println("Factorial of  " + i + " is out of bound");

                break;
            }
        }
        return "All factorials are printed";
    }
}
