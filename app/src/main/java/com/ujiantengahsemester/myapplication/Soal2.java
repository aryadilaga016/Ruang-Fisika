package com.ujiantengahsemester.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Soal2 extends AppCompatActivity {
    TextView kuis;
    RadioGroup rg;
    RadioButton PilihanA, PilihanB, PilihanC, PilihanD;
    int nomor = 0;
    public static int hasil, benar, salah;

    //pertanyaan
    String[] pertanyaan_kuis = new String[]{
            "1. Berat benda di Bumi adalah 10 N. Jika benda tersebut berada di suatu planet yang memiliki massa 4 kali massa bumi dan dengan jari-jari 2 kali lipat jari-jari bumi, maka berat benda tersebut berubah menjadi?",
            "2. Ukuran panas atau dinginnya suatu benda disebut dengan?",
            "3. Besaran yang tidak mempengaruhi kalor yang diperlukan untuk menaikkan suhu benda adalah?",
            "4. Bunyi hukum kekekalan momentum adalah?",
            "5. Tekanan hidrostatik dipengaruhi oleh?"
    };

    //pilihan jawaban a, b, c, d
    String[] pilihan_jawaban = new String[]{
            "10 N", "15 N", "20 N", "30 N",
            "Kalor", "Thermometrik", "Suhu", "Titik Lebur",
            "massa benda", "jenis benda", "kecepatan benda", "perubahan suhu",
            "Momentum sebelum tabrakan selalu berkurang", "Momentum sebelum dan sesudah tabrakan selalu meningkat", " Momentum sebelum dan sesudah tabrakan selalu menurun", "Momentum sebelum dan sesudah tabrakan adalah tetap",
            "zat cair", "akselerasi", "Massa benda", "kecepatan"
    };

    //jawaban benar
    String[] jawaban_benar = new String[]{
            "10 N",
            "Suhu",
            "kecepatan benda",
            "Momentum sebelum dan sesudah tabrakan adalah tetap",
            "zat cair"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soal2);

        kuis = (TextView) findViewById(R.id.soal2);
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
                        Soal2.this.finish();
                    }
                })
                        .show();
            }
        } else {
            Toast.makeText(this, "Jawaban tidak boleh kosong", Toast.LENGTH_LONG).show();
        }
    }

}
