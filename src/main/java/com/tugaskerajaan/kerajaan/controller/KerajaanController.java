package com.tugaskerajaan.kerajaan.controller;

import com.tugaskerajaan.kerajaan.model.Kerajaan;
import com.tugaskerajaan.kerajaan.service.KerajaanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kerajaan")
public class KerajaanController {

//    Autowired Memanggil file dalam pakcage
    @Autowired
    private KerajaanService kerajaanService;

//    PostMapping Menambahkan Data
    @PostMapping
    public Kerajaan addKerajaan(@RequestBody Kerajaan kerajaan){
        return kerajaanService.addKerajaan(kerajaan);
    }

//    GetMapping Menampilkan data yang telah di tambahkan sebelumnya sesuai id
    @GetMapping("/{id}")
    public  Kerajaan getKerajaanByIdById(@PathVariable("id") Long id){
        return kerajaanService.getKerajaanById(id);
    }

//    PutMapping Edit Data Yang di pilih Sesuai id
    @PutMapping("/{id}")
    public  Kerajaan editKerajaanById(@PathVariable("id") Long id,@RequestBody Kerajaan kerajaan){
        return  kerajaanService.editKerajaanById(id,kerajaan.getNamaHindu(),kerajaan.getLetak(),kerajaan.getTahunBerdiri(),kerajaan.getRajaTerkenal(),kerajaan.getPeninggalanSejarah());
    }

//    fungsi ini sama yang membedakan adalah menampilkan semua data yang di tambahkan sesuai dengan pemanggilan
    @GetMapping("/all")
    public List<Kerajaan> getAllKerajaan(){
        return kerajaanService.getAllKerajaan();
    }

//    DElete Mapping Untuk Menghapus data sesuai id
    @DeleteMapping("/{id}")
    public void deleteSekolahById(@PathVariable("id") Long id){
        kerajaanService.deleteKerajaanById(id);
    }

}
