package com.inheritance.java;

public class Girl extends Human
{
    public String hair;

    public Girl(String firstname, String lastname, int age, String hair)
    {
        super(firstname, lastname, age);
        this.hair = hair;
    }

    @Override
    public String getInfo()
    {
        return super.getInfo() + " Hair: " + hair;
    }
}
