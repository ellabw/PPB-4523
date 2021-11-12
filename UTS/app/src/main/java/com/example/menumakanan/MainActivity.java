package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[], s3[];
    int images[] = {R.drawable.gadogado,R.drawable.kwetiaugoreng,R.drawable.nasigoreng,R.drawable.rawon,R.drawable.nasiayambakar,R.drawable.nasigeprek};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);

        s1 = getResources().getStringArray(R.array.menu_makanan);
        s2 = getResources().getStringArray(R.array.price);
        s3 = getResources().getStringArray(R.array.deskripsi);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, s3, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}