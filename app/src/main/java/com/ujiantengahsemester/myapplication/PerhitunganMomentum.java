package com.ujiantengahsemester.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class PerhitunganMomentum extends AppCompatActivity {
    private EditText massa, kecepatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perhitungan_momentum);

        massa = (EditText) findViewById(R.id.massabendamomentum);
        kecepatan = (EditText) findViewById(R.id.kecepatan);
    }

    public void buttonHandler (View view) {
        final double m, v, p;
        if (massa.getText().length() == 0) {
            Toast.makeText(this, "angka tidak boleh kosong!", Toast.LENGTH_LONG).show();
            return;
        }

        m = Double.parseDouble(massa.getText().toString());
        v = Double.parseDouble(kecepatan.getText().toString());

        p = m*v;

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Hasil Perhitungan Momentum");
        builder.setMessage("Hasil = "+String.valueOf(p)+"kg m/s").setPositiveButton("OK",
                (dialog, which) -> {
                massa.setText("");
                kecepatan.setText("");
                dialog.dismiss();
                });
        AlertDialog dialoghasil = builder.create();
        dialoghasil.show();

    }
}
