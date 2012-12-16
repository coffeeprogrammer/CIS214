// Sheep.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    November 30, 2012
// This is a sub class of the abstract animal class
// This is the class definition for Sheep of the Lab2 project in CIS214

// Sheep class extends Animal
// Checklist #8
public class Sheep extends Animal
{
    public Sheep(String n, String c, int a, String ts)
    {
        // this subclass class makes a call to super()
        // calling super() calls the constructor of super class
        // Checklist #11
        super(n, c, a);

        topSkill = ts;
    } // end of sheep constructor

    // Constructor for performing a deep copy of a sheep object
    public Sheep(Sheep anotherSheep)
    {
        // this should preform a deep copy of another sheep object
        super(anotherSheep.getName(), anotherSheep.getColor(), anotherSheep.getAge());

        topSkill = anotherSheep.getTopSkill();

    } // end of deep copy constructor

    // The following code contains the three methods that are required to be overridden
    // Checklist #10
    @Override
    public String makeSound()
    {
        return "baaaa";
    }

    @Override
    public String whatType()
    {
        return "Sheep";
    }

    @Override
    public String toString()
    {
        String retval;
        retval = "I am a " + this.whatType() + ".  My name is " + this.getName() + ".  I am " + this.getAge() +
                " years old.  I am the color " + this.getColor() + ".  My top skill is " + this.getTopSkill();
        return retval;
    }

    // accessor, mutator, and non-inherited variable for this sub class
    // Checklist #9
    public String getTopSkill()
    {
        return topSkill;
    }

    public void setTopSkill(String ts)
    {
        topSkill = ts;
    }

    private String topSkill;

} // end of class Sheep
