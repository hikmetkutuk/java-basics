package com.polymorphism.java;

public class Run
{
    public static void main(String args[])
    {
        Vehicle audi = new Vehicle();
        Bus man = new Bus();

        //audi.speed=100;
        audi.speeding();
        System.out.println("Audi speed: " + audi.speed);

        man.speed=80;
        man.passenger=30;
        man.speeding();
        man.travel();
        System.out.println("Man speed: " + man.speed);
        System.out.println("Man passenger: " + man.passenger);
        System.out.println("Man tyre: " + man.tyre);
        man.travel(20);
        System.out.println("Man passenger: " + man.passenger);

    }
}
