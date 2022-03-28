package com.mrspd.squareoff.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.mrspd.squareoff.R;
import com.mrspd.squareoff.Services.MusicService;

public class SettingsActivity extends AppCompatActivity {

    private boolean musicIsPlaying;

    private Button musicButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        musicIsPlaying = true;

        musicButton = findViewById(R.id.musicButton);
    }

    public void musicButtonOnClickListener(View view) {
        if(musicIsPlaying) {
            stopService(new Intent(this, MusicService.class));
            musicButton.setText("Unmute Music");
            musicIsPlaying = false;
        }
        else {
            startService(new Intent(this, MusicService.class));
            musicButton.setText("Mute Music");
            musicIsPlaying = true;
        }
    }
}