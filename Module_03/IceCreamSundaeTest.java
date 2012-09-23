// IceCreamSundaeTest.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 11, 2012
// Module 03 Homework, CIS 214, Problem 4, tests IceCreamSundae class

public class IceCreamSundaeTest
{
	public static void main(String[] args)
	{

		// instantiate three different IceCreamSundae objects
		IceCreamSundae objEatMeOne = new IceCreamSundae(2, 3); // an ice cream with 2 scoops and 3 toppings
		IceCreamSundae objEatMeTwo = new IceCreamSundae(1, 4); // an ice cream with 1 scoop and 4 toppings
		IceCreamSundae objEatMeThree = new IceCreamSundae(4, 3);  // an ice cream with 4 scoops and 3 toopings

		// eat me one output
		System.out.printf("  eat me one ice cream: \n", objEatMeOne.calcCost());
		System.out.println(objEatMeOne.getDescription() + "\n");

		// eat me two output
		System.out.printf("  eat me two ice cream: \n", objEatMeTwo.calcCost());
		System.out.println(objEatMeTwo.getDescription() + "\n");

		// eat me three output
		System.out.printf("  eat me three ice cream: \n", objEatMeThree.calcCost());
		System.out.println(objEatMeThree.getDescription() + "\n");
	} // end of main method
} // end of class