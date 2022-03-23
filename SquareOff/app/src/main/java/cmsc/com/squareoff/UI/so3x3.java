package cmsc.com.squareoff.UI;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.L;

import java.util.ArrayList;

import cmsc.com.squareoff.R;

public class so3x3 extends AppCompatActivity {

    Line button1;
    Line button2;
    Line button3;
    Line button4;
    Line button5;
    Line button6;
    Line button7;
    Line button8;
    Line button9;
    Line button10;
    Line button11;
    Line button12;
    Line button13;
    Line button14;
    Line button15;
    Line button16;
    Line button17;
    Line button18;
    Line button19;
    Line button20;
    Line button21;
    Line button22;
    Line button23;
    Line button24;

    Line[] buttons;

    Player currentPlayer;
    Player player1;
    Player player2;

    Square s1;
    Square s2;
    Square s3;
    Square s4;
    Square s5;
    Square s6;
    Square s7;
    Square s8;
    Square s9;

    ImageView tv1;
    ImageView tv2;
    ImageView tv3;
    ImageView tv4;
    ImageView tv5;
    ImageView tv6;
    ImageView tv7;
    ImageView tv8;
    ImageView tv9;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_so3x3);



        // Retrieve player names.
        Intent players = getIntent();
        String playerOne = players.getStringExtra("playerOneName");
        String playerTwo = players.getStringExtra("playerTwoName");

        Log.d("Player One", playerOne);
        Log.d("Player Two", playerTwo);

        //players
        player1 = new Player(playerOne, 1, Color.RED);
        player2 = new Player(playerTwo, 2, Color.BLUE);

        currentPlayer = player1;

        //lineButtons
        button1 = new Line(findViewById(R.id.b0));
        button2 = new Line(findViewById(R.id.b1));
        button3 = new Line(findViewById(R.id.b2));
        button4 = new Line(findViewById(R.id.b3));
        button5 = new Line(findViewById(R.id.b4));
        button6 = new Line(findViewById(R.id.b5));
        button7 = new Line(findViewById(R.id.b6));
        button8 = new Line(findViewById(R.id.b7));
        button9 = new Line(findViewById(R.id.b8));
        button10 = new Line(findViewById(R.id.b9));
        button11 = new Line(findViewById(R.id.b10));
        button12 = new Line(findViewById(R.id.b11));
        button13 = new Line(findViewById(R.id.b12));
        button14 = new Line(findViewById(R.id.b13));
        button15 = new Line(findViewById(R.id.b14));
        button16 = new Line(findViewById(R.id.b15));
        button17 = new Line(findViewById(R.id.b16));
        button18 = new Line(findViewById(R.id.b17));
        button19 = new Line(findViewById(R.id.b18));
        button20 = new Line(findViewById(R.id.b19));
        button21 = new Line(findViewById(R.id.b20));
        button22 = new Line(findViewById(R.id.b21));
        button23 = new Line(findViewById(R.id.b22));
        button24 = new Line(findViewById(R.id.b23));


        buttons = new Line[]{button1, button2, button3, button4, button5, button6, button7, button8, button9,
                button10, button11, button12, button13, button14, button15, button16, button17, button18, button19,
                button20, button21, button22, button23, button24};

        //imageViews
        tv1 = findViewById(R.id.i0);
        tv2 = findViewById(R.id.i1);
        tv3 = findViewById(R.id.i2);
        tv4 = findViewById(R.id.i3);
        tv5 = findViewById(R.id.i4);
        tv6 = findViewById(R.id.i5);
        tv7 = findViewById(R.id.i6);
        tv8 = findViewById(R.id.i7);
        tv9 = findViewById(R.id.i8);

        //Square objects
        s1 = new Square(new Line[]{button1, button4, button5, button8}, tv1);
        s2 = new Square(new Line[]{button2, button5, button6, button9}, tv2);
        s3 = new Square(new Line[]{button3, button6, button7, button10}, tv3);
        s4 = new Square(new Line[]{button8, button11, button12, button15}, tv4);
        s5 = new Square(new Line[]{button9, button12, button13, button14}, tv5);
        s6 = new Square(new Line[]{button10, button13, button14, button17}, tv6);
        s7 = new Square(new Line[]{button15, button18, button19, button22}, tv7);
        s8 = new Square(new Line[]{button16, button19, button20, button23}, tv8);
        s9 = new Square(new Line[]{button16, button20, button21, button24}, tv9);

        Square[] squares = new Square[]{s1, s2, s3, s4, s5, s6, s7, s8, s9};

        //filling in the sqaures array in each line that contains reference to their respective square
        for (Line l:buttons) {
            int max = 2;
            boolean breakout = false;
            for (Square s:squares) {
                for (Line line:s.squareLines) {
                    if (line == l && s != null)
                    {
                        line.squares.add(s);
                        max--;
                    }
                    if (max == 0)
                    {
                        breakout = true;
                        break;
                    }
                }
                if (breakout)
                {
                    break;
                }
            }
        }







        //when square is completed (all the lines of square isClicked)
            //set CompleteBy to player who clicked
            //player score++
            //change color based on player number
            // check if all squares are made
    }

    public void makeLine(View view) {


        int id = view.getId();

        //find the line that contains the button
        for (Line l:buttons) {
            //disable button and change color
            if(id == l.buttonLine.getId())
            {
                l.isClicked = true;
                l.clickedBy = currentPlayer.number;
                l.buttonLine.setEnabled(false);
                l.buttonLine.setBackgroundColor(currentPlayer.color);

                //go through each square referenced in Line's squares
                for (Square s: l.squares) {

                    //if square is complete change color of square and increment player's point
                    if (s.checkSquare(currentPlayer))
                    {
                        s.square.setBackgroundColor(currentPlayer.color);
                        currentPlayer.score++;
                    }
                    //else switch players
                    else
                    {
                        if(currentPlayer.number == player1.number)
                        {
                            currentPlayer = player2;
                        }
                        else
                        {
                            currentPlayer = player1;
                        }
                    }
                }
                break;
            }
        }


    }
}

