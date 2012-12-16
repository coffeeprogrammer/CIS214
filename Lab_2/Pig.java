// Pig.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    November 30, 2012
// This is a sub class of the abstract animal class
// This is the class definition for Pig of the Lab2 project in CIS214

// Pig class extends Animal
// Checklist #8
public class Pig extends Animal
{
	public Pig(String n, String c, int a, String o)
	{
        // this subclass class makes a call to super()
        // calling super() calls the constructor of super class
        // Checklist #11
		super(n, c, a);
        occupation = o;
	} // end of Pig constructor

    // The following code contains the three methods that are required to be overridden
    // Checklist #10
	@Override
	public String makeSound()
	{
		return "Oink Oink";
	}

	@Override
	public String whatType()
	{
		return "Piggy";
	}

    @Override
    public String toString()
    {
        String retval;
        retval = "I am a " + this.whatType() + ".  My name is " + this.getName() + ".  I am " + this.getAge() + " years old.  I am the color " + this.getColor() +
                ".  My occupation is " + this.getOccupation() + ".";
        return retval;
    }

    // accessor, mutator, and non-inherited variable for this sub class
    // Checklist #9
    public String getOccupation()
    {
        return occupation;
    }

    public void setOccupation(String o)
    {
        occupation = o;
    }

    private String occupation;

} // end of Pig class
