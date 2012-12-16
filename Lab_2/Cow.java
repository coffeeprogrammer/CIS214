// Cow.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    November 30, 2012
// This is a sub class of the abstract animal class
// This is the class definition for Cow of the Lab2 project in CIS214

// Cow class extends Animal
// Checklist #8
public class Cow extends Animal
{
    public Cow(String n, String c, int a, String s)
    {
        // this subclass class makes a call to super()
        // calling super() calls the constructor of super class
        // Checklist #11
        super(n, c, a);
        sex = s;
    } // end of Cow constructor

    // The following code contains the three methods that are required to be overridden
    // Checklist #10
    @Override
    public String makeSound()
    {
        return "moooo";
    }

    @Override
    public String whatType()
    {
        return "Cow";
    }

    @Override
    public String toString()
    {
        String retval;
        retval = "I am a " + this.whatType() + ".  My name is " + this.getName() + ".  I am " + this.getAge() +
                " years old.  I am the color " + this.getColor() + ".  My sex is " + getSex() + ".";
        return retval;
    }

    // accessor, mutator, and non-inherited variable for this sub class
    // Checklist #9
    public String getSex()
    {
        return sex;
    }

    public void setSex(String s)
    {
        sex = s;
    }

    private String sex;

} // end of class Cow