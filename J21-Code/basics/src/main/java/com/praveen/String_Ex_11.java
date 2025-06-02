package com.praveen;

public class String_Ex_11 {

    public static void main(String[] args) {

        // String
        String greeting1 = "Hello World";

        String greeting2 = new String("Hello World");

        System.out.println(greeting1 + " " + greeting2);

        System.out.println("-------------------------");

        System.out.print(greeting1); // doesnt leave a new line after printing

        System.out.println("-------------------------");

        // String Concatenation
        System.out.println("Hello, " + "12345");

        // Print Formatted Strings
        String day = "Monday";
        System.out.printf("Tomorrow %s is Holiday.\n",  day);

        short year = 2026;
        System.out.printf("Next year is %d.\n",  year);
    }

}
