package com.bridgelab.datastructure;
import com.bridgelab.utilit.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class OrderedListTest {
OrderedList <Integer> linkedlist = new OrderedList<>();
	@Test
	public void testOrderList()
	{
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
	     if(linkedlist.search(search))
	     {
	    	 linkedlist.remove(search);
	     }
	     else
	     {
	    	 linkedlist.add(search);
	     }
		 //assertFalse(linkedlist.isEmpty());
		// assertEquals(oldNumber.length, linkedlist.size());
		 linkedlist.display();
		String newnum = "";
		int count = 1 ;
		while(count != linkedlist.size()+1)
		{
			newnum = newnum+" "+linkedlist.get(count);
			count++;
		}
		System.out.println(newnum);
		assertNotEquals(oldnum,newnum);
		 
	}

}
