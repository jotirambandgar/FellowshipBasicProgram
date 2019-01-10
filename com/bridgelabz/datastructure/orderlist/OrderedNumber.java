package com.bridgelabz.datastructure.orderlist;

import com.bridgelabz.utility.*;

public class OrderedNumber 
{
	public static void main(String args[])
	{
		OrderedList <Integer> linkedlist = new OrderedList<>();
	
		String file ="/home/bridgeit/Desktop/jotiram/number.txt";
		String oldnum = Utility.readAllFromFile(file);
		String num[] = oldnum.split(" ");
		int oldNumber[] = new int[num.length];
		for(int i = 0; i <oldNumber.length;i++ )
		{
			oldNumber[i] =(int) Integer.parseInt(num[i]);
		}
		
		 for(int i = 0; i < oldNumber.length;i++)
	     {
	    	 linkedlist.add(oldNumber[i]);                  //add element into list    
	     }
		 linkedlist.display();
		 System.out.println("Enter Search number:");
	     int search = Utility.intInput();
	    Implementation.checkNumberPresent(linkedlist, search);
		 
		 linkedlist.display();
		String newnum = "";
		int count = 1 ;
		while(count != linkedlist.size()+1)
		{
			newnum = newnum+" "+linkedlist.get(count);
			count++;
		}
		System.out.println(newnum);
 
	}

}
