// Animal.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    November 30, 2012
// This is the abstract super class for Animal in the Lab2 project for CIS214

// animal class is declared abstract
// an abstract class is similar to an interface except that in an interface you can not
// implement any of your methods, with an abstract class you free to implement the methods that make
// sense to implement at the super class level. (obviously there is more to it than this)
// Checklist #2
public abstract class Animal
{
	public Animal(String n, String c, int a)
	{
		name = n;
		color = c;
		age = a;
        // animal constructor increamenting animalCount
        // Checklist #5
		animalCount++;
	} // end of Animal constructor

	// the following two methods are abstract which means that they have been
	// yet to be implemented.
	// The following code includes methods and fields required by the assignment document
    // Checklist #6 & #7
	public abstract String makeSound();

	public abstract String whatType();

	public String toString()
    {
        return "I am an animal";
    }

	public void setName(String n)
	{
		name = n;
	}

	public String getName()
	{
		return name;
	}

	public void setColor(String c)
	{
		color = c;
	}

	public String getColor()
	{
		return color;
	}

	public void setAge(int a)
	{
		age = a;
	}

	public int getAge()
	{
		return age;
	}

    // a static method for returning the count of the how many animal objects have been instantiated
    // Checklist #4
    public static int returnCount()
    {
        return animalCount;
    }

	private String name;
	private String color;
	private int age;
    // a static variable for storing how many of objects derived of the Animal type have been instantiated
    // Checklist #3
	static int animalCount;

} // end of Animal class
