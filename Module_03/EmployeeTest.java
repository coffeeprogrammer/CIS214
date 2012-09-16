// Employee.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 12, 2012
// Module 03 Homework, CIS 214, Problem 2, test program for employee class

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee objFredWorker = new Employee("Fred", "Astaire", 3500.00);
        Employee objGingerWorker = new Employee("Ginger","Rogers", 3200.00);

        System.out.printf("%s %s makes %.2f in a year \n", objFredWorker.getFirstName(), objFredWorker.getLastName(),
                12*objFredWorker.getMonthlySalary());

        System.out.printf("%s %s makes %.2f in a year \n", objGingerWorker.getFirstName(), objGingerWorker.getLastName(),
                12*objGingerWorker.getMonthlySalary());

        // whatever rest of this stuff is easy I will finish later
        // give each employee a 10% raise

        objFredWorker.setMonthlySalary(objFredWorker.getMonthlySalary() + objFredWorker.getMonthlySalary() * .10);        // giving fred a 10% raise

        objGingerWorker.setMonthlySalary(objGingerWorker.getMonthlySalary() + objGingerWorker.getMonthlySalary() * .10);  // giving ginger a 10% raise

		System.out.println("\n After the raise \n");

        System.out.printf("%s %s makes %.2f in a year \n", objFredWorker.getFirstName(), objFredWorker.getLastName(),
        		12*objFredWorker.getMonthlySalary());

		System.out.printf("%s %s makes %.2f in a year \n", objGingerWorker.getFirstName(), objGingerWorker.getLastName(),
                12*objGingerWorker.getMonthlySalary());


    } // end of main method
} // end of EmployeeTest class
