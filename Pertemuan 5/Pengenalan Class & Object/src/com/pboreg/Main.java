package com.pboreg;

class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}


public class Main {
    public static void main(String[] args) throws Exception {

        // instansiasi / membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Fikri";
        mahasiswa1.NIM = "13305041";
        mahasiswa1.jurusan = "teknik informatika";
        mahasiswa1.IPK = 2.0;
        mahasiswa1.umur = 17;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Gya";
        mahasiswa2.NIM = "13305042";
        mahasiswa2.jurusan = "teknik sipil";
        mahasiswa2.IPK = 3.0;
        mahasiswa2.umur = 32;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
}
