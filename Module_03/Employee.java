// Employee.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 12, 2012
// Module 03 Homework, CIS 214, Problem 2, Description

public class Employee
{
    // a constructor for the Employee class
    // all public methods.
    public Employee(String f, String l, double s) // first name, last name, salary respectively
    {
        setFirstName(f);
        setLastName(l);
        setMonthlySalary(s);
    }

    public void setFirstName(String aFirstName)
    {
        firstName = aFirstName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setLastName(String aLastName)
    {
        lastName = aLastName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setMonthlySalary(double aSalary)
    {
        if (aSalary < 0)
        {
            // if monthly salary is less than zero, set salary equal to zero
            monthlySalary = 0.00;
        }
        else
        {
            monthlySalary = aSalary;
        }
    } // end of setMonthlySalary method

    public double getMonthlySalary()
    {
        return monthlySalary;
    }
    // end of public methods

    // set the private instance variables

    private String firstName;
    private String lastName;
    private double monthlySalary;
}  // end of Employee class
