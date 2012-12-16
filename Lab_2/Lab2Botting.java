// Lab2Botting.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    November 30, 2012
// The main application for the Lab2 in CIS214, Old McDonald's Farm
// CIS214 Lab2 Fun with Inheritance and Polymorphism

import javax.swing.JOptionPane;

public class Lab2Botting
{
	public static void main(String[] args)
	{
        // The following code declares seven animals, stores them in an array Animals and cycles
        // through the array for the output.
        // Checklist #12
        Animal[] Animals = new Animal[7];

        Pig oOscarPig   = new Pig("Oscar", "Pink", 3, "Politician"); // the first pig
        Animals[0] = oOscarPig;

        Pig oMayerPig =  new Pig("Mayer", "Pink", 5, "CEO of Haliburton"); // the second pig
        Animals[1] = oMayerPig;

        Sheep oDollySheep = new Sheep("Dolly", "White", 10, "Genetics");  // the first sheep, not the clone
        Animals[2] = oDollySheep;

        Cow oAbungaCow = new Cow("Abunga", "Black and White", 6, "Hermaphrodite"); // a cow, soon to be hamburger
        Animals[3] = oAbungaCow;

        Sheep oShySheep = new Sheep("Shy", "Black", 7, "Leadership"); // a second sheep, I guess we can make Mutton
        Animals[4] = oShySheep;

        Horse oManofWar = new Horse("Man-of-war", "Chestnut", 12, "Facebook");  // a very low IQ racing horse
        Animals[5] = oManofWar;

        // The following Sheep object is a deep copy of another Sheep object
        // Checklist #13
        Sheep oClonedDollySheep = new Sheep(oDollySheep);
        Animals[6] = oClonedDollySheep;

        Animals[6].setAge(4); // should change the age of the second dolly since it is a biologic clone

		// create a string to store and build the output the dialog box
        String message = "The number of animals on the farm is " + Animal.returnCount() + "\n\n";

        // loop thought all animals on the farm
        for (int x = 0; x < Animals.length; x++ )
        {
            // add the output of each toString method of the animal objects to a message variable
            message = message + "The animal in stall #" + x + ": " + Animals[x] + "\n";
        }

        // display a dialog box with characteristics of all animals on the farm
        JOptionPane.showMessageDialog(null,message, "Old McDonald's Farm", JOptionPane.PLAIN_MESSAGE);

	} // end of main method
} // end of Application class
