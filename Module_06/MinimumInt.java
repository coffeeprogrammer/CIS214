// MinimumInt.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    October 12, 2012
// Module 06 Homework, CIS 214, Problem 2, Application to return the smallest of three ints

import java.util.Scanner;

public class MinimumInt
{
    public static void main(String[] args)
    {
        // initializing variables
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);

        // input
        System.out.print("Input number 1: ");
        num1 = input.nextInt();

        System.out.print("Input number 2: ");
        num2 = input.nextInt();

        System.out.print("Input number 3: ");
        num3 = input.nextInt();

        // processing
        System.out.println("the smallest number: " + minimum(num1, num2, num3));
    } // end of main method

    public static int minimum(int a, int b, int c)
    {
        int smallest = a; // assume that a is the smallest is a
        if (smallest > b) // check if b is smaller than current smallest
        {
            smallest = b;
        }
        if (smallest > c) // check if c is smaller than current smallest
        {
            smallest = c;
        }
        return smallest; // return the smallest value
    } // end of minimum method
} // end MinimumInt class