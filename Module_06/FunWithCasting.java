// FunWithCasting.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    October 19, 2012
// Module 06 Homework, CIS 214, Problem 3, Shows how to cast numbers in Java

import java.util.Scanner;

public class FunWithCasting
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double aDouble;
		int aInt;
		System.out.print("please input a real number (double) value: ");
		aDouble = input.nextDouble();
		aInt = (int)aDouble;
		System.out.println("This is the value in it's orginal double form: " + aDouble);
		System.out.println("This is the value in it's casted int form    : " + aInt);
	} // end of main method
} // end of class