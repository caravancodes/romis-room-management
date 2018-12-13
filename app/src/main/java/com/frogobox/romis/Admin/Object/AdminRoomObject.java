package com.frogobox.romis.Admin.Object;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * Romis
 * Copyright (C) 19/07/2018.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Line     : bullbee117
 * Phone    : 081357108568
 * Majors   : D3 Teknik Informatika 2016
 * Campus   : Telkom University
 * -----------------------------------------
 * id.amirisback.frogobox
 */
public class AdminRoomObject {

    private String namaRuang, kapasitas, posisi;
    private int foto;

    public String getNamaRuang() {
        return namaRuang;
    }

    public void setNamaRuang(String namaRuang) {
        this.namaRuang = namaRuang;
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public AdminRoomObject(String namaRuang, String kapasitas, String posisi, int foto) {
        this.namaRuang = namaRuang;
        this.kapasitas = kapasitas;
        this.posisi = posisi;
        this.foto = foto;



    }
}
