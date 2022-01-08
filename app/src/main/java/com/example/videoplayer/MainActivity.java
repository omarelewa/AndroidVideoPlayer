package com.example.videoplayer;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView l;
    String[] Genres = {"Adventure", "Drama", "Comedy", "Sci-Fi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = findViewById(R.id.list);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, Genres);
        l.setAdapter(arr);
    }
}