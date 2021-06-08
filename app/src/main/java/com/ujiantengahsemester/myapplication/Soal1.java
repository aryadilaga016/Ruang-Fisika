package com.ujiantengahsemester.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;

public class Soal1 extends AppCompatActivity{

    TextView kuis;
    RadioGroup rg;
    RadioButton PilihanA, PilihanB, PilihanC, PilihanD;
    int nomor = 0;
    public static int hasil, benar, salah;

    //pertanyaan
    String[] pertanyaan_kuis = new String[]{
            "1. Kelompok besaran berikut yang merupakan besaran turunan adalah?",
            "2. Sebuah peti didorong oleh gaya horizontal sebesar 40 N hingga bergeser sejauh 2 m. Usaha terhadap peti adalah?",
            "3. Lampu berdaya 25 watt dinyalakan selama 15 menit. energi yang diperlukan untuk menyalakan lampu tersebut adalah?",
            "4. jika Bumi menyusut menjadi setengah semula, tapi massanya tetap, maka apa yang terjadi dengan massa benda-benda yang ada di permukaan bumi?",
            "5. Benda A bergetar 75 getaran tiap sekon, dan benda B bergetar 60 getaran tiap sekon. Perbandingan frekuensi benda A dengan benda B adalah?"
    };

    //pilihan jawaban a, b, c, d
    String[] pilihan_jawaban = new String[]{
            "momentum, waktu dan kuat arus", "kecepatan usaha dan massa", "percepatan, usaha, dan massa jenis", "berat, panjang dan massa",
            "45 J", "65 J", "80 J", "85 J",
            "22.500 J", "21.600 J", "20.500 J", "19.400 J",
            "massa benda tetap", "berat benda tetap", "berat benda setengah dari semula", "massa benda setengah kali semula",
            "6 : 7", "4 : 5", "3 : 5", "5 : 4"
    };

    //jawaban benar
    String[] jawaban_benar = new String[]{
            "percepatan, usaha, dan massa jenis",
            "80 J",
            "22.500 J",
            "massa benda tetap",
            "5 : 4"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soal1);

        kuis = (TextView) findViewById(R.id.soal1);
        rg = (RadioGroup) findViewById(R.id.pilihan);
        PilihanA = (RadioButton) findViewById(R.id.pilihanA);
        PilihanB = (RadioButton) findViewById(R.id.pilihanB);
        PilihanC = (RadioButton) findViewById(R.id.pilihanC);
        PilihanD = (RadioButton) findViewById(R.id.pilihanD);

        kuis.setText(pertanyaan_kuis[nomor]);
        PilihanA.setText(pilihan_jawaban[0]);
        PilihanB.setText(pilihan_jawaban[1]);
        PilihanC.setText(pilihan_jawaban[2]);
        PilihanD.setText(pilihan_jawaban[3]);

        rg.check(0);
        benar = 0;
        salah = 0;
    }

    public void next(View view) {

        if (PilihanA.isChecked() || PilihanB.isChecked() || PilihanC.isChecked() || PilihanD.isChecked()) {

            RadioButton jawaban_user = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
            String ambil_jawaban_user = jawaban_user.getText().toString();
            rg.check(0);
            if (ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor])) benar++;
            else salah++;
            nomor++;
            if (nomor < pertanyaan_kuis.length) {
                kuis.setText(pertanyaan_kuis[nomor]);
                PilihanA.setText(pilihan_jawaban[(nomor * 4) + 0]);
                PilihanB.setText(pilihan_jawaban[(nomor * 4) + 1]);
                PilihanC.setText(pilihan_jawaban[(nomor * 4) + 2]);
                PilihanD.setText(pilihan_jawaban[(nomor * 4) + 3]);

            } else {
                hasil = benar * 20;
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("HASIL TEST");
                builder.setMessage("Nilai test kamu adalah " + String.valueOf(hasil)).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Soal1.this.finish();
                    }
                })
                        .show();
            }
        } else {
            Toast.makeText(this, "Jawaban tidak boleh kosong", Toast.LENGTH_LONG).show();
        }
    }
}

