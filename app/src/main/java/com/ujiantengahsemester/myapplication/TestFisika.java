package com.ujiantengahsemester.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class TestFisika extends AppCompatActivity {

    public Button Soal1;
    public Button Soal2;
    public Button Soal3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_perhitungan);

        Soal1 = findViewById(R.id.soal1);
        Soal2 = findViewById(R.id.soal2);
        Soal3 = findViewById(R.id.soal3);

        Soal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Soal1 = new Intent(TestFisika.this, Soal1.class);
                startActivity(Soal1);
            }
        });

        Soal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Soal2 = new Intent(TestFisika.this, Soal2.class);
                startActivity(Soal2);
            }
        });

        Soal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Soal2 = new Intent(TestFisika.this, Soal3.class);
                startActivity(Soal2);
            }
        });
    }
}
