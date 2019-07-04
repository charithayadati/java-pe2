package com.stackroute.pe2;

 class Member {
     private String name;
     private int age;
     private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Constructors for the class member

    Member(String name,int age,double salary)
    {
        this.salary=salary;
        this.age=age;
        this.name=name;
    }
     Member(String name,int age)
     {

         this.age=age;
         this.name=name;
     }
     Member(String name)
     {
         this.name=name;
     }
}

public class MemberVariable
        //displays age , name and salary
{
    public String printMemberVariable(String name,int age,double salary){

        StringBuilder stringBuilder=new StringBuilder();
        Member member=new Member(name,age,salary);
        stringBuilder=stringBuilder.append("Member's Name: "+member.getName());
        stringBuilder=stringBuilder.append("\nMember's Age: "+member.getAge());
        stringBuilder=stringBuilder.append("\nMember's Salary: "+member.getSalary());

        return stringBuilder.toString();

}
    public String printMemberVariable(String name,int age){

        StringBuilder stringBuilder=new StringBuilder();
        Member member=new Member(name,age);
        stringBuilder=stringBuilder.append("Member's Name: "+member.getName());
        stringBuilder=stringBuilder.append("\nMember's Age: "+member.getAge());
        stringBuilder=stringBuilder.append("\nMember's Salary: "+member.getSalary());

        return stringBuilder.toString();

    }
    public String printMemberVariable(String name){

        StringBuilder stringBuilder=new StringBuilder();
        Member member=new Member(name);
        stringBuilder=stringBuilder.append("Member's Name: "+member.getName());
        stringBuilder=stringBuilder.append("\nMember's Age: "+member.getAge());
        stringBuilder=stringBuilder.append("\nMember's Salary: "+member.getSalary());

        return stringBuilder.toString();

    }

}
