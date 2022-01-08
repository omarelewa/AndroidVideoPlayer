package com.example.videoplayer;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private final String[] Genres = {
            "Adventure",
            "Drama",
            "Comedy",
            "Sci-Fi"
    };
    private final Integer[] imageId = {
            R.drawable.adventure,
            R.drawable.drama,
            R.drawable.comedy,
            R.drawable.scifi
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setting the header
        TextView textView = new TextView(this);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setText("Select a Genre");

        // Adding the header
        ListView listView = (ListView) findViewById(R.id.list);
        listView.addHeaderView(textView);

        // Populating list data
        CustomGenreList customGenreList = new CustomGenreList(this, Genres, imageId);
        listView.setAdapter(customGenreList);

        listView.setOnItemClickListener((adapterView, view, position, l) -> Toast.makeText(getApplicationContext(), "You Selected "+ Genres[position-1], Toast.LENGTH_SHORT).show());
    }
}