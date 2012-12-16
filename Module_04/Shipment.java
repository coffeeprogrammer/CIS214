// Shipment.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 30, 2012
// Module 04 Homework, CIS 214, Problem 4, a class for determining how much a package will charge to be shipped.

public class Shipment
{
    // constructor to pass the weight and distance
    public Shipment(double w, int d)
    {
        setWeight(w);
        setDistance(d);
        // Professor Goodridge said not to call get and set method from the constructor
        // unless nessary, if I do not here I would have to reprogram validation logic
        // that is why I am calling method from the construtor
    }  // end of constructor method

    public void setWeight(double w)
    {
        if ( w > 0)
        {
            weight = w;
        }
        else
        {
            weight = 0;
        }
    } // end of setWeight method

    public void setDistance(int d)
    {
        if (d > 0)
        {
            distance = d;
        }
        else
        {
            distance = 0;
        }
    }  // end of setDistance method

    public double getWeight()
	{
		return weight;
    } // end of getWeight method

    private int ShippingQuotient()
	{
		// we need this function because the distance is not prorated
		int sq; // this variable name stands for ShippingQuotient
		if (distance % 500 == 0)  // if "distance / 500" has no remainder then we do not have to think about
		{						  // prorates every thing just works out
			sq = (distance/500);
		}
		else						// if "distance / 500" has a remainder then we have to round up to the
		{							// nearest 500 to make discrete units of 500 miles
			sq = (distance/500 + 1);
		}
		return sq;
	} // end of ShippingQuotient function


    public double getShippingCost()
    {
        if (weight <= 1) //
        {
            return rateZeroToOne * ShippingQuotient();
        }
        else if (weight > 1 && weight <= 5)
        {
            return rateOneToFive * ShippingQuotient();
        }
        else if (weight > 5 && weight <= 10)
        {
            return rateFiveToTen * ShippingQuotient();
        }
        else if (weight > 10)
        {
            return rateTenAndUp * ShippingQuotient();
        }
        return -1;
    } // end of getShippingCost

    private double weight;
    private int distance;
    // declare variables for shipping rates so code can easily be updated
    private double rateZeroToOne = 2.00; // price rate of package 0 to 1 pounds
    private double rateOneToFive = 2.25; // price rate of package 1 to 5 pounds
    private double rateFiveToTen = 3.00; // price rate of package 5 to 10 pounds
    private double rateTenAndUp  = 4.00; // price rate of package 10 pound and up




} // end of Shipment class
