// Employee.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 12, 2012
// Module 03 Homework, CIS 214, Problem 2, Description

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee objFredWorker = new Employee("Fred", "Astaire", 3500.00);
        Employee objGingerWorker = new Employee("Ginger","Rogers", 3200.00);

        System.out.printf("%s %s makes %.2f in a month", objFredWorker.getFirstName(), objFredWorker.getLastName(),
                objFredWorker.getMonthlySalary());

        System.out.printf("%s %s makes %.2f in a month", objGingerWorker.getFirstName(), objGingerWorker.getLastName(),
                objGingerWorker.getMonthlySalary());

        // whatever rest of this stuff is easy I will finish later

    } // end of main method
} // end of EmployeeTest class
