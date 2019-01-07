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
		   int month;
		   int year;
	       Scanner scan = new Scanner(System.in);
           System.out.println("Enter month and year");
           month=scan.nextInt();
           year=scan.nextInt();
           //find day at first date of month 
           int startDay = Utility.findDcode(1, month, year);
           //print calendar of month
           Utility.printCalender(startDay,month,year);
	}

}