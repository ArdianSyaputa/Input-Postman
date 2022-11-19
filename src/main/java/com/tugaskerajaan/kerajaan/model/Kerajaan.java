package com.tugaskerajaan.kerajaan.model;

import javax.persistence.*;

@Entity
@Table(name = "Kerajaan")
public class Kerajaan {
//    Untuk id Tersebut Akan Membuat Auto Increment/otomatis terisi
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    Column Untuk Menambahkan Header Data/Data yang di inginkan
    @Column(name = "namaHindu")
    private String namaHindu;

//    Column Untuk Menambahkan Header Data/Data yang di inginkan
    @Column(name = "letak")
    private String letak;

//     Column Untuk Menambahkan Header Data/Data yang di inginkan
    @Column(name = "tahunBerdiri")
    private String tahunBerdiri;

//     Column Untuk Menambahkan Header Data/Data yang di inginkan
    @Column(name = "rajaTerkenal")
    private String rajaTerkenal;

//     Column Untuk Menambahkan Header Data/Data yang di inginkan
    @Column(name = "peninggalanSejarah")
    private String peninggalanSejarah;

//    Di Sini Untuk id menggunakan constructor
    public Kerajaan() {
    }

//    Dan Untuk Column Seluruh nya menggunakan getter dan setter
    public String getNamaHindu() {
        return namaHindu;
    }

    public void setNamaHindu(String namaHindu) {
        this.namaHindu = namaHindu;
    }

    public String getLetak() {
        return letak;
    }

    public void setLetak(String letak) {
        this.letak = letak;
    }

    public String getTahunBerdiri() {
        return tahunBerdiri;
    }

    public void setTahunBerdiri(String tahunBerdiri) {
        this.tahunBerdiri = tahunBerdiri;
    }

    public String getRajaTerkenal() {
        return rajaTerkenal;
    }

    public void setRajaTerkenal(String rajaTerkenal) {
        this.rajaTerkenal = rajaTerkenal;
    }

    public String getPeninggalanSejarah() {
        return peninggalanSejarah;
    }

    public void setPeninggalanSejarah(String peninggalanSejarah) {
        this.peninggalanSejarah = peninggalanSejarah;
    }

//    menggunakan to string agar colum yang di inginkan terpanggil
    @Override
    public String toString() {
        return "Kerajaan{" +
                "id=" + id +
                ", namaHindu='" + namaHindu + '\'' +
                ", letak='" + letak + '\'' +
                ", tahunBerdiri='" + tahunBerdiri + '\'' +
                ", rajaTerkenal='" + rajaTerkenal + '\'' +
                ", peninggalanSejarah='" + peninggalanSejarah + '\'' +
                '}';
    }
}