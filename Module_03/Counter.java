// Counter.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 22, 2012
// Module 03 Homework, CIS 214, Problem 3, class that counts things

// after looking at this program I am not sure how unsigned numbers work in Java.
// if they do work at all?
public class Counter
{
	// a constructor
	public Counter()
	{
		// the default and only construtor
		// set the initial value of the counter to zero
		counterVar = 0;
	}

	public void IncreaseCounter()
	{
		// simple enough, increase value by one
		counterVar++;
	}

	public void DecreaseCounter()
	{
		// this is the only place we need to make sure we don't go negitive
		// zero is the lowest you can go
		if (counterVar >= 1)
		{
			counterVar--;
		}
		else
		{
			// simple error message
			System.out.println("sorry you can't go any lower");
		}
	}

	public String toString()
	{
		// using the valueOf method of the String class to convert counterVar to a String
		return String.valueOf(this.counterVar);
	}

	private int counterVar;  // a counter variable (not sure how to make it unsigned)
							 // I was a little confused when I looked up "java unsigned int" on google

}  // end of counter class