// ApplicationFrame.java

import javax.swing.JFrame;
import java.awt.*;

public class ApplicationFrame
{
    public static void main(String[] args)
    {

        JFrame application = new JFrame();

        LinePanel LineComponent = new LinePanel();

        Color red = new Color(255, 255, 255);
        // application.setBackground(red);



        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.setVisible(true);

        application.add(LineComponent);

        application.setSize( 250, 250 );
        // application.setResizable(false);



        // application.setVisible(true);


    } // end of main method


}  // end of class
