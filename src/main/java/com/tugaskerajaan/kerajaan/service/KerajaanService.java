package com.tugaskerajaan.kerajaan.service;

import com.tugaskerajaan.kerajaan.model.Kerajaan;


import java.util.List;

//   Add Untuk Menambahkan data
public interface KerajaanService {
    Kerajaan addKerajaan(Kerajaan sekolah);

//    get untuk menampilkan data
    Kerajaan getKerajaanById(Long id);

//    Untuk List MEnampilkan Semua data yang di inputkan
    List<Kerajaan> getAllKerajaan();

//    Untuk menhapus data
    void deleteKerajaanById(Long id);

//    Untuk edit data tersebut
    Kerajaan editKerajaanById(Long id, String namaHindu, String letak, String tahunBerdiri, String rajaTerkenal, String peninggalanSejarah);
}
