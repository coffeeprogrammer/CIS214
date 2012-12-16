// Horse.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    November 30, 2012
// This is a sub class of the abstract animal class
// This is the class definition for Horse of the Lab2 project in CIS214

// Horse class extends Animal
// Checklist #8
public class Horse extends Animal
{
    public Horse(String n, String c, int a, String pt)
    {
        // this subclass class makes a call to super()
        // calling super() calls the constructor of super class
        // Checklist #11
        super(n, c, a);
        passTime = pt;
    } // end of Horse constructor

    // The following code contains the three methods that are required to be overridden
    // Checklist #10
    @Override
    public String makeSound()
    {
        return "clop clop clop";
    }

    @Override
    public String whatType()
    {
        return "Horse";
    }

    @Override
    public String toString()
    {
        String retval;
        retval = "I am a " + this.whatType() + ".  My name is " + this.getName() + ".  I am " + this.getAge() + " years old.  I am the color " +
                this.getColor() + ".  My favorite pass time is " + this.getPassTime()+ ".";
        return retval;
    }

    // accessor, mutator, and non-inherited variable for this sub class
    // Checklist #9
    public String getPassTime()
    {
        return passTime;
    }

    public void setPassTime(String pt)
    {
        passTime = pt;
    }

    private String passTime;

} // end of class Horse