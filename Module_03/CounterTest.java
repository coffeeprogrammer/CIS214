// CounterTest.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 22, 2012
// Module 03 Homework, CIS 214, Problem 3, test program for Counter class


public class CounterTest
{
	public static void main(String[] args)
	{
		// instantiate a Counter object
		// default initialization too zero
		Counter objThingies = new Counter();

		// see what happens when we try to decrease the counter when it is already
		// at zero
		System.out.println("\n try to decrease the counter when already at zero: ");
		objThingies.DecreaseCounter();

		// increase the counter 3 times
		objThingies.IncreaseCounter();
		objThingies.IncreaseCounter();
		objThingies.IncreaseCounter();

		// check the value
		System.out.println("\n After increasing the counter 3 times: ");
		System.out.println(objThingies.toString());

		// decrease one time
		objThingies.DecreaseCounter();

		// check the value
		System.out.println("\n After decreasing the counter once: ");
		System.out.println(objThingies.toString());

	} // end of main method
} // end of CounterTest