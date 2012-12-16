// SumOdds.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    October 1, 2012
// Module 05 Homework, CIS 214, Problem 2, calculates the sum of the odd integers 1 to 15

public class SumOdds
{
	public static void main(String[] args)
	{
		int oddsAccumulator = 0;
		for (int x = 1; x <= 15; x++)
		{
			if (x % 2 != 0)
			{
				oddsAccumulator = oddsAccumulator + x;
				System.out.println(oddsAccumulator);
			} // end of if control structure
		} // end of for loop
	} // end of main method.
} // end of SumOdds class