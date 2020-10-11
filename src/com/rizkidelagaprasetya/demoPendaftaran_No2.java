package com.rizkidelagaprasetya;

import java.util.Scanner;

public class demoPendaftaran_No2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("------- Program Pendaftaran Mahasiswa Baru -------\n\n");

        // array of object
        pendaftaranMahasiswa arrayMahasiswa[] = new pendaftaranMahasiswa[1];
        pendaftaranMahasiswa peserta = new pendaftaranMahasiswa(); // membuat objek dari class pendaftaranMahasiswa dengan nama peserta.

        System.out.print("Masukan Nama Peserta \t\t\t: ");
        String setNama = scan.nextLine(); // membaca inputan
        peserta.setNama(setNama); // memangggil fungsi/method setNama, dengan masukan dari variabel setNama.

        System.out.print("Masukan Tanggal Lahir (ANGKA) \t: ");
        int setTgl = scanner.nextInt(); // membaca inputan
        peserta.setTanggalLahir(setTgl); // memangggil fungsi/method setTanggalLahir, dengan masukan dari variabel setTgl.

        System.out.print("Masukan Jenis Kelamin \t\t\t: ");
        String setGender = scan.nextLine(); // membaca inputan
        peserta.setGender(setGender); // memangggil fungsi/method setGender, dengan masukan dari variabel setGender.

        System.out.print("masukan Asal Sekolah \t\t\t: ");
        String setAsal = scan.nextLine(); // membaca inputan
        peserta.setAsal(setAsal); // memangggil fungsi/method setAsal, dengan masukan dari variabel setAsal.

        arrayMahasiswa[0] = peserta; // memasukan objek peserta ke dalam array of objek

        // menampilkan output
        System.out.println("\nBerhasil Terdaftar.....\n");
        for (pendaftaranMahasiswa x: arrayMahasiswa) {
            System.out.println("Data Peserta :");
            System.out.println("Nama\t: " + x.getNama());
            System.out.println("Asal\t: " + x.getTanggalLahir());
            System.out.println("Nama\t: " + x.getGender());
            System.out.println("Asal\t: " + x.getAsal());
            System.out.println();
        }
    }
}

