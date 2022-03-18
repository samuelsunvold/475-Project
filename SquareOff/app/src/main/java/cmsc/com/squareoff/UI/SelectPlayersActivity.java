package cmsc.com.squareoff.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;

import cmsc.com.squareoff.ADAPTERS.CustomAdapter;
import cmsc.com.squareoff.R;

public class SelectPlayersActivity extends AppCompatActivity {

    Button dummyButton;
    GridView gridView;
    //Temp play Btn
    Button play;

    EditText playerOneName;
    EditText playerTwoName;

    ImageView playerOneImage;
    ImageView playerTwoImage;

    int [] images = {R.drawable.team1,R.drawable.team2,R.drawable.team3,R.drawable.team4,
                    R.drawable.team5,R.drawable.team6,R.drawable.team7,R.drawable.team8,
                    R.drawable.team9, R.drawable.team10, R.drawable.team11, R.drawable.team12 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_players);

        dummyButton = findViewById(R.id.dummyButton);

        playerOneName = findViewById(R.id.playerName2);
        playerTwoName = findViewById(R.id.playerName1);
        playerOneImage = findViewById(R.id.player1);
        playerTwoImage = findViewById(R.id.player2);

        play = findViewById(R.id.playBtn);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playBttn = new Intent(SelectPlayersActivity.this, so3x3.class);

                playBttn.putExtra("playerOneName", playerOneName.getText().toString());
                playBttn.putExtra("playerTwoName", playerTwoName.getText().toString());

                startActivity(playBttn);
            }
        });

        gridView = findViewById(R.id.gridview);
        CustomAdapter customAdapter = new CustomAdapter(images,this);
        gridView.setAdapter(customAdapter);
    }

    // Method here just to bring you to Winner screen. Will be deleted later.
    public void dummyButtonOnClickListener(View view) {
        Intent winnerScreen = new Intent(this, WinnerActivity.class);
        startActivity(winnerScreen);
    }
}