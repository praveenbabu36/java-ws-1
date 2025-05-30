package com.praveen;

public class CharsInString {
    public static void main(String[] args) {

        String str = "Have a nice day";

        for(int i=0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " - ");
        }
    }
}
