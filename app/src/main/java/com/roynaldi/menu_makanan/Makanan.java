package com.roynaldi.menu_makanan;

public class Makanan {

    private String nama, deskripsi, harga;
    private int gambar;


    public Makanan(String nama, String deskripsi, int gambar, String harga) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}

