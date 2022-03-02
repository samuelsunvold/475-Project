package cmsc.com.squareoff.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.ImageView;

import cmsc.com.squareoff.R;

public class GridActivity extends AppCompatActivity {

    ImageView threeByThree;
    ImageView fourByFour;
    ImageView fiveByFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        // this will take to the selectPlayers
        threeByThree =  findViewById(R.id.btn33);
        threeByThree.setOnClickListener(v -> {

            Intent loadSelectPlayersActivity = new Intent(GridActivity.this, SelectPlayersActivity.class);
            startActivity(loadSelectPlayersActivity);

        });

        // THIS WILL ALSO TAKE TO SELECT PLAYERS SCREEN

        fourByFour =  findViewById(R.id.btn44);
        fourByFour.setOnClickListener(v -> {
            Intent  loadSelectPlayersActivity = new Intent(GridActivity.this, SelectPlayersActivity.class);
            startActivity(loadSelectPlayersActivity);
        });

        // this will take take to 
        fiveByFive =  findViewById(R.id.btn55);
        fiveByFive.setOnClickListener(v -> {
            Intent  loadSelectPlayersActivity = new Intent(GridActivity.this, SelectPlayersActivity.class);
            startActivity(loadSelectPlayersActivity);
        });

    }
}