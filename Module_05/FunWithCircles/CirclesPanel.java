// CirclesPanel.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    October 04, 2012
// Module 05 Homework, CIS 214, Problem 5, draws 10 concentric circles

import java.awt.*;
import javax.swing.JPanel;

public class CirclesPanel extends JPanel
{
	public void paintComponent( Graphics g )
	{
		super.paintComponent(g);

		for(int x = 5; x <= 50; x+=5)
		{
			g.drawOval(120-x,120-x,2*x,2*x);
		} // end of for loop
	} // end of method
} // end of class