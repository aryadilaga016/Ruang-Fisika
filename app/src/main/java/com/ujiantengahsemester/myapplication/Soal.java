package com.ujiantengahsemester.myapplication;

import android.widget.RadioButton;

public class Soal {
    int id_pertanyaan;
    String pertanyaan;
    RadioButton pilihan_a;
    RadioButton pilihan_b;
    RadioButton pilihan_c;
    RadioButton pilihan_d;

    public int getId_pertanyaan() {
        return id_pertanyaan;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public RadioButton getPilihan_a() {
        return pilihan_a;
    }

    public RadioButton getPilihan_b() {
        return pilihan_b;
    }

    public RadioButton getPilihan_c() {
        return pilihan_c;
    }

    public RadioButton getPilihan_d() {
        return pilihan_d;
    }

    public Soal (int id_pertanyaan_in,
                 String pertanyaan_in,
                 RadioButton pilihan_a_in,
                 RadioButton pilihan_b_in,
                 RadioButton pilihan_c_in,
                 RadioButton pilihan_d_in) {
        this.id_pertanyaan = id_pertanyaan_in;
        this.pertanyaan = pertanyaan_in;
        this.pilihan_a = pilihan_a_in;
        this.pilihan_b = pilihan_b_in;
        this.pilihan_c = pilihan_c_in;
        this.pilihan_d = pilihan_d_in;

    }


}
