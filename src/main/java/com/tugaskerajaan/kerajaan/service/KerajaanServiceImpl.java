package com.tugaskerajaan.kerajaan.service;

import com.tugaskerajaan.kerajaan.model.Kerajaan;
import com.tugaskerajaan.kerajaan.repository.KerajaanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class KerajaanServiceImpl implements KerajaanService {
//Dan di sini untuk repository sebelum nya di panggil agar bisa berfungsi
    @Autowired
    private KerajaanRepository kerajaanRepository;

// Overide Seluruh Nya Agar Bisa masuk ke dalam Data Header
    @Override
    public Kerajaan addKerajaan(Kerajaan kerajaan){
        return kerajaanRepository.save(kerajaan);
    }

    @Override
    public Kerajaan getKerajaanById(Long id) {
        return kerajaanRepository.findById(id).get();
    }

//    Semua Colum yang di tambahkan Agarv terpanggil yang di dalam package model
    @Override
    public  Kerajaan editKerajaanById(Long id, String namaHindu, String letak,String tahunBerdiri,String rajaTerkenal, String peninggalanSejarah){
        Kerajaan kerajaan = kerajaanRepository.findById(id).get();
     kerajaan.setNamaHindu(namaHindu);
     kerajaan.setLetak(letak);
     kerajaan.setTahunBerdiri(tahunBerdiri);
     kerajaan.setRajaTerkenal(rajaTerkenal);
     kerajaan.setPeninggalanSejarah(peninggalanSejarah);
        return  kerajaanRepository.save(kerajaan);
    }
    @Override
    public  List<Kerajaan> getAllKerajaan(){
        return kerajaanRepository.findAll();
    }

    @Override
    public void deleteKerajaanById(Long id){
        kerajaanRepository.deleteById(id);
    }
}
