package com.ujiantengahsemester.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class PerhitunganPeriode extends AppCompatActivity {
    private EditText jmlgetaran, waktu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perhitungan_periode);

        jmlgetaran = (EditText) findViewById(R.id.jmlgetaranperiode);
        waktu = (EditText) findViewById(R.id.waktuperiode);
    }
    public void buttonHandler (View view) {
        final double T, n, t;
        if (jmlgetaran.getText().length() == 0){
            Toast.makeText(this, "angka tidak booleh kosong", Toast.LENGTH_LONG).show();
            return;
        }

        n = Double.parseDouble(jmlgetaran.getText().toString());
        t = Double.parseDouble(waktu.getText().toString());

        T = t/n;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Hasil Perhitungan Periode");
        builder.setMessage("Hasil ="+String.valueOf(T)).setPositiveButton("OK",
                (dialog, which) -> {
                    jmlgetaran.setText("");
                    waktu.setText("");
                    dialog.dismiss();
                });
        AlertDialog dialoghasil = builder.create();
        dialoghasil.show();
    }
}
