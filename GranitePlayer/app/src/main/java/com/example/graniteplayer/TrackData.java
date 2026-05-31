package com.example.graniteplayer;

import android.widget.ImageView;

public class TrackData {
    private long id;
    private int cover;
    private String name;
    private String author;
    private String album;
    private int time;
    private String track_path;

    public TrackData(long id, int cover, String name, String author, String album, int time, String track_path) {
        this.id = id;
        this.cover = cover;
        this.name = name;
        this.author = author;
        this.album = album;
        this.time = time;
        this.track_path = track_path;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTrack_path() {
        return track_path;
    }

    public void setTrack_path(String track_path) {
        this.track_path = track_path;
    }
}
