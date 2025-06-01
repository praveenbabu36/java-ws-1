package com.praveen;

public class DataType_Ex_8 {

    public static void main(String[] args) {

        /*
            Primitive:

            Numeric : byte, short, int, long

            Precision : float, double

            Character :  char

            Boolean : boolean
         */

        // Numeric : byte (1 byte), short (2 bytes), int (4 bytes), long (8 bytes)

        byte minByte = -128;
        byte maxByte = 127;

        short minShort = -32768;
        short maxShort = 32_767; // underscores are allowed.

        int minInt = -2_147_483_648;
        int maxInt = 2_147_483_647;

        long minLong = -9223372036854775808L;
        long maxLong = 9223372036854775807L;


        // Precision - float (32 bit) / double (64 bit)

        /* Float - Any number with decimal is considered as double
                            unless char 'f' is specified at end of number.
         */
        float myFloat1 = 10.233423F;

        System.out.println(myFloat1);


        // Double
        double myDouble1 = 10.234312;

        System.out.println(myDouble1);


        // Math Operations when using the diff data type
        int resInt = 10 / 3;

        float resFlt = 10.0f / 3.0f;

        double resDbl = 10.0d / 3.0d;


        System.out.println( "Int Result: " + resInt );
        System.out.println( "Float Result: " + resFlt );
        System.out.println( "Double Result: " + resDbl );

    }

}
