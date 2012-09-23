// IceCreamSundae.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 11, 2012
// Module 03 Homework, CIS 214, Problem 4, a class for storing information about possible ice cream sundaes

public class IceCreamSundae
{
	public IceCreamSundae(int scoops, int toppings)
	{
		setScoops(scoops);
		setToppings(toppings);
	}

	public double calcCost()
	{
		return (double)(numOfScoops) + (.50 * (double)numOfToppings);
	}

	public String getDescription()
	{
		// return a description of the ice cream sundae
		// not sure if I should add String.valueOf to the getScoops() and getToppings() part.
		// formatting the the value returned from calcCost() to show two decimals after the decimal point
		return "This ice cream sundae has " + getScoops() + " scoops and " + getToppings() + " toppings and it costs $" + String.format("%.2f", calcCost());
	}

	public void setScoops(int s)
	{
		numOfScoops = s;
	}

	public int getScoops()
	{
		return numOfScoops;
	}

	public void setToppings(int t)
	{
		numOfToppings = t;
	}

	public int getToppings()
	{
		return numOfToppings;
	}

	// private data members
	private int numOfScoops;
	private int numOfToppings;
}