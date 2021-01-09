package com.pbo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CthFileNotFoundException {
    public static void main(String[] args) {
        System.out.println("Error Program : FileNotFoundException");
        try {
            File file = new File("C:\\Pengguna\\Gya\\Unduhan\\FileGame.txt");
            Scanner input = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } finally {
            System.out.println("File tidak ditemukan");
        }
        System.out.println("Program berakhir");
    }
}