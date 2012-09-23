// HelloApplet.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 22, 2012
// Module 03 Homework, CIS 214, Problem 5, a simple applet program

// I did not modify my original program, I just started over

import java.awt.Graphics;
import javax.swing.*;

public class HelloApplet extends JApplet //  JApplet is the super class of HelloApplet
{                                        //  This means it is a "is-a" relationship see lines 21-24
    public void paint (Graphics g) // draw text on applet's background
    {
        super.paint(g);

        g.drawString("Hello Firefox, because that is browser Chad uses!", 25, 25);
        // 25, 25 indicate the lower left corner of the string

        // i believe that the following line would return false if it was "has-a" relationship
        // because HelloApplet is a implementation of JApplet it returns true
        // System.err.println(this instanceof JApplet);  we will remove this, as this has not been covered yet
        // you have to make the java console visible to see the true output.
    }   // end of paint method
} // end class HelloApplet

