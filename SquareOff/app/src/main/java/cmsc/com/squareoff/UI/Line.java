package cmsc.com.squareoff.UI;


import android.widget.Button;

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
    Line[] squareLines;
    int completedBy;
    
    public Square(Line[] lines)
    {
        squareLines = lines;
    }

    public boolean checkSquare()
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
        return squareComplete;
    }
}
