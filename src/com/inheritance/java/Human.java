package com.inheritance.java;

public class Human
{
     String firstname;
     String lastname;
     int age;

    public Human(String firstname, String lastname, int age)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getInfo()
    {
        return "Name: " + firstname + " " + lastname + " Age: " + age;
    }
}