package cmsc.com.squareoff.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

import cmsc.com.squareoff.ADAPTERS.CustomAdapter;
import cmsc.com.squareoff.R;

public class SelectPlayersActivity extends AppCompatActivity {

    Button dummyButton;
    GridView gridView;

    int [] images = {R.drawable.team1,R.drawable.team2,R.drawable.team3,R.drawable.team4,
                    R.drawable.team5,R.drawable.team6,R.drawable.team7,R.drawable.team8,
                    R.drawable.team9, R.drawable.team10, R.drawable.team11, R.drawable.team12 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_players);

        dummyButton = findViewById(R.id.dummyButton);

        gridView = findViewById(R.id.gridView);
        CustomAdapter customAdapter = new CustomAdapter(images,this);
        gridView.setAdapter(customAdapter);
    }



    // Method here just to bring you to Winner screen. Will be deleted later.
    public void dummyButtonOnClickListener(View view) {
        Intent winnerScreen = new Intent(this, WinnerActivity.class);
        startActivity(winnerScreen);
    }
}