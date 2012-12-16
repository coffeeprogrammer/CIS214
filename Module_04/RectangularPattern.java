// RectangularPattern.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 20, 2012
// Module 04 Homework, CIS 214, Problem 3, Makes a rectangular shape

import java.util.Scanner;

public class RectangularPattern
{
    public static void main(String[] args)
    {
        // I don't if the book said these values would initialize to a value here or not
        int rows = 0;
        int columns = 0;

        Scanner input = new Scanner(System.in);
        // again using regular expressions to set delimiters.
		// using the regular expression character set, [], of x and carriage return
        input.useDelimiter("[x\r]");

        System.out.println("input the the size of your rectangle in the format rows x columns ");
        System.out.println("example 3x5");

        rows = input.nextInt();
        columns = input.nextInt();

        makeRectangle(rows, columns);

    } // end of main method

    public static void makeRectangle(int rows, int columns)
    {
        // in this case we need to start the computer's iteration at one not zero
        // other wise we be one over on the rows and columns.
        for(int r = 1; r <= rows; r++)
        {
            for(int c = 1; c <= columns; c++)
            {
                System.out.print("*");
            } // done building columns this iteration
            System.out.println();
        } // done building rows
    } // end of the makeRectangle method.
} // end of RectangularPattern class