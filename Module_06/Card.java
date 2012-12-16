// Card.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    October 12, 2012
// Module 06 Homework, CIS 214, Problem 1, Simple random card generating class

public class Card
{
    // constructor(s)
    Card()
    {
        counter++; // increment the static counter variable by one
    } // end of constructor

    public void deal()
    {
        int suiteval;
        // will randomly generate both an integer value between 1 and 13 and store it in rank
        // String value of hearts, diamonds, clubs, or spades that will be stored in suite.
        rank = (int)(Math.random()*13) + 1; // shift value of 1, scale value of 13
        // 1=hearts 2=diamonds 3=clubs 4=spades
        suiteval = (int)(Math.random()*4) + 1; // shift value of 1, scale value of 4
        switch (suiteval)
        {
            case 1:
                suite = "hearts";
                break;
            case 2:
                suite = "diamonds";
                break;
            case 3:
                suite = "clubs";
                break;
            case 4:
                suite = "spades";
                break;
            default:
                break;
        } // end of switch block
    } // end of method

    public String getCard()
    {
        // will return the rank and suite of a Card object when called. (and card count)
        String retval;
        retval = "Card " + counter + " has a value of " + rank + " and is a " + suite;
        return retval;
    } // end of method

    private int rank;
    private String suite;
    static private int counter;  // counts how many objects of this type have been instantiated
} // end of class