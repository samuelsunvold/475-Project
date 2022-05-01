package com.mrspd.squareoff.Ui

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.mrspd.squareoff.R
import kotlinx.android.synthetic.main.choose_grid_activity.*

class ChooseGridActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    val bundle: Bundle = Bundle()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        mediaPlayer = MediaPlayer.create(this, R.raw. mystery_alert)
        setContentView(R.layout.choose_grid_activity)

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        var mode = "M"
        var gridsize = "5"
//        igsolo.setOnClickListener {
//            mode = "Solo"
//            gridsize = "5"
//            goToNextActivity(gridsize, mode) }
        //igmultiplayer.setOnClickListener {
            //mode = "MultiPlayer"
            gridSize.visibility = View.VISIBLE
            buttongrid3x3.visibility = View.VISIBLE
            buttongrid4x4.visibility = View.VISIBLE
            buttongrid5x5.visibility = View.VISIBLE
            //igChosseMode.visibility = View.GONE
           // igsolo.visibility = View.GONE
           // igmultiplayer.visibility = View.GONE

            buttongrid3x3.setOnClickListener {
                gridsize = "3"
                mediaPlayer.start()
                goToNextActivity(gridsize, mode)
            }
            buttongrid4x4.setOnClickListener {
                gridsize = "4"
                mediaPlayer.start()
                goToNextActivity(gridsize, mode)

            }
            buttongrid5x5.setOnClickListener {
                gridsize = "5"
                mediaPlayer.start()
                goToNextActivity(gridsize, mode)

            }
      //  }
    }

    private fun goToNextActivity(gridsize: String, mode: String) {
//                 d("SPD","hna bhai its working")
        intent = Intent(this, SelectPlayersActivity::class.java)
        bundle.putString("Mode", mode)
        bundle.putString("GridSize", gridsize)
        intent.putExtras(bundle)
        startActivity(intent)
        finish()

    }


}
