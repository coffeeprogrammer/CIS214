// BottingPoint.java
// Author:  Chad Botting
// Course:  CIS 214, Fall 2012
// Date:    September 28, 2012
// Lab0, CIS 214, a program that defines two lines using the my Point class and then performs various operations on those lines

import java.util.Scanner;
import java.lang.Math;

public class BottingPoint
{
    public static void main(String[] args)
    {
        // TODO: add a Scanner or something so we don't have hard code values in.
		// I have not added the Scanner yet because I have to research the delimiters so that I know
		// I am parsing the a X,Y on a single line correct, I think this will make the program look more 
		// professional, but I want to make sure I am doing it 100% correct
        double xIntersection;
        double yIntersection;

        // any variable or object with Alpha in its name refers to the first line
        // any variable or object with Beta in its name refers to the second line
        // System.out.println("You will enter the coordinates like this: \"4,5\" and then press enter");

        System.out.println("Please input the coordinates for point one for line one");
        Point oPointOneAlpha = new Point(-3.4, -5);

        System.out.println("Please input the coordinates for point two for line one");
        Point oPointTwoAlpha = new Point(5, 6.7);

        System.out.println("Please input the coordinates for point three for line two");
        Point oPointOneBeta = new Point(-7.9, 23);

        System.out.println("Please input the coordinates for point four for line two");
        Point oPointTwoBeta = new Point(1.26, -7.86);

        double a_Alpha        = (oPointTwoAlpha.getY() - oPointOneAlpha.getY());
        double b_Alpha        = (oPointOneAlpha.getX() - oPointTwoAlpha.getX());
        double c_Alpha        = (oPointOneAlpha.getY()*oPointTwoAlpha.getX()) - (oPointTwoAlpha.getY()*oPointOneAlpha.getX());

        double a_Beta         = (oPointTwoBeta.getY() - oPointOneBeta.getY());
        double b_Beta         = (oPointOneBeta.getX() - oPointTwoBeta.getX());
        double c_Beta         = (oPointOneBeta.getY()*oPointTwoBeta.getX()) - (oPointTwoBeta.getY()*oPointOneBeta.getX());

        double distance_Alpha = Math.sqrt(Math.pow(b_Alpha,2) + Math.pow(a_Alpha,2));
        double distance_Beta  = Math.sqrt(Math.pow(b_Beta, 2) + Math.pow(a_Beta, 2));


        if(true == false) // TODO: put a condition here to check if line Alpha is the same as line Beta
        {
            // lines are the same, sorry, this would led to divide by zero error
            System.out.println("The lines appear to be the same");
        }
        else
        {
            // determine the intersection point for x and y
            xIntersection = ((b_Alpha * c_Beta) - (b_Beta * c_Alpha)) / ((a_Alpha * b_Beta) - (a_Beta * b_Alpha));
            yIntersection = ((c_Alpha * a_Beta) - (c_Beta * a_Alpha)) / ((a_Alpha * b_Beta) - (a_Beta * b_Alpha));
            System.out.println("Your X intersection point is: " + String.valueOf(xIntersection));
            System.out.println("Your Y intersection point is: " + String.valueOf(yIntersection));
        }
    } // end of main method
} // end of PointTest class