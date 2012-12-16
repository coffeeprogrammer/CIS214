// ShipmentTest.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 30, 2012
// Module 04 Homework, CIS 214, Problem 4, test the Shipment class

import java.util.Scanner;

public class ShipmentTest
{
    public static void main(String[] args)
    {

		double weight;
		int distance;

		Scanner input = new Scanner(System.in);

		System.out.println("what is the weight of the package  : ");
		weight = input.nextDouble();

		System.out.println("what is the distance to be shipped : ");
		distance = input.nextInt();

		Shipment aPackage = new Shipment(weight, distance);

		System.out.println("your package costs $" + aPackage.getShippingCost());

    }
} // end of class
