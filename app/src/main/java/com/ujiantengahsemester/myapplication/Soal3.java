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

public class Soal3 extends AppCompatActivity {
    TextView kuis;
    RadioGroup rg;
    RadioButton PilihanA, PilihanB, PilihanC, PilihanD;
    int nomor = 0;
    public static int hasil, benar, salah;

    //pertanyaan
    String[] pertanyaan_kuis = new String[]{
            "1. Besaran pokok panjang dapat diturunkan menjadi?",
            "2. Kadek berjalan kaki dengan kecepatan rata – rata nya 1,5 meter per detik. Maka, berapakah jarak yang ditempuh setelah 2 jam berjalan?",
            "3. Sebuah benda meluncur di atas papan kasar sejauh 7 m. Jika benda mendapatkan gesekan dengan papan sebesar 120 N, tentukan besarnya usaha yang dilakukan gaya gesek tersebut!",
            "4. Sebuah benda bermassa  5 kg jatuh bebas dari ketinggian 2 m di hamparan pasir. Jika benda masuk sedalam 2 cm ke dalam pasir sebelum berhenti, tentukan gaya gesek yang dilakukan pasir terhadap benda!",
            "5. objek yang memungkinkan untuk dibentuk kembali setelah pemindahan gaya pada objek disebut?"
    };

    //pilihan jawaban a, b, c, d
    String[] pilihan_jawaban = new String[]{
            "volume dan kuat arus listrik", "luas dan tegangan", "volume dan gaya", "luas dan volume",
            "10,8 km", "10,5 km", "10 km", "11 km",
            "850 J", "820 J", "840 J", "800 J",
            "6.000 N", "5.000 N", "7.000 N", "4.000 N",
            "renggangan", "emisivitas", "tegangan", "elastisitas"
    };

    //jawaban benar
    String[] jawaban_benar = new String[]{
            "luas dan volume",
            "10,8 km",
            "840 J",
            "5000 N",
            "elastisitas"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soal3);

        kuis = (TextView) findViewById(R.id.soal3);
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
                        Soal3.this.finish();
                    }
                })
                        .show();
            }
        } else {
            Toast.makeText(this, "Jawaban tidak boleh kosong", Toast.LENGTH_LONG).show();
        }
    }
}

