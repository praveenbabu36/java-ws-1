package com.praveen;

public class DataType_Ex_8 {

    public static void main(String[] args) {

        /*
            Primitive:

            Numeric : byte, short, int, long

            Floating : float, double

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

        System.out.println(minLong + " " + maxLong);


    }

}
