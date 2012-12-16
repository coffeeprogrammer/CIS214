// FunWithRepetition.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    October 1, 2012
// Module 05 Homework, CIS 214, Problem 1, uses repetition to select & output the smallest integers

import java.util.Scanner;

public class FunWithRepetition
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int aNumber;
		int count = 0;
		int lowest;
		System.out.print("input first value, this will be the number of loops: ");
		aNumber = input.nextInt();

		lowest = aNumber;
		count = aNumber;

		for(int x = 1; x <= count; x++)
		{
			System.out.print("input next number: ");
			if (aNumber < lowest)
			{
				lowest = aNumber;
			}
			aNumber = input.nextInt();
		}  // end of while loop block


		System.out.println("lowest number is: " + lowest);

	} // end main method
} // end of FunWithRepetition class