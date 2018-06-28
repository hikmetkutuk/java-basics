package com.overriding.java;

public class Manager extends Employee
{
    protected int salary = 15000;

    @Override
    void information()
    {
        name = "Elif";
        System.out.println("Name: " + name + " Age: " + age + " Salary: " + salary);
    }
}
