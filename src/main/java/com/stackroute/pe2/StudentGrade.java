package com.stackroute.pe2;

public class StudentGrade {

    public float Average(int marks[])   //calculates the average of marks
    {
        float average= (float) 0.0;
        for (int i = 0; i < marks.length; i++) {
            average=average+marks[i];

        }
        average=average/marks.length;
        return average;
    }
    public  int getMax(int[] inputArray){   //gets maximum of marks
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
    public  int getMin(int[] inputArray){   //gets minimum of marks
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    public String printGrade(int marks[])   //prints the grades
    {
        if(marks.length!=0)
        {
        StringBuffer stringBuffer=new StringBuffer();
        StudentGrade studentGrade=new StudentGrade();

        stringBuffer=stringBuffer.append("The average is "+studentGrade.Average(marks)+"\n" +
                "The minimum is "+studentGrade.getMin(marks)+"\n" + "The maximum is "+studentGrade.getMax(marks));
        System.out.println(stringBuffer);
        return stringBuffer.toString();

    }
        else{
        return "Marks are not given";
        }
    }
}
