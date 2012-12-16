// TemperatureConverter.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    October 12, 2012
// Module 06 Homework, CIS 214, Problem 3, Stores and converts temperatures between fahrenheit and celsius

public class TemperatureConverter
{
    // constructor(s)
    TemperatureConverter()
    {

    } // end of constructor

    public void Convert()
    {
        // you must use the equals method rather than the == operator
        // because the == operator checks whether the references to the objects are equal
        if (tempUnit.equals("C"))
        {
            temperature *= 1.8;
            temperature += 32;
            tempUnit = "F";
        }
        else if (tempUnit.equals("F"))
        {
            temperature -= 32;
            temperature /= 1.8;
            tempUnit = "C";
        }
        else
        {
            System.out.println("tempUnit value invalid");
        }
    } // end of Convert method

    public void setTemp(double t)
    {
        temperature = t;
    } // end of setTemp method

    public double getTemp()
    {
        return temperature;
    } // end of getTemp method

    public void setUnits(String u)
    {
        tempUnit = u;
    } // end of setUnits method

    public String getUnits()
    {
        return tempUnit;
    } // end of getUnits method

    private double temperature;
    private String tempUnit;
} // end TemperatureConverter class