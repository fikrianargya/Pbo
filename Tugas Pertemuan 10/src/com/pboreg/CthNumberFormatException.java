package com.pbo;

public class CthNumberFormatException {

    public static String password = "041.001";
    public static void main(String[] args) {
        System.out.println("Error Program : NumberFormatException");
        try { int x = Integer.parseInt(password);
        } catch(NumberFormatException y) {
            System.err.println(y);
        }
    }
}