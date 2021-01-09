package com.pbo;

import java.io.FileInputStream;
import java.io.IOException;

public class CthIOException {
    public static void main(String[] args) {
        FileInputStream fileGame = null;

        System.out.println("Error Program IO");
        try {
            fileGame = new FileInputStream("FilePenting.txt");
        } catch(IOException a) {
            System.err.println("\n" + a);
        }
    }
}
