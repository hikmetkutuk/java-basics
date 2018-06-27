package com.polymorphism.java;

public class Bus extends Vehicle
{
    int passenger;

    public Bus()
    {
        this("Michelin");
    }

    public Bus(String tyre)
    {
        super("alarm"); //Başlangıç değeri için Vehicle super sınıfının constructor metodunu kullanacak
        this.tyre = tyre;
    }
    int travel()
    {
        passenger++;
        return passenger;
    }

    //overloading
    int travel(int newPassenger)
    {
        passenger += newPassenger;
        return passenger;
    }

    //Overriding
    void speeding()
    {
        speed -= 5;
    }
}
