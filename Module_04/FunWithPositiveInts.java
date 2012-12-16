// FunWithPositiveInts.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 26, 2012
// Module 03 Homework, CIS 214, Problem 2, output positive integers greater than 100

import java.util.Scanner;

public class FunWithPositiveInts
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);  // I tried to figure out how to do this with only
        int aNumber = 0;                         // a Scanner variable and not a int variable, but
                                                 // could not figure it out
        while(aNumber >= 0)
        {
            if (aNumber > 100)
            {
                System.out.println(String.valueOf(aNumber));
            } // end of if block
            aNumber =  input.nextInt();
        } // end of while loop
    } // end of main method
} // end of class