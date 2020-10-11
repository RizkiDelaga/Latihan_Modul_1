package com.rizkidelagaprasetya;

import java.util.Scanner;

public class demoSuhu_No1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("------- Program Konversi Suhu -------\n");
        System.out.print("Masukan Angka Suhu : ");

        float angka = scan.nextFloat(); // scan inputan suhu
        konversiSuhu konversiSuhu = new konversiSuhu(); // objek Class konversiSuhu
        System.out.println("\nC → F; F → K; K → R; R → C");
        System.out.print("Celcius ke Fahrenheit\t= " + konversiSuhu.Celcius_ke_Fahrenheit(angka)); // memanggil fungsi dari method di class konversiSuhu
        System.out.print("\nFahrenheit ke Kelvin\t= " + konversiSuhu.Fahrenheit_ke_Kelvin(angka));// memanggil fungsi dari method di class konversiSuhu
        System.out.print("\nKelvin ke Reamur\t\t= " + konversiSuhu.Kelvin_ke_Reamur(angka));// memanggil fungsi dari method di class konversiSuhu
        System.out.print("\nReamur ke Celcius\t\t= " + konversiSuhu.Reamur_ke_Celcius(angka));// memanggil fungsi dari method di class konversiSuhu
    }
}

