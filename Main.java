package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Program Login
        String ursername,password;
        Scanner inputUser= new Scanner(System.in);
        System.out.println("Username : ");
        ursername = inputUser.next();
        System.out.println("Password : ");
        password = inputUser.next();
        while (!ursername.equals ("fikri") && !password.equals("gya")){
            System.out.println("username atau password yang anda masukan salah \n");
            System.out.println("username : ");
            ursername = inputUser.next();
            System.out.println("password : ");
            password = inputUser.next();
        }
        System.out.println("-----Selamat datang, Fikri ----- ");
    }
}
