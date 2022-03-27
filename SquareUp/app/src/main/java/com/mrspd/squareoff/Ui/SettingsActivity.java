package com.mrspd.squareoff.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.mrspd.squareoff.R;
import com.mrspd.squareoff.Services.MusicService;

public class SettingsActivity extends AppCompatActivity {

    private boolean musicIsPlaying;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        musicIsPlaying = true;
    }

    public void musicButtonOnClickListener(View view) {
        if(musicIsPlaying) {
            stopService(new Intent(this, MusicService.class));
            musicIsPlaying = false;
        }
        else {
            startService(new Intent(this, MusicService.class));
            musicIsPlaying = true;
        }
    }
}