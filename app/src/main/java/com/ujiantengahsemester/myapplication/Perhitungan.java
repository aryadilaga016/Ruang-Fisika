package com.ujiantengahsemester.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Perhitungan extends AppCompatActivity implements View.OnClickListener{
    public CardView cardenergipotensial, cardfrekuensi, cardgaya, carddaya, cardmomentum, cardperiode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perhitungan);

        cardenergipotensial = (CardView) findViewById(R.id.cv_energi_potensial);
        cardfrekuensi = (CardView) findViewById(R.id.cv_frekuensi);
        cardgaya = (CardView) findViewById(R.id.cv_gaya);
        carddaya = (CardView) findViewById(R.id.cv_perhitungandaya);
        cardmomentum = (CardView) findViewById(R.id.cv_momentum);
        cardperiode = (CardView) findViewById(R.id.cv_periode);

        cardenergipotensial.setOnClickListener(this);
        cardfrekuensi.setOnClickListener(this);
        cardgaya.setOnClickListener(this);
        carddaya.setOnClickListener(this);
        cardmomentum.setOnClickListener(this);
        cardperiode.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent perhitungan;

        switch (v.getId()) {
            case R.id.cv_energi_potensial :
                perhitungan = new Intent(this,PerhitunganEnergiPotensial.class);
                startActivity(perhitungan);
                break;

            case R.id.cv_frekuensi :
                perhitungan = new Intent(this,PerhitunganFrekuensi.class);
                startActivity(perhitungan);
                break;

            case R.id.cv_gaya :
                perhitungan = new Intent(this,PerhitunganGaya.class);
                startActivity(perhitungan);
                break;

            case R.id.cv_perhitungandaya :
                perhitungan = new Intent(this,PerhitunganDaya.class);
                startActivity(perhitungan);
                break;

            case R.id.cv_momentum :
                perhitungan = new Intent(this,PerhitunganMomentum.class);
                startActivity(perhitungan);
                break;

            case R.id.cv_periode :
                perhitungan = new Intent(this,PerhitunganPeriode.class);
                startActivity(perhitungan);
                break;
        }

    }
}

