/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dealer;

/**
 *
 * @author D-4
 */
public class Dealer {
    private final String nama;
    private final MobilBaru mobilBaru;
    private final MobilBekas mobilBekas;

    public Dealer(String nama, MobilBaru mobilBaru, MobilBekas mobilBekas){
        this.nama = nama;
        this.mobilBaru = mobilBaru;
        this.mobilBekas = mobilBekas;
    }

    public String getNama() {
        return nama;
    }

    public void info() {
        System.out.println("Dealer: " + nama);
        mobilBaru.info();
        mobilBekas.info();
    }
}