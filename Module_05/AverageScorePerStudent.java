// AverageScorePerStudent.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    October 1, 2012
// Module 05 Homework, CIS 214, Problem 4, calculates the avarage score for each student

import java.util.Scanner;

public class AverageScorePerStudent
{
	public static void main(String[] args)
	{
		int numberOfStudents, numberOfTests;
		Scanner input = new Scanner(System.in);

		System.out.println("input number of students");
		numberOfStudents = input.nextInt();
		System.out.println("input number of tests per student");
		numberOfTests = input.nextInt();

		for(int xS = 1; xS <= numberOfStudents; xS++)
		{
			int averageScore;
			int gradeAccumulator = 0;
			System.out.println("you are current inputing data for student # " + xS);

			for(int xT = 1; xT <= numberOfTests; xT++)
			{
				System.out.print("input grade #" + xT + " :");
				gradeAccumulator += input.nextInt();
			} // end of tests for loop

			averageScore = gradeAccumulator/numberOfTests;
			System.out.println("student # " + xS + " got a average score of " + averageScore);
		} // end of students for loop

	} // end of main method
} // end of AverageScorePerStudent class