package com.frogobox.romis.User.Object;

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
public class UserWaitingListObject {

    String namaRuang, agenda, namaUser, waktuAwal, waktuAkhir, noTelp, date, note, status;

    public UserWaitingListObject(String namaRuang, String agenda, String namaUser, String waktuAwal, String waktuAkhir, String noTelp, String date, String note, String status) {
        this.namaRuang = namaRuang;
        this.agenda = agenda;
        this.namaUser = namaUser;
        this.waktuAwal = waktuAwal;
        this.waktuAkhir = waktuAkhir;
        this.noTelp = noTelp;
        this.date = date;
        this.note = note;
        this.status = status;
    }

    public String getNamaRuang() {
        return namaRuang;
    }

    public void setNamaRuang(String namaRuang) {
        this.namaRuang = namaRuang;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public String getWaktuAwal() {
        return waktuAwal;
    }

    public void setWaktuAwal(String waktuAwal) {
        this.waktuAwal = waktuAwal;
    }

    public String getWaktuAkhir() {
        return waktuAkhir;
    }

    public void setWaktuAkhir(String waktuAkhir) {
        this.waktuAkhir = waktuAkhir;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

