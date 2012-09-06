// IntegerSwap.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 06, 2012
// Module 02 Homework, CIS 214, Problem 5, Store two integer variables and then swap there values

import java.util.Scanner;

public class IntegerSwap
{
    public static void main(String[] args)
    {
        // instantiate a Scanner object
        Scanner input = new Scanner(System.in);

        // initialing variables
        int first;
        int second;
        int swap;

        // input
        System.out.println("Please input two numbers separated by white space");
        first = input.nextInt();
        second = input.nextInt();

        // processing
        System.out.println("\n before swap: ");
        System.out.printf("\n  first equals %d \n", first);
        System.out.printf("  second equals %d \n", second);

        // the actual swap start here
        swap = first;     // first store the the variable "first" in the temp variable "swap"
        first = second;   // next, set first equal to second
        second = swap;    // lastly set second equal swap, which equal first from first step
        // the swap ends here

        System.out.println("\n after swap: ");
        System.out.printf("\n  first equals %d \n", first);
        System.out.printf("  second equals %d\n", second);
    } // end of main method
} // end of IntegerSwap class