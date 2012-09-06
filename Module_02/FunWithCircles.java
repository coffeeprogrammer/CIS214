// FunWithCircles.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 06, 2012
// Module 02 Homework, CIS 214, Problem 4, Given radius of a circle calculate the diameter, circumference, and area.

import java.util.Scanner;

public class FunWithCircles
{
    public static void main(String[] args)
    {
        System.out.println("Chad's Fun with Circles Java Program");
        System.out.println("------------------------------------\n");

        // instantiate a Scanner object
        Scanner input = new Scanner(System.in);

        // initializing variables
        double radius;  // no reason we can not use a a double here, so the use can enter real numbers
        double area;
        double diameter;
        double circumference;

        // "final" keyword in java is for using a constant variable,
        // one which never changes, if you try to change it you will get a compiler error
        final double pi = 3.14159;  // we could just use the Math package for this value
        // we want to use a float here rather than a double, according to the book, most java programmers
        // use doubles for floating points.  According to Appendix D double is 64 bit with a higher precision than
        // "float" type.  Consider precision for this data type.

        // input
        System.out.println("Please input a positive real number for the radius of a circle");
        radius = input.nextDouble();


        // processing
        area = pi * (radius*radius); // again, we could use the Math package to square this
        diameter = radius * 2;
        circumference = pi * diameter;

        // output
        System.out.printf("\n area of the circle is: %f\n", area);
        System.out.printf(" diameter of the circle is: %f\n", diameter);
        System.out.printf(" circumference of the circle is: %f\n", circumference);

    } // end of main method
} // end of class FunWithCircle