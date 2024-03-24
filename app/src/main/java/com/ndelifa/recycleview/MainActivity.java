package com.ndelifa.recycleview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private List<Mahasiswa> mahasiswaList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mahasiswaList = new ArrayList<>();
        // Isi data mahasiswa
        mahasiswaList.add(new Mahasiswa("Muhammad Ilham Akbar", "12250113387", R.drawable.p12250113387));
        mahasiswaList.add(new Mahasiswa("Farhan Fadhila ", "12250113444", R.drawable.p12250113444));
        mahasiswaList.add(new Mahasiswa("Rifki Faiz Azzurananda", "12250113451", R.drawable.p12250113451));
        mahasiswaList.add(new Mahasiswa("M Farhan Aulia Pratama", "12250113521", R.drawable.p12250113521));
        mahasiswaList.add(new Mahasiswa("Aqmal Syarif Fadilah", "12250113564", R.drawable.p12250113564));
        mahasiswaList.add(new Mahasiswa("Harry Finaldhi", "12250113594", R.drawable.p12250113594));
        mahasiswaList.add(new Mahasiswa("Salsabila Aurelia Rickardo", "12250121918", R.drawable.p12250121918));
        mahasiswaList.add(new Mahasiswa("Ready Malik Putra", "12250113761", R.drawable.p12250113761));
        mahasiswaList.add(new Mahasiswa("Tasya Dwi Yanti", "12250123081", R.drawable.p12250123081));
        mahasiswaList.add(new Mahasiswa("Yuliana Mislianingsih", "12250123497", R.drawable.p12250123497));
        mahasiswaList.add(new Mahasiswa("Nur Delifah", "12250123957", R.drawable.p12250123957));
        mahasiswaList.add(new Mahasiswa("Restu Kharissa Andini", "12250124591", R.drawable.p12250124591));
        mahasiswaList.add(new Mahasiswa("Fadlan Nur Ramadhan", "12250113820", R.drawable.p12250113820));
        mahasiswaList.add(new Mahasiswa("Muhammad Raja Fahrezy", "12250113812", R.drawable.p12250113812));

        adapter = new MahasiswaAdapter(this, mahasiswaList);
        recyclerView.setAdapter(adapter);
    }
}
