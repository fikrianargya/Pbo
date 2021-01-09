package com.pbo;

import java.util.*;

public class CthStringIndexOutOfBoundsException {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan file yang dicari oleh user : ");
        String file = input.nextLine();
        try { System.out.print("Masukan index yang dicari oleh user : ");
            int index = input.nextInt();
            char File = file.charAt(index);
        } catch(StringIndexOutOfBoundsException e) {
            System.err.println("Error, index yang dicari tidak ditemukan \n" + e);
        }
    }
}
