package com.praveen;

public class Enum_Ex_12 {

    public static void main(String[] args) {

        // Create ENUM - t0 represent DAYS of Week
        enum days {
            SUN, MON, TUE, WED, THU, FRI, SAT
        }

        System.out.println(days.MON);

        // ENUM - FLAG
        enum UserFlag {
            ON, OFF
        }

        /*
            Methods of ENUM:
                name(), values(), valueOf() and ordinal
         */
        UserFlag userFlag1 = UserFlag.ON;

        // name()
        System.out.println("State of User Flag: " + userFlag1.name());

        // values()
        System.out.println("Value of [1] enum: " + UserFlag.values()[1]);

        // valueOf()
        System.out.println("Value of 'OFF': " + UserFlag.valueOf("OFF"));

        // ordinal()
        System.out.println("Index of 'ON': " + userFlag1.ordinal());

    }
}


