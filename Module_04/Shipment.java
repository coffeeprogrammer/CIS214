// Shipment.java

public class Shipment
{
    // constructor with no arguments
    public Shipment()
    {
        setWeight(0);
        setDistance(0);

    } // end of constructor method

    // constructor to pass the weight and distance
    public Shipment(int w, int d)
    {
        setWeight(w);
        setDistance(d);
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
    }

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

    public double getShippingCost()
    {
        if (weight <= 1)
        {
            return rateZeroToOne * distance;
        }
        else if (weight > 1 && weight <= 5)
        {
            return rateOneToFive * distance;
        }
        else if (weight > 5 && weight <= 10)
        {
            return rateFiveToTen * distance;
        }
        else if (weight > 10)
        {
            return rateTenAndUp * distance;
        }
        return -1;
    } // end of getShippingCost

    private double weight;
    private int distance;
    // declare variables for shipping rates so code can easily be updated
    private double rateZeroToOne = 2.00;
    private double rateOneToFive = 2.25;
    private double rateFiveToTen = 3.00;
    private double rateTenAndUp = 4.00;
} // end of Shipment class
