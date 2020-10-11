package com.rizkidelagaprasetya;


// class untuk membuat fungsi-fungsi yang akan di panggil di class demoSuhu
public class konversiSuhu {
    // method untuk mengkonversi suhu dari Celcius_ke_Fahrenheit
    public float Celcius_ke_Fahrenheit (Float suhuAwal){
        return (suhuAwal * 9/5 + 32);
    }

    // method untuk mengkonversi suhu dari Fahrenheit_ke_Kelvin
    public float Fahrenheit_ke_Kelvin(float suhuAwal){
        return 273.15f + ((suhuAwal - 32.0f) * (5.0f/9.0f));
    }

    // method untuk mengkonversi suhu dari Kelvin_ke_Reamur
    public float Kelvin_ke_Reamur(float suhuAwal){
        float hasil = (float) ((suhuAwal - 273.15) * 4/5);
        return (hasil);
    }

    // method untuk mengkonversi suhu dari Reamur_ke_Celcius
    public float Reamur_ke_Celcius(float suhuAwal){
        return (suhuAwal * 5/4);
    }
}