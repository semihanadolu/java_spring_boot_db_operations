package com.example.semihanadolu;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Misafir {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String misafirAd;
    Integer yas;
    Double kilo;
    LocalDate gelisTarihi;
    String notlar;
}
