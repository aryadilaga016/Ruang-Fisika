package com.ujiantengahsemester.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class PerhitunganDaya extends AppCompatActivity {
    private EditText usaha, waktu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perhitungan_daya);

        usaha = (EditText) findViewById(R.id.usaha);
        waktu = (EditText) findViewById(R.id.waktudaya);
    }

    public void buttonHandler (View view) {
        final double W, t, P;
        if (usaha.getText().length() == 0){
            Toast.makeText(this, "angka tidak boleh kosong!", Toast.LENGTH_LONG).show();
            return;
        }

        W= Double.parseDouble(usaha.getText().toString());
        t= Double.parseDouble(waktu.getText().toString());

        P = W/t;

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Hasil Perhitungan Daya");
        builder.setMessage("Hasil = "+String.valueOf(P)+"Watt").setPositiveButton("OK",
                (dialog, which) ->{
                    usaha.setText("");
                    waktu.setText("");
                    dialog.dismiss();
                });

        AlertDialog dialoghasil = builder.create();
        dialoghasil.show();


    }
}
