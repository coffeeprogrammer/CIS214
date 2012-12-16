// RainfallStats.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    October 26, 2012
// Module 08 Homework, CIS 214, Problem 2, using array for rainfall statistics

import java.util.Scanner;

public class RainfallStats
{
	public static void main(String[] args)
	{
		// ini
		double totalRainfall = 0;
		int highestRainfallElement = 0;
		int lowestRainfallElement = 0;
		Scanner input = new Scanner(System.in);
		double[] rainfallStats = new double[12];

		// input
		for(int x = 1; x <= rainfallStats.length; x++)
		{
			do
			{
				System.out.print("rainfall for month " + x + "? ");
				rainfallStats[x-1] = input.nextDouble();
			}
			while(rainfallStats[x-1] < 0);
		} // end of for block

		// processing
		for(int x = 0; x < rainfallStats.length; x++)
		{
			totalRainfall += rainfallStats[x];
			if (rainfallStats[x] > rainfallStats[lowestRainfallElement])
			{
				highestRainfallElement = x;
			}
			if (rainfallStats[x] < rainfallStats[lowestRainfallElement])
			{
				lowestRainfallElement = x;
			}
		} // end of for block

		// output
		System.out.println("Total rainfall is: " + totalRainfall);
		System.out.println("Average rainfall is: " + (totalRainfall/12.00));

		System.out.println("Month number highest rainfall: " + (highestRainfallElement+1) );
		System.out.println("Highest rainfall is: " + rainfallStats[highestRainfallElement]);

		System.out.println("Month with lowest rainfall: " + (lowestRainfallElement+1) );
		System.out.println("Lowest rainfall is: " + rainfallStats[lowestRainfallElement] );

	} // end of main method
} // end of class