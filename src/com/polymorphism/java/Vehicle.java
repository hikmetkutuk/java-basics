package com.polymorphism.java;

public class Vehicle
{
    int speed;
    String tyre;

    public Vehicle()
    {
        this.speed=120;
    }

    public Vehicle(String alarm)
    {
        System.out.println("super() keyword " + alarm + " !!");
    }

    void speeding()
    {
        speed += 10;
    }
}
