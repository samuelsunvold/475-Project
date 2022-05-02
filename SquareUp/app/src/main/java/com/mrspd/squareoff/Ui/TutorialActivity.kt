package com.mrspd.squareoff.Ui

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mrspd.squareoff.R

class TutorialActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_tutorial)

        mediaPlayer = MediaPlayer.create(this, R.raw. mystery_alert)

        val intent: Intent = getIntent()
        val isMusicMuted = intent.getBooleanExtra("musicIsMuted", false)

        if(!isMusicMuted) {
            mediaPlayer.start()
        }
    }
}