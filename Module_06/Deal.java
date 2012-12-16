// Deal.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    October 12, 2012
// Module 06 Homework, CIS 214, Problem 1, Test program for the Card.java class

public class Deal
{
    public static void main(String[] args)
    {
        Card objCardOne = new Card();
        objCardOne.deal();
        System.out.println(objCardOne.getCard());

        Card objCardTwo = new Card();
        objCardTwo.deal();
        System.out.println(objCardTwo.getCard());

        Card objCardThree = new Card();
        objCardThree.deal();
        System.out.println(objCardThree.getCard());

        Card objCardFour = new Card();
        objCardFour.deal();
        System.out.println(objCardFour.getCard());

        Card objCardFive = new Card();
        objCardFive.deal();
        System.out.println(objCardFive.getCard());
    } // end of main method
} // end of class
