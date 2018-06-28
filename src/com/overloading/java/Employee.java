package com.overloading.java;

public class Employee
{
    String name;
    int age;
    int salary;

    void information(String name)
    {
        this.name = name;
        System.out.println(name);
    }

    //Overloading
    void information(int age, int salary)
    {
        this.age = age;
        this.salary = salary;
        System.out.println(age);
        System.out.println(salary);
    }
}
