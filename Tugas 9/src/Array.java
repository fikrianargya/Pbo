package com.pboreg;

import java.util.*;

public class Array {
    public static void main(String[] args){
        int n, x, flag= 0, i= 0;
        Scanner s= new Scanner(System.in);
        System.out.println("====================");
        System.out.print("Masukkan Berapa Banyak Data yang Ingin Di input: ");
        n= s.nextInt();
        int a[] = new int[n];
        System.out.println("====================");
        System.out.println("Masukkan Data: ");
        for(i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("====================");
        System.out.print("Masukkan Data yang Ingin Di cari: ");
        x= s.nextInt();
        for(i = 0; i < n; i++){
            if(a[i] == x){
                flag = 1;
                break;
            }else{
                flag= 0;
            }
        }if(flag == 1){
            System. out.println("====================");
            System.out.println("Data yang ditemukan "+(i + 1));
        }
        else{
            System.out.println("====================");
            System.out.println("Data tidak ditemukan");
        }
    }
}