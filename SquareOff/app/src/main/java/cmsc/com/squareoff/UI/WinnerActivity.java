package cmsc.com.squareoff.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cmsc.com.squareoff.R;

public class WinnerActivity extends AppCompatActivity {

    private Button homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);

        homeButton = findViewById(R.id.homeButton);
    }

    // On click listener for the 'Home' button.
    public void homeButtonOnClickListener(View view) {
        Intent homeScreen = new Intent(this, HomeActivity.class);
        startActivity(homeScreen);
    }
}