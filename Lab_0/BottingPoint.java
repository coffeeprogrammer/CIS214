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
        double xIntersection;
        double yIntersection;
        double x,y;
        Scanner input = new Scanner(System.in);

        // any variable or object with Alpha in its name refers to the first line
        // any variable or object with Beta in its name refers to the second line
        //input
        System.out.println("You will enter the coordinates: x enter y enter");

        System.out.println("Please input the coordinates for point one for line one");
        x = input.nextDouble();
        y = input.nextDouble();
        Point oPointOneAlpha = new Point(x, y);

        System.out.println("Please input the coordinates for point two for line one");
        x = input.nextDouble();
        y = input.nextDouble();
        Point oPointTwoAlpha = new Point(x, y);

        System.out.println("Please input the coordinates for point three for line two");
        x = input.nextDouble();
        y = input.nextDouble();
        Point oPointOneBeta = new Point(x, y);

        System.out.println("Please input the coordinates for point four for line two");
        x = input.nextDouble();
        y = input.nextDouble();
        Point oPointTwoBeta = new Point(x, y);

		// processing
        double a_Alpha        = (oPointTwoAlpha.getY() - oPointOneAlpha.getY());
        double b_Alpha        = (oPointOneAlpha.getX() - oPointTwoAlpha.getX());
        double c_Alpha        = (oPointOneAlpha.getY()*oPointTwoAlpha.getX()) - (oPointTwoAlpha.getY()*oPointOneAlpha.getX());

        double a_Beta         = (oPointTwoBeta.getY() - oPointOneBeta.getY());
        double b_Beta         = (oPointOneBeta.getX() - oPointTwoBeta.getX());
        double c_Beta         = (oPointOneBeta.getY()*oPointTwoBeta.getX()) - (oPointTwoBeta.getY()*oPointOneBeta.getX());

        double distance_Alpha = Math.sqrt(Math.pow(b_Alpha,2) + Math.pow(a_Alpha,2));
        double distance_Beta  = Math.sqrt(Math.pow(b_Beta, 2) + Math.pow(a_Beta, 2));

        // determine the intersection point for x and y
        xIntersection = ((b_Alpha * c_Beta) - (b_Beta * c_Alpha)) / ((a_Alpha * b_Beta) - (a_Beta * b_Alpha));
        yIntersection = ((c_Alpha * a_Beta) - (c_Beta * a_Alpha)) / ((a_Alpha * b_Beta) - (a_Beta * b_Alpha));

        Point oPointIntersection = new Point(xIntersection, yIntersection);

        // output
        System.out.println("Distance of line one: " + distance_Alpha);
        System.out.println("Distance of line one: " + distance_Beta);
        System.out.println("The point of intersection is: " + oPointIntersection.toString());

    } // end of main method
} // end of PointTest class