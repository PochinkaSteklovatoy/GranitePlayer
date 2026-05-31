package com.example.graniteplayer;

import android.media.Image;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class ListHolder extends RecyclerView.ViewHolder {

    ImageView cover;
    TextView name;
    TextView author;
    TextView length;
    ImageButton options;
    public ListHolder(@NonNull View itemView) {
        super(itemView);
        cover = itemView.findViewById(R.id.inlist_track_cover);
        name = itemView.findViewById(R.id.inlist_track_name);
        author = itemView.findViewById(R.id.inlist_track_author);
        length = itemView.findViewById(R.id.inlist_track_length);
        options = itemView.findViewById(R.id.inlist_track_options);
    }
}
