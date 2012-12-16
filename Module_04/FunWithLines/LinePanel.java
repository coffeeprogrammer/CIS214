// LinePanel.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 20, 2012
// Module 04 Homework, CIS 214, Problem 5, makes a pattern with lines

import java.awt.*;
import javax.swing.JPanel;

public class LinePanel extends JPanel
{
    public void paintComponent( Graphics g )
    {
        final int inc = 15;
        super.paintComponent(g);

        int width = getWidth();   // X value
        int height = getHeight(); // Y value

        System.err.println("current width  : " +  width);
        System.err.println("current height : " + height);

        int wi = width/inc;
        int hi = height/inc;

        // g.drawLine(x_start, y_start, x_stop, y_stop)
        for (int w = 0; w  < width; w = w + inc)
        {

            g.drawLine(0, w, 10 + w, height);
            System.err.println( "DRAWING A LINE FROM POINT: " + "0, " + String.valueOf(w) + " TO "
                    + String.valueOf(10+w) + "," + String.valueOf(height));

            // slope of the figure that forms
            System.err.println("***SLOPE: " + String.valueOf(height/(10+w)) );  // slope = rise / run

        }  // end of for loop
    } // end of method
} // end of class