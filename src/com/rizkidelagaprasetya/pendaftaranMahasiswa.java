package com.rizkidelagaprasetya;


public class pendaftaranMahasiswa {
    // variable static
    private String nama;
    private  int tanggalLahir;
    private String gender;
    private String asal;

    // constructor
    public pendaftaranMahasiswa() {

    }

    // getter & setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }
}
