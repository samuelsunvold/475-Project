package cmsc.com.squareoff.UI;


import android.graphics.Color;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Line {
    Button buttonLine;
    boolean isClicked = false;
    int clickedBy;
    ArrayList<Square> squares;

    public Line(Button button)
    {
        this.buttonLine = button;
    }

    public void setClicked()
    {
        isClicked = true;
    }
    public boolean getClick()
    {
        return isClicked;
    }

    public void clicked(int player)
    {
        //
    }

}

class Square
{
    ImageView square;
    Line[] squareLines;
    boolean isSquareComplete = false;
    
    public Square(Line[] lines, ImageView s)
    {
        squareLines = lines;
        square = s;
    }

    public boolean checkSquare(Player p)
    {
        boolean squareComplete = true;

        for (Line i: squareLines)
        {
            if(squareComplete && i.isClicked)
            {
                continue;
            }
            else
            {
                squareComplete = false;
                break;
            }
        }

        if(squareComplete)
        {
            isSquareComplete = true;
            if(p.number == 1)
            {
                square.setBackgroundColor(Color.BLUE);
            }
            else if(p.number == 2)
            {
                square.setBackgroundColor(Color.RED);
            }
        }
        return squareComplete;
    }
}
