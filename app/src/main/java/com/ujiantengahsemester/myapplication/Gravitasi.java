package com.ujiantengahsemester.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Gravitasi extends AppCompatActivity {

    ImageView ivGravitasi;
    TextView tvGravitasi1;
    TextView tvGravitasi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gravitasi);

        ivGravitasi = findViewById(R.id.ivGravitasi);
        tvGravitasi1 = findViewById(R.id.tvGravitasi1);
        tvGravitasi2 = findViewById(R.id.tvGravitasi2);
    }
}