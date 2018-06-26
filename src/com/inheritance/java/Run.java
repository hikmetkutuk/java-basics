package com.inheritance.java;

public class Run
{
    public static void main(String args[])
    {
        Human human = new Human("Berk", "Keskin", 45);
        System.out.print(human.getInfo());

        System.out.print("\n");

        Girl girl = new Girl("Aslı", "Solmaz", 5, "long");
        System.out.print(girl.getInfo());

    }
}
