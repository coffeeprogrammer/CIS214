// FunWithNumbers.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 05, 2012
// Module 02 Homework, CIS 214, Problem 1, Preform various operations on two numbers

import java.util.Scanner;  // good old scanner class for console input

public class FunWithNumbers
{
    public static void main(String[] args)
    {
        // instantiate a Scanner object
        // a scanner object is used scan text and break it in to tokens
        Scanner input = new Scanner(System.in);

        // initializing variables
        int operandOne;  // variables in camel case
        int operandTwo;
        // we don't need any kind of a total var because
        // we can do the operation in printf's function arguments

        System.out.println("Please input two number separated by white space");
        System.out.println("white space could be a space or new line by enter key");

        operandOne = input.nextInt();
        operandTwo = input.nextInt();

        System.out.printf("The sum of the two numbers is: %d \n", operandOne + operandTwo );
        System.out.printf("The product of the two numbers is %d \n", operandOne*operandTwo );
        System.out.printf("The difference of the two number is %d \n", operandOne-operandTwo);
        try
        {
            System.out.printf("The quotient of the two numbers is %d \n", operandOne/operandTwo);
        }
		catch(ArithmeticException e)
		{   // for catching those divide-by-zero inputs
            System.out.println("sorry, division by zero");
        }  // end of try/catch block
    } // end of main method
}//  end of FunWithNumbers class