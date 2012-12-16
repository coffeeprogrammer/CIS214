// ApplicationFrame.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 20, 2012
// Module 04 Homework, CIS 214, Problem 5, makes the required JFrame to put the JPanel

import javax.swing.JFrame;
import java.awt.*;

public class ApplicationFrame
{
    public static void main(String[] args)
    {
        JFrame application = new JFrame();
        LinePanel LineComponent = new LinePanel();
        Color red = new Color(255, 255, 255);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);
        application.add(LineComponent);
        application.setSize( 250, 250 );

    } // end of main method
}  // end of class
