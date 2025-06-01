package com.praveen;

public class TypeCast_Ex_7 {

    public static void main(String[] args) {

        byte b = 100;

        // Implicit Type Casting - byte (1 byte) - int (4 bytes)
        // This is called widening.
        int x = b;

        System.out.println("Value of x: "+x);

        /*
            Widening Allowed -
                byte -> short -> int -> long -> float -> double
                char -> int
         */
        char c = 'a';

        int i2 = c; // ascii value is stored in here

        System.out.println("Value of i2: " + i2);

        double d1 = c;

        System.out.println("Value of d1: " + d1);


        /*
            Another way of implicit type casting
         */

        int i3 = 10;
        double d2 = 50.56;

        // here i3 is implicitly type casted to double
        double res = i3 + d2;

        System.out.println("value of res: " + res);

    }
}
