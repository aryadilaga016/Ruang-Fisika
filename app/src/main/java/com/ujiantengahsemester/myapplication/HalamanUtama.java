package com.ujiantengahsemester.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HalamanUtama extends AppCompatActivity implements View.OnClickListener {

    public CardView cardgravitasi, cardtekanan, cardenergi, carddaya, cardpercepatan, cardmassa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_utama);
        getSupportActionBar().setTitle("Ruang Fisika");

        cardgravitasi = (CardView) findViewById(R.id.cv_gravitasi);
        cardtekanan = (CardView) findViewById(R.id.cv_tekanan);
        cardenergi = (CardView) findViewById(R.id.cv_energi);
        carddaya = (CardView) findViewById(R.id.cv_daya);
        cardpercepatan = (CardView) findViewById(R.id.cv_percepatan);
        cardmassa = (CardView) findViewById(R.id.cv_massa);

        cardgravitasi.setOnClickListener(this);
        cardtekanan.setOnClickListener(this);
        cardenergi.setOnClickListener(this);
        carddaya.setOnClickListener(this);
        cardpercepatan.setOnClickListener(this);
        cardmassa.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cv_gravitasi :
                i = new Intent(this,Gravitasi.class);
                startActivity(i);
                break;

            case R.id.cv_tekanan :
                i = new Intent(this,Tekanan.class);
                startActivity(i);
                break;

            case R.id.cv_energi :
                i = new Intent(this,Energi.class);
                startActivity(i);
                break;

            case R.id.cv_daya :
                i = new Intent(this,Daya.class);
                startActivity(i);
                break;

            case R.id.cv_percepatan :
                i = new Intent(this,Percepatan.class);
                startActivity(i);
                break;

            case R.id.cv_massa :
                i = new Intent(this,Massa.class);
                startActivity(i);
                break;
        }

    }
}
