// FunWithDistance.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    October 1, 2012
// Module 05 Homework, CIS 214, Problem 3, calculates the distance based of travel time and speed

import java.util.Scanner;

public class FunWithDistance
{
	public static void main(String[] args)
	{
		int speed, time;
		int distance = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("What is the speed of the vehicle in miles per hour: ");
		speed = input.nextInt();

		System.out.print("How many hours has it traveled: ");
		time = input.nextInt();

		System.out.println("Hours  Distance Traveled");
		System.out.println("-----  -----------------\n");

		for (int x = 1; x <= time; x++)
		{
			distance += speed;
			System.out.println("  " + x + "       " + distance);
		} // end of if block
	} // end of main method
} // end of FunWithDistance class