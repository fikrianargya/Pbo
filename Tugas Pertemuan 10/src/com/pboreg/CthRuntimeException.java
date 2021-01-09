package com.pbo;

import java.util.*;

class Bilangan { private int a;
    private int b;

    Bilangan() { this.a = 0;
        this.b = 0;
    }

    public int getBilangan(int a, int b) {
        return a / b;
    }
}

public class CthRuntimeException {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Bilangan angka = new Bilangan();

        System.out.print("Masukan angka yang di inginkan : ");
        int bilangan1 = input.nextInt();
        System.out.print("Masukan angka yang di inginkan : ");
        int bilangan2 = input.nextInt();

        try {
            int hasil = angka.getBilangan(bilangan1, bilangan2);
            System.out.println(hasil);
        } catch(RuntimeException e) {
            System.err.println(e);
        }

    }

}