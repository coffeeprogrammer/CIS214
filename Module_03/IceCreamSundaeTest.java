// IceCreamSundaeTest.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 11, 2012
// Module 03 Homework, CIS 214, Problem 4, descrition


public class IceCreamSundaeTest
{
	public static void main(String[] args)
	{
		IceCreamSundae objEatMe = new IceCreamSundae(2, 3); // an ice cream with 2 scoops and 3 toppings

		System.out.printf("This ice cream will cost:  $%.2f \n", objEatMe.calcCost());

		System.out.println(objEatMe.getDescription() + "\n");
	}
}