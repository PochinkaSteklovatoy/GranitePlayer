package com.example.graniteplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListHolder> {

    Context context;
    List<TrackData> tracks;

    public ListAdapter(Context context, List<TrackData> tracks) {
        this.context = context;
        this.tracks = tracks;
    }

    @NonNull
    @Override
    public ListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ListHolder(LayoutInflater.from(context).inflate(R.layout.track_in_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ListHolder holder, int position) {
        holder.name.setText(tracks.get(position).getName());
        holder.author.setText(tracks.get(position).getAuthor());
        holder.length.setText(String.valueOf(tracks.get(position).getTime()));
        holder.cover.setImageResource(tracks.get(position).getCover());
    }

    @Override
    public int getItemCount() {
        return tracks.size();
    }
}
