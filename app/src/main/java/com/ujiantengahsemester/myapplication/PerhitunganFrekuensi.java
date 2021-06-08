package com.ujiantengahsemester.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class PerhitunganFrekuensi extends AppCompatActivity {
    private EditText jumlah, waktu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perhitungan_frekuensi);

        jumlah = (EditText) findViewById(R.id.jmlgetaran);
        waktu = (EditText) findViewById(R.id.waktu);
    }

    public void buttonHandler (View view){
        final double n, t, f;
        if (jumlah.getText().length() == 0){
            Toast.makeText(this, "angka tidak boleh kosong!", Toast.LENGTH_LONG).show();
            return;
        }

        //konversi dari inputan objek->string dan string->Double
        n = Double.parseDouble(jumlah.getText().toString());
        t = Double.parseDouble(waktu.getText().toString());

        //proses perhitungan frekuensi
        f = n/t;

        //proses menampilkan hasil perhitungan frekuensi dalam AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Hasil Menghitung Frekuensi");
        builder.setMessage("Hasil = "+String.valueOf(f)).setPositiveButton("OK",
                (dialog, which) -> {
                    jumlah.setText("");
                    waktu.setText("");
                    dialog.dismiss();
                });

        AlertDialog dialoghasil = builder.create();
        dialoghasil.show();

    }

}
