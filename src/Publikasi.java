/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.File;

/**
 *
 * @author Rahmadika Kemala Salsabiela 
 */
public class Publikasi {
    private String judul;
    private String nomorKatalog;
    private String nomorPublikasi;
    private String issnIsbn;
    private String tanggalRilis;
    private String ukuranFile; 
    private String abstraksi;
    private String namaFile; 

    public Publikasi() {}

    public Publikasi(String judul, String nomorKatalog, String nomorPublikasi, String issnIsbn, String tanggalRilis, String ukuranFile, String abstraksi, String namaFile) {
        this.judul = judul;
        this.nomorKatalog = nomorKatalog;
        this.nomorPublikasi = nomorPublikasi;
        this.issnIsbn = issnIsbn;
        this.tanggalRilis = tanggalRilis;
        this.ukuranFile = ukuranFile;
        this.abstraksi = abstraksi;
        this.namaFile = namaFile;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getNomorKatalog() {
        return nomorKatalog;
    }

    public void setNomorKatalog(String nomorKatalog) {
        this.nomorKatalog = nomorKatalog;
    }

    public String getNomorPublikasi() {
        return nomorPublikasi;
    }

    public void setNomorPublikasi(String nomorPublikasi) {
        this.nomorPublikasi = nomorPublikasi;
    }

    public String getIssnIsbn() {
        return issnIsbn;
    }

    public void setIssnIsbn(String issnIsbn) {
        this.issnIsbn = issnIsbn;
    }

    public String getTanggalRilis() {
        return tanggalRilis;
    }

    public void setTanggalRilis(String tanggalRilis) {
        this.tanggalRilis = tanggalRilis;
    }

    public String getUkuranFile() {
        return ukuranFile;
    }

    public void setUkuranFile(String ukuranFile) {
        this.ukuranFile = ukuranFile;
    }

    public String getAbstraksi() {
        return abstraksi;
    }

    public void setAbstraksi(String abstraksi) {
        this.abstraksi = abstraksi;
    }

    public String getNamaFile() {
        return namaFile;
    }

    public void setNamaFile(String namaFile) {
        this.namaFile = namaFile;
    }
    
    @Override
    public String toString() {
        return "Judul: " + judul + ", Nomor Katalog: " + nomorKatalog + ", Nomor Publikasi: " + nomorPublikasi +
                ", ISSN/ISBN: " + issnIsbn + ", Tanggal Rilis: " + tanggalRilis + ", Ukuran File: " + ukuranFile +
                ", Abstraksi: " + abstraksi + ", Nama File: " + namaFile;
    }

    
    
}