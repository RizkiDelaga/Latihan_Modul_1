package com.rizkidelagaprasetya;

public class karyawan_no3 {
    // variabel static. diluar main/method
    private static String nama = "Jaka Sasongko";

    // method yang memiliki nilai kembalian sesuai dengan tipe data yang akan diambil.
    private static String pekerjaan(){
        String kerja = "DPR";
        return kerja;
    }

    // method yang tidak memiliki nilai kembalian void (kosong)
    public void gaji(){
        System.out.println("Rp.100.000.000");
    }

    public static void main(String[] args) {
        System.out.println("------- Program Ditail Karyawan -------\n");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Pekerjaan\t: " + pekerjaan());

        karyawan_no3 karyawan = new karyawan_no3();
        System.out.print("Gaji\t\t: ");
        karyawan.gaji();
    }
}

