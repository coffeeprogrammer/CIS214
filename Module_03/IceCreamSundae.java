// IceCreamSundae.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 11, 2012
// Module 03 Homework, CIS 214, Problem 4, descrition

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
		return "This ice cream sundae has " + getScoops() + " scoops and " + getToppings() + " toppings";
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

	private int numOfScoops;
	private int numOfToppings;
}