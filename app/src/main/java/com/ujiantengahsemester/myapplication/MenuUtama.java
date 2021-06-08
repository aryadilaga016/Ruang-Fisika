package com.ujiantengahsemester.myapplication;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MenuUtama extends AppCompatActivity {

    public ImageButton perhitungan;
    public ImageButton materi;
    public ImageButton Test;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.menu_utama);

            perhitungan = findViewById(R.id.rumus);
            materi = findViewById(R.id.materifisika);
            Test = findViewById(R.id.testfisika);

            perhitungan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent perhitungan = new Intent(MenuUtama.this, Perhitungan.class);
                    startActivity(perhitungan);
                }
            });

            materi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent materi = new Intent(MenuUtama.this, HalamanUtama.class);
                    startActivity(materi);
                }
            });

            Test.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent Test = new Intent(MenuUtama.this, TestFisika.class);
                    startActivity(Test);
                }
            });
        }


}

