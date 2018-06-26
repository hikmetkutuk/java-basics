package com.encapsulation.java;

public class Run
{
    public static void main(String args[])
    {
        Test encap = new Test();
        encap.setName("Hikmet");
        encap.setAge(25);
        encap.setId("ab23nm0");

        System.out.print("Name: " + encap.getName());
        System.out.print("\n");
        System.out.print("Age: " + encap.getAge());
    }
}
