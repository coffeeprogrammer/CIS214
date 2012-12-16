// TenRndArray.java
// Author:  Chad Botting
// Course:  CIS 214, fall 2012
// Date:    October 26, 2012
// Module 08 Homework, CIS 214, Problem 1, Random array with info on that array

import java.util.Random;

public class TenRndArray
{
    public static void main(String[] args)
    {
        int myArray[] = new int[10];
        Random myRandom = new Random();

        for(int x = 0; x < myArray.length; x++)
        {
            myArray[x] = 1 + myRandom.nextInt(65536);
        } // end of for loop
        System.out.println(arrMethod(myArray));
    } // end of main method

    public static int arrMethod(int[] anArray)
    {
        int count = 0;
        int avg;
        for(int x=0; x < anArray.length; x++)
        {
            count += anArray[x];
        } // end of for block
        avg = count / anArray.length;
        count = 0;
        for (int x=0; x < anArray.length; x++)
        {
            // System.out.println(anArray[x]);
            if(anArray[x] <= avg)
            {
                count++;
            }
        } // end of for block

        return count;
    } // end of Method
} // end of class