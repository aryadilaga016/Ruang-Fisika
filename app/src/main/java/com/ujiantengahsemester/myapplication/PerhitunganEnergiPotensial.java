package com.ujiantengahsemester.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class PerhitunganEnergiPotensial extends AppCompatActivity {
    private EditText massa, gravitasi, tinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perhitungan_energipotensial);

        massa = (EditText) findViewById(R.id.massabenda);
        gravitasi = (EditText) findViewById(R.id.gravitasi);
        tinggi = (EditText) findViewById(R.id.tinggiEP);
    }

    public void buttonHandler (View view) {
        final double m, g, h, ep;
        if (massa.getText().length() == 0) {
            Toast.makeText(this, "angka tidak boleh kosong!", Toast.LENGTH_LONG).show();
            return;
        } //end if

        //konversi dari inputan objek ->string dan string-> Double
        m = Double.parseDouble(massa.getText().toString());
        g = Double.parseDouble(gravitasi.getText().toString());
        h = Double.parseDouble(tinggi.getText().toString());

        //proses perhitungan
        ep = m*g*h;

        //proses menampilkan hasil perhitungan dalam AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Hasil Perhitungan Energi Potensial");
        builder.setMessage("Hasil = " +String.valueOf(ep)+ "Joule").setPositiveButton("OK",
                (dialog, which) -> {
                    massa.setText("");
                    gravitasi.setText("");
                    tinggi.setText("");
                    dialog.dismiss();
                });
        AlertDialog dialoghasil = builder.create();
        dialoghasil.show();

    }
}
