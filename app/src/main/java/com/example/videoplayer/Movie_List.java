package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.example.videoplayer.MovieAdapter;
import com.example.videoplayer.Movie;
import com.example.videoplayer.Movie_List;

import java.util.ArrayList;


public class Movie_List extends AppCompatActivity {

    AppCompatActivity mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(mActivity.getRootView());

        String[] movieName = {
                "Big Buck Bunny",
                "Blender Open Movie",
                "Video 3",
                "Video 4",
                "Video 5",
                "Video 6",
                "Video 7",
                "Video 8"
        };

        String[] movieDuration = {
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8"
        };

        ArrayList<Movie> movieArrayList = new ArrayList<>();

        for (int i =0 ; i < movieName.length; i++) {
            Movie movie = new Movie(movieName[i], movieDuration[i]);
            movieArrayList.add(movie);
        }

        MovieAdapter movieAdapter = new MovieAdapter(M)
    }
}