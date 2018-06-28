package com.overriding.java;

public class Run
{
    public static void main(String args[])
    {
        Employee emp = new Employee();
        Manager mng = new Manager();

        emp.information();
        mng.information();
    }
}
