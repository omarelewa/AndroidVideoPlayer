package com.example.videoplayer;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomGenreList extends ArrayAdapter {
    private String[] genreNames;
    private Integer[] imageId;
    private Activity context;

    public CustomGenreList(Activity context, String[] genreNames, Integer[] imageId){
        super(context, R.layout.row_item, genreNames);
        this.context = context;
        this.genreNames = genreNames;
        this.imageId = imageId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        if (convertView == null) {
            row = inflater.inflate(R.layout.row_item, null, true);
        }
        TextView textViewGenre = (TextView) row.findViewById(R.id.textViewGenre);
        ImageView imageViewGenre = (ImageView) row.findViewById(R.id.imageViewFavicon);

        textViewGenre.setText(genreNames[position]);
        imageViewGenre.setImageResource(imageId[position]);

        return row;
    }
}
