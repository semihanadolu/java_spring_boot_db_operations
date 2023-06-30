package com.example.semihanadolu;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MisafirYardimci {
    String misafirAd;
    Integer yas;
    Double kilo;
    LocalDate gelisTarihi;
    String notlar;
}
