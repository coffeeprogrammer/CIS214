// Date.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    September 11, 2012
// Module 03 Homework, CIS 214, Problem 1, a data structure class for storing dates.

// you could call this a data structure right?

public class Date
{
    // a constructor to initialize date objects
    public Date(int m, int d, int y)  // month, day, year respectively
    {
        setMonth(m);
        setDay(d);
        setYear(y);
    }

    void displayDate()
    {
        System.out.printf("%d/%d/%d\n", month, day, year);
        // i would rather use a function called getDate and return a string
    }

    // a mutator for month
    void setMonth(int m)
    {
         month = (byte)m;
    }

    // an accessor for month
    int getMonth()
    {
        return (int)month;
    }

    // a mutator for day
    void setDay(int d)
    {
        day = (byte)d;
    }

    // an accessor for day
    int getDay()
    {
        return (int)day;
    }

    // a mutator for year
    void setYear(int y)
    {
        year = (short)y;
    }

    // an accessor for year
    int getYear()
    {
        return (int)year;
    }

    // what is more import, processor time spent casting variables or memory saved
    // by converting lowest possible variables types
    // 1MiB is apx 87,000 objects. is it any better to use bytes and shorts?

    private byte month;   // I like using variable types that I no larger than
    private byte day;     // necessary, this date object could be stored in something
    private short year;   // else like an array and that would be a waste of space if we used intergers,
                          //  if you see this as a problem, let me know
}