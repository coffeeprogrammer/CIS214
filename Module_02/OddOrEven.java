// OddOrEven.java
// Author:  Chad Botting
// Course:  CIS 214, Fall 2012
// Date:    September 05, 2012
// Module 02 Homework, CIS 214, Problem 3, Detemine if a number is odd of even

import java.util.Scanner;

public class OddOrEven
{
	public static void main(String[] args)
	{
		System.out.println("Chad's Odd or Even derermination program");
		System.out.println("----------------------------------------\n");

		// instantiate a Scanner object
		Scanner input = new Scanner(System.in);

		// initializing variables
		int aNumber;

		// input
		System.out.println("Please input a number to determine when it is odd or even");
		aNumber = input.nextInt();

		// processing
		if (aNumber % 2 == 0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
	} // end of main method
} // end of OddOrEven class