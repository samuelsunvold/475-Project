package cmsc.com.squareoff.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import android.widget.ImageView;

import cmsc.com.squareoff.R;

public class WinnerActivity extends AppCompatActivity {

     ImageView homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);

        homeButton =  findViewById(R.id.homeButton);
        homeButton.setOnClickListener(v -> {

                Intent homeScreen = new Intent(WinnerActivity.this, HomeActivity.class);
                startActivity(homeScreen);

        });
    }


}