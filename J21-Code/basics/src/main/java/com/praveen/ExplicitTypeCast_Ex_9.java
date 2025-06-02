package com.praveen;

public class ExplicitTypeCast_Ex_9 {

    public static void main(String[] args) {

        int i1 = 100;

        // Narrowing (a) Explicit Type Casting
        byte b1 = (byte)i1;
        System.out.println("Value of b1: " + b1);

        // Another example
        int i2 = 2302;
        byte b2 = (byte) i2;
        System.out.println("Value of b2: " + b2);

        // Another example
        double d1 = 4.563;
        int i3 = (int)d1;
        System.out.println("Value of i3: " + i3);

        // char to int
        int i4 = (int)'A';
        System.out.println("Value of i4: " + i4);

    }
}
