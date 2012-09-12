// DateTest.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 11, 2012
// Module 03 Homework, CIS 214, Problem 1, Test program for the date class

import java.util.Scanner;

public class DateTest
{
    public static void main(String[] args)
    {
        System.out.println("Chad's date test program for date class");
        System.out.println("---------------------------------------\n");

        Scanner DateInput = new Scanner(System.in);
        // cool, I have NEVER used regular expression in a program before.
        DateInput.useDelimiter("[/ \n]");    // change the Scanner default delimiter from white space
                                             // to a back slash, found this in the JAVA API docs and the newline thing

        // when I first did this I assumed java would automatically cast to right type in the
        // class, rather than having the programmer have to cast every time I do the casting in the class
        // its self, let me know what you think
        Date objMyBirthday = new Date(9, 27, 1984);
        Date objAmericaStarts = new Date(7, 4, 1776);
        Date objMoonLanding = new Date(7, 20, 1969);

        objMyBirthday.displayDate();
        objAmericaStarts.displayDate();
        objMoonLanding.displayDate();

        Date objYourBirthday;  // I am assuming at this point this equals null

        System.out.println("Please enter your birthday in the form MM/DD/YYYY");
        System.out.println("--------------------------------------------------\n");
        objYourBirthday = new Date(DateInput.nextInt(), DateInput.nextInt(), DateInput.nextInt());
        System.out.println("Your birthday is: \n");

        objYourBirthday.displayDate();
    }
}