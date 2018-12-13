package com.frogobox.romis.Admin.Object;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * Romis
 * Copyright (C) 18/07/2018.
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
public class AdminMemberObject {

    private String nama, id;
    private int foto;

    public AdminMemberObject(String nama, String id, int foto) {
        this.nama = nama;
        this.id = id;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
