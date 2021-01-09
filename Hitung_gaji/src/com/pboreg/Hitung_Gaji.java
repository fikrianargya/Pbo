package com.pboreg;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
public class Hitung_Gaji {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        String nama;
        int golg, gLembur, gaPok, jLembur, jKerja, tunjangan;
        double pjkGapok, tPajak,gBersih, pjkLembur;

        System.out.println("PROGRAM MENGHITUNG GAJI KARYAWAN");

        System.out.print("Masukan Nama : ");
        nama=input.next();
        System.out.print("Masukan Golongan : ");
        golg=input.nextInt();
        System.out.print("Masukan Jam Kerja : ");
        jKerja=input.nextInt();

        switch(golg){
            case 1 :
                gaPok=1486500;
                tunjangan=250000;
                break;
            case 2 :
                gaPok=1926000;
                tunjangan=300000;
                break;
            case 3 :
                gaPok=2456700;
                tunjangan=350000;
                break;
            case 4 :
                gaPok=2899500;
                tunjangan=400000;
                break;
            default :
                gaPok=0;
                tunjangan=0;
        }

        if (jKerja>100){
            jLembur=jKerja-100;
        }else{
            jLembur=0;
        }

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        gLembur=jLembur*50000;
        pjkGapok=0.05*gaPok;
        pjkLembur=0.05*gLembur;
        tPajak=pjkGapok+pjkLembur;
        gBersih=((gaPok+tunjangan+gLembur)-tPajak);

        System.out.println("Nama                 : "+nama);
        System.out.println("Gaji Pokok           : "+ kursIndonesia.format(gaPok));
        System.out.println("Gaji Lembur          : "+kursIndonesia.format(gLembur));
        System.out.println("Pajak Gaji Pokok     : "+kursIndonesia.format(pjkGapok));
        System.out.println("Pajak Lembur         : "+kursIndonesia.format(pjkLembur));
        System.out.println("Total Pajak          : "+kursIndonesia.format(tPajak));
        System.out.println("Tunjangan Pengabdian : "+kursIndonesia.format(tunjangan));
        System.out.println("Gaji Diterima        : "+kursIndonesia.format(gBersih));
    }
}
