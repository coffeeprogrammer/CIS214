// LargerOrEqual.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 05, 2012
// Module 02 Homework, CIS 214, Problem 2, finds the largest of two numbers
// or determines if they are equal

import java.util.Scanner;
import static java.lang.System.out;
// is it ok to import a package like this, there is some disagreement on the forums
// some people say only to do it if you are using alot of stuff from a package
// thought I would get some input from you before I keep doing it

public class LargerOrEqual
{
     public static void main(String[] args)
     {
         // initializing variables
         Scanner input = new Scanner(System.in);
         int numberOne;
         int numberTwo;

         // get the input
         System.out.println("Please input two number separated by white space");
         System.out.println("white space could be a space or new line by enter key");

         numberOne = input.nextInt();
         numberTwo = input.nextInt();

         // do the processing
         if (numberOne > numberTwo)
         {
            out.printf("%d is larger", numberOne);
         } else if (numberOne < numberTwo) {
            out.printf("%d is larger", numberTwo);
         } else {
            out.println("The numbers are equal");
         }
     } // end of main method
} // end of LargerOrEqual class