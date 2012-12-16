// BoardWithArrays.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    October 26, 2012
// Module 08 Homework, CIS 214, Problem 3, An array up to 20 elements and then print it

import java.util.Scanner;

public class BoardWithArrays
{
	public static void main(String[] args)
	{
		int aNumber;
		System.out.print("Input size of array up to 20 (also the value for the zero element) : ");
		Scanner input = new Scanner(System.in);
		aNumber  =  input.nextInt();

		if (aNumber <= 20 && aNumber > 0)
		{
			int[] intArray = new int[aNumber];
			intArray[0] = aNumber;

			for(int x = 1; x < intArray.length; x++)
			{
				System.out.print("number for element #"  + x + ": ");
				aNumber = input.nextInt();
				intArray[x] = aNumber;
			} // end of for block

			System.out.println("Index  Element");

			for(int x = 0; x < intArray.length; x++)
			{
				System.out.println(x + "      " + intArray[x]);
			} // end of for block
		} // end of true selection
		else
		{
			System.out.println("sorry, you must choose a number between 1 and 20");
		} // end of if block
	}// end of main method
} // end of class