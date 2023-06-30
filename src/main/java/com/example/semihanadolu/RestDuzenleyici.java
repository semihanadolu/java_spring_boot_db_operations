package com.example.semihanadolu;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestDuzenleyici {

@Autowired
MisafirRepo misafirRepo;


@PostMapping("/ekle")
public Misafir ekle(@RequestBody MisafirYardimci my){
    Misafir misafir = new Misafir();
    misafir.setKilo(my.getKilo());
    misafir.setYas(my.getYas());
    misafir.setNotlar(my.getNotlar());
    misafir.setMisafirAd(my.getMisafirAd());
    misafir.setGelisTarihi(my.getGelisTarihi());
    misafir = misafirRepo.save(misafir);
    return misafir;

}


@GetMapping("/getir/{id}")
public Misafir getir(@PathVariable int id){
        return misafirRepo.findById(id).get();
    }

@DeleteMapping("/sil/{id}")
public String sil(@PathVariable int id){
     misafirRepo.deleteById(id);
    return "kayıt silindi";
    }

@PutMapping("/guncelle/{id}")
public Misafir guncelle(@PathVariable int id, @RequestBody MisafirYardimci my){
    Misafir misafir = getir(id);
    misafir.setKilo(my.getKilo());
    misafir.setYas(my.getYas());
    misafir.setNotlar(my.getNotlar());
    misafir.setMisafirAd(my.getMisafirAd());
    misafir.setGelisTarihi(my.getGelisTarihi());
    misafir = misafirRepo.save(misafir);
    return misafir;
    }

@GetMapping("/listele")
public List<Misafir> listele(){
        return misafirRepo.findAll();
    }

}

