package cmsc.com.squareoff.UI;


import android.graphics.Color;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Line {
    Button buttonLine;
    boolean isClicked = false;
    int clickedBy;

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
    TextView square;
    Line[] squareLines;
    int completedBy;
    
    public Square(Line[] lines)
    {
        squareLines = lines;
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
            if(p.number == 1)
            {
                square.setBackgroundColor(Color.BLUE);
                completedBy = 1;
            }
            else if(p.number == 2)
            {
                square.setBackgroundColor(Color.RED);
                completedBy = 2;
            }
            return squareComplete;
        }
        else
        {
            return squareComplete;
        }
    }
}
