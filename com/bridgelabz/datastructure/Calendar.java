package com.bridgelabz.datastructure;
import java.util.Scanner;

import com.bridgelabz.utility.*;
/**
 * print calendar of enter month and year
 * @author jotiram bandgar
 *
 */
public class Calendar {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		   int month = Integer.parseInt(args[0]);
		   int year = Integer.parseInt(args[1]);
          
           //find day at first date of month 
           int startDay = Utility.findDcode(1, month, year);
           //print calendar of month
          String dayOfMonth[][] = Utility.dayInMonth(startDay,month,year);
          String day[]= {"sun", "mon", "tues", "wed", "thu", "fri" , "sat"};
      	for(int i = 0 ; i < 7 ; i++)
		{
		System.out.print("     "+day[i]);
		}
		System.out.println("");
		for(int i = 0 ; i < 6 ; i++)
		{
			
			for(int j = 0 ; j < 7 ; j++)
			{
				String s = dayOfMonth[i][j];
				if(s.length()<2)
				{
					System.out.print("       "+s);
				}
				else
				{
				System.out.print("      "+s);
				}
			}
			System.out.println("");
			}
	}

}