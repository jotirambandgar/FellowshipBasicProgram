package com.bridgelabz.datastructure.calender1;

public class Implementation 
{
	
	/**
	 * find day for date
	 * @param d-->date
	 * @param m-->month
	 * @param y--->year
	 * @return--->day code for finding day at that code
	 */
	public static int findDcode(int d,int m,int y)
	{
		int y0 = ((y - (14-m) / 12));

	int x = (y0 + y0/4 - y0/100 + y0/400);
	int m0 = (m + 12 * ((14 - m) / 12) -2);
	int d0 = (((d + x + 31*m0 / 12)%7));
	return d0;
	}
	//===========================================================================================================
	/**
	 * check entered year is 4 digit and whether it leap year or not
	 * @param year
	 * @return leap year or not
	 */
	public static String leapYear(int year)
	{
		
		if(year % 4 == 0 && year%100!=0||year%400==0)
		{
			return "leap year";
		}
			return "Not leap year";
	}
	//===================================================================================================================
	/**
	 * find number of day in particular month
	 * @param monthNumber
	 * @param year
	 * @return --> number of day
	 */
	public static int numberOfDaysInMonth(int monthNumber,int year)
	{
		Integer[] days= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		//Check if the year is leap year
		if(leapYear(year).equals("Leap Year"))
		{
			days[2]=29;
		}
		return days[monthNumber];
	}
//========================================================================================================================
	/**
	 * this method is use for printing calendar of month 
	 * @param startingDay 
	 * @param month
	 * @param year
	 */
	public static String[][] dayInMonth(int startingDay, int month, int year)
	{
		int endDAy=0;
		//day array
		
		//find number of day in month
		endDAy =numberOfDaysInMonth(month, year);
		int inc=1;
		int count=0;
		String noOfDayInMonth[][]=new String[6][7];
		//store day in array as string
		for(int i = 0 ; i < 6 ; i++)
		{
			
			for(int j =0 ; j < 7 ; j++)
			{
				if((j == startingDay || count != 0) && inc <= endDAy )
				{
					noOfDayInMonth[i][j]=Integer.toString(inc);
					inc++;
					count++;
				}
				else
					noOfDayInMonth[i][j]=" ";
			}
		}
		return noOfDayInMonth;
	
	}

}
