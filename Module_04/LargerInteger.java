// LargerInteger.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 26, 2012
// Module 04 Homework, CIS 214, Problem 1, Selects largest or two integers.

import java.util.Scanner;

public class LargerInteger
{
	public static void main(String[] args)
	{

		// ini
		Scanner input = new Scanner(System.in);
		int numberOne, numberTwo;

		//inputs
		System.out.println("please input input interger one (numberOne): ");
		numberOne = input.nextInt();

		System.out.println("please input input interger two (numberTwo): ");
		numberTwo = input.nextInt();


		// processing
		if (numberOne > numberTwo)
		{
			System.out.println("numberOne is larger");
		}
		else if (numberTwo > numberOne)
		{
			System.out.println("numberTwo is larger");
		}
		else
		{
			System.out.println("the two numbers are equal");
		}


	} // end of main method
} // end of LargerInteger