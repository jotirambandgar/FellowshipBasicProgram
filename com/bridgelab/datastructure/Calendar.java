package com.bridgelab.datastructure;
import java.util.Scanner;
import com.bridgelab.utilit.*;
public class Calendar {
public static void fndSday(int m, int y)
{
	int start_Day = Utility.findDcode(1, m, y);
	printCalender(start_Day,m,y);
}
public static void printCalender(int sd, int m, int y)
{
	int endy=0;
	String day[]= {"sun", "mon", "tues", "wed", "thu", "fri" , "sat"};
	if(m == 1)
	{
		endy=31;
	}
	if(m == 2)
	{
	if(y % 2 == 0)
		{
		endy = 29;
		}
		endy = 28;
	}
	if(m == 3)
	{
		endy = 31;
	}
	if(m == 4)
	{
		endy = 30;
	}
	if(m == 5)
	{
		endy = 31;
	}
	if(m == 6)
	{
		endy = 30;
	}
	if(m == 7)
	{
		endy = 31;
	}
	if(m == 8)
	{
		endy = 31;
	}
	if(m == 9)
	{
		endy = 30;
	}
	if(m == 10)
	{
		endy = 31;
	}
	if(m == 11)
	{
		endy = 30;
	}
	if(m == 12)
	{
		endy = 31;
	}
	int inc=1;
	int c=0;
	String pat[][]=new String[6][7];
	for(int i = 0 ; i < 6 ; i++)
	{
		
		for(int j =0 ; j < 7 ; j++)
		{
			if((j == sd || c != 0) && inc <= endy )
			{
				pat[i][j]=Integer.toString(inc);
				inc++;
				c++;
			}
			else
				pat[i][j]=" ";
		}
	}
	for(int i = 0 ; i < 7 ; i++)
	{
	System.out.print("     "+day[i]);
	}
	System.out.println("");
	for(int i = 0 ; i < 6 ; i++)
	{
		
		for(int j = 0 ; j < 7 ; j++)
		{
			String s = pat[i][j];
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
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		   int m;
		   int y;
	       Scanner scan = new Scanner(System.in);
           System.out.println("Enter month and year");
           m=scan.nextInt();
           y=scan.nextInt();
           fndSday(m,y);
	}

}