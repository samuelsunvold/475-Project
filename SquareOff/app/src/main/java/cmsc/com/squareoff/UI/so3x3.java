package cmsc.com.squareoff.UI;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import cmsc.com.squareoff.R;

public class so3x3 extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    Button button16;
    Button button17;
    Button button18;
    Button button19;
    Button button20;
    Button button21;
    Button button22;
    Button button23;
    Button button24;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.so3x3);

        button1 = findViewById(R.id.b0);
        button2 = findViewById(R.id.b1);
        button3 = findViewById(R.id.b2);
        button4 = findViewById(R.id.b3);
        button5 = findViewById(R.id.b4);
        button6 = findViewById(R.id.b5);
        button7 = findViewById(R.id.b6);
        button8 = findViewById(R.id.b7);
        button9 = findViewById(R.id.b8);
        button10 = findViewById(R.id.b9);
        button11 = findViewById(R.id.b10);
        button12 = findViewById(R.id.b11);
        button13 = findViewById(R.id.b12);
        button14 = findViewById(R.id.b13);
        button15 = findViewById(R.id.b14);
        button16 = findViewById(R.id.b15);
        button17 = findViewById(R.id.b16);
        button18 = findViewById(R.id.b17);
        button19 = findViewById(R.id.b18);
        button20 = findViewById(R.id.b19);
        button21 = findViewById(R.id.b20);
        button22 = findViewById(R.id.b21);
        button23 = findViewById(R.id.b22);
        button24 = findViewById(R.id.b23);

        Button[] buttons = new Button[]{button1, button2, button3, button4, button5, button6, button7, button8, button9,
                button10, button11, button12, button13, button14, button15, button16, button17, button18, button19,
                button20, button21, button22, button23, button24};

<<<<<<< Updated upstream
        ArrayList<Line> lines = new ArrayList<Line>();
=======
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
                        l.squares.add(s);
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
>>>>>>> Stashed changes


        //when each button is clicked
        for(int i = 0; i < buttons.length; i++)
        {
            Line line = new Line(buttons[i]);
            lines.add(line);
        }





        //when square is completed (all the lines of square isClicked)
            //set CompleteBy to player who clicked
            //player score++
            //change color based on player number
            // check if all squares are made





    }

    public void makeLine(View view) {
        view.setEnabled(false);


    }
}

