// TemperatureConverterTest.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    October 12, 2012
// Module 06 Homework, CIS 214, Problem 3, Test application for TemperatureConverter class

import java.util.Scanner;

public class TemperatureConverterTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        TemperatureConverter aTemp = new TemperatureConverter();

        System.out.print("enter temperature: ");
        aTemp.setTemp(input.nextDouble());
        System.out.print("enter units (F/C): ");
        aTemp.setUnits(input.next());
        aTemp.Convert();
        System.out.println(aTemp.getTemp() + " " + aTemp.getUnits());

    } // end of main method
} // end of class