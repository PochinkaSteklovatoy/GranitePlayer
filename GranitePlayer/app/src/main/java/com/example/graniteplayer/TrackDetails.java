package com.example.graniteplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TrackDetails extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_details);
    }
    public void GotoMainMenu(View v){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}
