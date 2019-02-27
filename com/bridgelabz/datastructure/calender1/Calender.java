package com.bridgelabz.datastructure.calender1;

import java.util.Scanner;

public class Calender {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter month and year:");
		int month = scanner.nextInt();
		int year =  scanner.nextInt();
          
        //find day at first date of month 
        int startDay = Implementation.findDcode(1, month, year);
        //print calendar of month
        String dayOfMonth[][] = Implementation.dayInMonth(startDay,month,year);
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
      	scanner.close();
	}


}
