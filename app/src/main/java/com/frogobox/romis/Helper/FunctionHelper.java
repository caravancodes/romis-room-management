package com.frogobox.romis.Helper;

import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * Romis
 * Copyright (C) 15/07/2018.
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

public class FunctionHelper {

    // Requirement Random Karakter -----------------------------------------------------------------
    private char[] chars = "1234567890".toCharArray();
    private StringBuilder stringBuilder = new StringBuilder();
    private Random random = new Random();
    private String randomChar;
    // ---------------------------------------------------------------------------------------------

    // Requirement Tanggal dan Waktu ---------------------------------------------------------------
    private Calendar currentTime;
    private String outputStringTime, dateToday, nilai_jam, nilai_menit, nilai_detik, nol_jam = "", nol_menit = "",nol_detik = "";
    private int systemJam, systemMenit, systemDetik, sumWaktuDetik, systemYear;
    private final int jamKeDetik = 3600;
    private final int menitKeDetik = 60;
    private final int detikKeMili = 1000;
    // ---------------------------------------------------------------------------------------------

    public FunctionHelper() {
        this.currentTime = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
        this.dateToday = simpleDateFormat.format(currentTime.getTime());
    }

    // Method Random Character ---------------------------------------------------------------------
    public String getRandomChar() {
        for (int lenght = 0; lenght < 5; lenght++) {
            Character character = chars[random.nextInt(chars.length)];
            stringBuilder.append(character);
        }
        randomChar = stringBuilder.toString();
        stringBuilder.delete(0, 5);
        return randomChar;
    }
    // ---------------------------------------------------------------------------------------------

    public String getDateToday() {
        return dateToday;
    }

    // ---------------------------------------------------------------------------------------------
    public String getOutputStringTime() {
        outputStringTime = nilai_jam + ":" + nilai_menit;
        return outputStringTime;
    }
    // ---------------------------------------------------------------------------------------------

    public void getPureSystemTime() {
        // Skala Waktu 24 Jam ----------------------------------------------------------------------
        Calendar cal = Calendar.getInstance();
        systemYear = cal.get(Calendar.YEAR);
        systemJam = cal.get(Calendar.HOUR_OF_DAY);
        systemMenit = cal.get(Calendar.MINUTE);
        systemDetik = cal.get(Calendar.SECOND);
        // -----------------------------------------------------------------------------------------
    }

    public void getCekFormat(){
        getPureSystemTime(); // skala waktu 24 Jam
        // -----------------------------------------------------------------------------------------
        // Jika waktu itu kurang dari 9 maka akan di tambahkan 0 didepan angkanya
        if(systemJam <= 9) {
            nol_jam = "0";
        } else {

        }
        if(systemMenit <= 9) {
            nol_menit = "0";
        }

        if(systemDetik <= 9) {
            nol_detik = "0";
        }
        // -----------------------------------------------------------------------------------------
    }

    public void getSystemTime() {
        getCekFormat();
        // -----------------------------------------------------------------------------------------
        // Tampilan String dari systemJam, systemMenit, systemDetik Ex : 02 , 05 , 15
        nilai_jam = nol_jam + Integer.toString(systemJam);
        nilai_menit = nol_menit + Integer.toString(systemMenit);
        nilai_detik = nol_detik + Integer.toString(systemDetik);
        // -----------------------------------------------------------------------------------------
    }

    public void getFormatTimePicker(TextView txt_text, int hourInput, int menitInput){
        // -----------------------------------------------------------------------------------------
        String nolMenits = "";
        String nolJams = "";
        if (hourInput <= 9){
            nolJams = "0";
        }

        if (menitInput <= 9){
            nolMenits = "0";
        }
        // -----------------------------------------------------------------------------------------

        // Tampilan String dari systemJam, systemMenit, systemDetik Ex : 02 , 05 , 15
        String NewJam = nolJams + Integer.toString(hourInput);
        String NewMenit = nolMenits + Integer.toString(menitInput);
        // -----------------------------------------------------------------------------------------
        txt_text.setText(NewJam + ":" + NewMenit);
    }

    // ---------------------------------------------------------------------------------------------

    // ---------------------------------------------------------------------------------------------



    public int getSystemJam() {
        return systemJam;
    }

    public int getSystemMenit() {
        return systemMenit;
    }

    public int getSystemYear(){
        return systemYear;
    }

    public int getDetikKeMiliDetik() {
        return detikKeMili;
    }
}