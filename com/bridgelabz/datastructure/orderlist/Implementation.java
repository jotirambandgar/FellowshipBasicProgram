package com.bridgelabz.datastructure.orderlist;

public class Implementation 
{
	public static  OrderedList checkNumberPresent(OrderedList  list,int number)
	{
		if(list.search(number))
	     {
	    	 list.remove(number);
	     }
	     else
	     {
	    	 list.add(number);
	     }
		return list;
		 
	}
}
