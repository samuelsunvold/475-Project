package cmsc.com.squareoff.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cmsc.com.squareoff.R;

public class SelectPlayersActivity extends AppCompatActivity {

    private Button dummyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_players);

        dummyButton = findViewById(R.id.dummyButton);
    }

    // Method here just to bring you to Winner screen. Will be deleted later.
    public void dummyButtonOnClickListener(View view) {
        Intent winnerScreen = new Intent(this, WinnerActivity.class);
        startActivity(winnerScreen);
    }
}