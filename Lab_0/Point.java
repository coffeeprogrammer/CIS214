// Point.java
// Author:  Chad Botting
// Course:  CIS 214, Fall 2012
// Date:    September 28, 2012
// Lab0, CIS 214, a class that represents a Point on two dimensional Cartesian plain

public class Point
{
    // class members
    // fields - the class level variables

    // constructor(s)
    public Point(double X, double Y)
    {
        xCoordinate = X;
        yCoordinate = Y;
    }

    public Point()
	{
	    xCoordinate = 0;
	    yCoordinate = 0;
    }

    // accessors
    public double getX()
    {
        return xCoordinate;
    }

    public double getY()
    {
        return yCoordinate;
    }

    // mutators
    public void setX(double X)
    {
        xCoordinate = X;
    }

    public void setY(double Y)
    {
        yCoordinate = Y;
    }

    // the toString method
    public String toString()
    {
        String retval;
        retval = "x = " + String.valueOf(xCoordinate) + " y = " + String.valueOf(yCoordinate);
        return retval;
    } // end of toString

    // just x and y are way to simple variable names for me
    private double xCoordinate;
    private double yCoordinate;
} // end of class definition