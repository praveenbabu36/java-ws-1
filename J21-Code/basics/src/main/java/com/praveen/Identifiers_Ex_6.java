package com.praveen;

public class Identifiers_Ex_6 {

    public static void main(String[] args) {

        /*
            Rule 1: Identifiers can contain only chars: a to z, A to Z, 0 to 9, $ and _
         */
        // uncomment below to see the error
        // int employeeId# = 100;
        // String emp#Name = "";

        /*
            Rule 2: Reserved keywords cannot be used as Identifiers.
         */
        // uncomment below to see the error
        //int for = 200;
        //String while = "while";

        /*
            Rule 3: Predefined Java class names and Interfaces can be used but not recommended *.
         */
        int String = -1;
        System.out.println("Value of variable 'String' is:" + String);

        String Runnable = "Runnable";
        System.out.println("Value of variable 'Runnable' is: " + Runnable);

        /*
            Rule 4: Identifiers cannot begin with a digit
         */
        // uncomment below to see the error
        //String 2025BestBookNAme = "Best Book of 2025";


        /*
            Rule 5: Identifiers are case-sensitive.
         */
        // uncomment below to see the error
        int empId = 200;
        int EMPID = 201;
        int EmpId = 202;

        System.out.println(empId + " " + EMPID + " " + EmpId);

        /*
            Rule 6: Excessive long names are discouraged.
         */
        String exceptionStringForZeroBalanceError = "Zero Balance. Cant withdraw.";
        System.out.println(exceptionStringForZeroBalanceError);


    }

}
