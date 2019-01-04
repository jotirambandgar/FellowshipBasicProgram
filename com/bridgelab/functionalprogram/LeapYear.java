package com.bridgelab.functionalprogram;
import com.bridgelabz.utility.*;

/**
 * check enter year is leap year or not
 * this program simply check reminder
 * @author jotiram bandgar
 *
 */
public class LeapYear 
	{
		public static void main(String[] args)
		{
			System.out.println("Enter a leap year:");
			int year = Utility.intInput();
			while(Integer.toString(year).length()<4 || year<0)
			{
				System.out.println("Enter valid year:");
				year = Utility.intInput();
			}
			String result=Utility.leapYear(year);
			System.out.println(result);

		}
	}
