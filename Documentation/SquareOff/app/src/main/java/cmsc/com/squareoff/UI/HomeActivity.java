package cmsc.com.squareoff.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.ImageView;

import cmsc.com.squareoff.R;

public class HomeActivity extends AppCompatActivity {
    ImageView startButton;
    ImageView tutorialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // This will take you to the tutorial screen
        tutorialButton =  findViewById(R.id.tutorial_button);
        tutorialButton.setOnClickListener(view -> {
            Intent intentLoadTutorialActivity = new Intent(HomeActivity.this, TutorialActivity.class);
            startActivity(intentLoadTutorialActivity);
        });

        // This will take you to the grid screen
        startButton =  findViewById(R.id.start_button);
        startButton.setOnClickListener(view -> {

            Intent intentLoadGridActivity = new Intent(HomeActivity.this, GridActivity.class);
            startActivity(intentLoadGridActivity);
        });
    }
}