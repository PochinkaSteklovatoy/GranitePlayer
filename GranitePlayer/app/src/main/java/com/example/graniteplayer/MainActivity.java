package com.example.graniteplayer;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        RecyclerView recyclerView = findViewById(R.id.Tracklist);

        List<TrackData> tracks = new ArrayList<TrackData>();
        //Просто список для теста RecycleView!!!
        tracks.add(new TrackData(0,R.drawable.alice_test_cover,"Ханнамонтана", "Пошлая Молли","Первый",0,"0"));
        tracks.add(new TrackData(1,R.drawable.alice_test_cover,"Супермаркет", "Пошлая Молли","Первый",0,"0"));
        tracks.add(new TrackData(2,R.drawable.alice_test_cover,"Даня", "Так себе чел","Хыхы",0,"0"));
        tracks.add(new TrackData(3,R.drawable.alice_test_cover,"Ханнамонтана", "Пошлая Молли","Первый",0,"0"));
        tracks.add(new TrackData(4,R.drawable.alice_test_cover,"Ханнамонтана", "Пошлая Молли","Первый",0,"0"));
        tracks.add(new TrackData(5,R.drawable.alice_test_cover,"Ханнамонтана", "Пошлая Молли","Первый",0,"0"));
        tracks.add(new TrackData(6,R.drawable.alice_test_cover,"Ханнамонтана", "Пошлая Молли","Первый",0,"0"));
        tracks.add(new TrackData(0,R.drawable.alice_test_cover,"Ханнамонтана", "Пошлая Молли","Первый",0,"0"));
        tracks.add(new TrackData(1,R.drawable.alice_test_cover,"Супермаркет", "Пошлая Молли","Первый",0,"0"));
        tracks.add(new TrackData(2,R.drawable.alice_test_cover,"Даня", "Так себе чел","Хыхы",0,"0"));
        tracks.add(new TrackData(3,R.drawable.alice_test_cover,"Ханнамонтана", "Пошлая Молли","Первый",0,"0"));
        tracks.add(new TrackData(4,R.drawable.alice_test_cover,"Ханнамонтана", "Пошлая Молли","Первый",0,"0"));
        tracks.add(new TrackData(5,R.drawable.alice_test_cover,"Ханнамонтана", "Пошлая Молли","Первый",0,"0"));
        tracks.add(new TrackData(6,R.drawable.alice_test_cover,"Ханнамонтана", "Пошлая Молли","Первый",0,"0"));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ListAdapter(getApplicationContext(),tracks));
    }

    public void GotoPlayedTrack(View v){
        Intent intent = new Intent (this, PlayedTrack.class);
        startActivity(intent);
    }

    public void GotoTrackDetails (View v){
        Intent intent = new Intent (this, TrackDetails.class);
        startActivity(intent);
    }

}