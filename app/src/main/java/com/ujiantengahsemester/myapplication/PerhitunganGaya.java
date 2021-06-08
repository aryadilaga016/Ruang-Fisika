package com.ujiantengahsemester.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class PerhitunganGaya extends AppCompatActivity {
    private EditText massabenda, percepatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perhitungan_gaya);

        massabenda = (EditText) findViewById(R.id.massabendagaya);
        percepatan = (EditText) findViewById(R.id.percepatanGY);

    }

    public void buttonHandler (View view) {
        final double m, a, F;
        if (massabenda.getText().length() == 0){
            Toast.makeText(this, "angka tidak boleh kosong!", Toast.LENGTH_LONG).show();
            return;
        }

        m = Double.parseDouble(massabenda.getText().toString());
        a= Double.parseDouble(percepatan.getText().toString());

        F = m*a;

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Hasil Perhitungan Gaya");
        builder.setMessage("Hasil = "+String.valueOf(F)+"N").setPositiveButton("OK",
                (dialog, which) -> {
                    massabenda.setText("");
                    percepatan.setText("");
                    dialog.dismiss();
                });

        AlertDialog dialoghasil = builder.create();
        dialoghasil.show();
    }

}
