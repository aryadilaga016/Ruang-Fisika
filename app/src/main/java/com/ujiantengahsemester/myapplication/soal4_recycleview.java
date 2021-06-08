package com.ujiantengahsemester.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class soal4_recycleview extends AppCompatActivity {

    RecyclerView recyclerView;
    SoalAdapter soalAdapter;

    ArrayList<Soal> soalArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal4_recycleview);

        recyclerView = findViewById(R.id.recycleview_soal4);

        setRecycleView_soal4();

    }

    private void setRecycleView_soal4() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        soalAdapter = new SoalAdapter(this, getList());
        recyclerView.setAdapter(soalAdapter);
    }

    private List<Soal> getList(){
        soalArrayList = new ArrayList<>();
//        soalArrayList.add(new Soal(1,"jawab cobak soalne", "A", "B", "C", "D"));
//        soalArrayList.add(new Soal(2,"jawab cobak soalne", "A", "B", "C", "D"));
//        soalArrayList.add(new Soal(3,"jawab cobak soalne", "A", "B", "C", "D"));
//        soalArrayList.add(new Soal(4,"jawab cobak soalne", "A", "B", "C", "D"));
//        soalArrayList.add(new Soal(5,"jawab cobak soalne", "A", "B", "C", "D"));

        return soalArrayList;

    }
}