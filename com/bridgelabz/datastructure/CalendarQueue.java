package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.queue.Queue;
import com.bridgelabz.utility.Utility;

public class CalendarQueue {
public static void main(String args[])
	{
	// TODO Auto-generated method stub
	   int month = Integer.parseInt(args[0]);
	   int year = Integer.parseInt(args[1]);
	   int count =0 ;
    //find day at first date of month 
    int startDay = Utility.findDcode(1, month, year);
    //print calendar of month
    String dayOfMonth[][] = Utility.dayInMonth(startDay,month,year);
    String day[]= {"sun", "mon", "tues", "wed", "thu", "fri" , "sat"};
    Queue <String> queue = new Queue<String>();
	for(int i = 0 ; i < 7 ; i++)
	{
	System.out.print("     "+day[i]);
	}
	System.out.println("");
	//add element into queue
	  for(int i = 0 ; i < 6 ; i++)
	   {
		for(int j = 0 ; j < 7 ; j++)
		{
			queue.enqueue(dayOfMonth[i][j]);
		}
		}
	  System.out.println("size:"+queue.size());
	  queue.display();
//	for(int i = 0 ; i < 6 ; i++)
//	{
//		
//		for(int j = 0 ; j < 7 ; j++)
//		{
//			String s = queue.get(count);
//		
//			if(s.length()<2)
//			{
//				System.out.print("       "+s);
//			}
//			else
//			{
//			System.out.print("      "+s);
//			}
//			count++;
//		}
//		System.out.println("");
//		}

}
}