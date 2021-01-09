package com.pbo;

public class CthClassNotFoundException {
    public static void main(String [] args) {

        System.out.println("Error Program : ClassNotFoundException");
        try {
            Class.forName("ClassNotFoundException");
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        } finally {
            System.out.println("Nama class tidak ditemukan!");
        }
    }
}
