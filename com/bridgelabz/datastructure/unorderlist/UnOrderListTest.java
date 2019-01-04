package com.bridgelabz.datastructure.unorderlist;

import java.io.BufferedReader;
import java.io.FileReader;
import static org.junit.Assert.*;
import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class UnOrderListTest {
   static UnOrderList<String> list = new UnOrderList<>();	
   

   @Test
    public void UnorderAddOpt() throws Exception
    {
			 String file = "/home/bridgeit/Desktop/jotiram/word.txt";
			 String oldFileContent = Utility.readAllFromFile(file);  
    	     String array[] =oldFileContent.split(" "); // add element into array
    	     for(int i = 0; i < array.length;i++)
    	     {
    	    	 list.add(array[i]);                  //add element into list    
    	     }
    	     list.display();
    	     System.out.println("Enter Search word:");
    	     String search = Utility.stringInput();
    	     assertFalse(list.isEmpty());           //test after adding my list is empty
     	  
    	     System.out.println(""+list.search(search));
    	     if(list.search(search))     
    	     {
    	    	 assertTrue(list.search(search)); //test is search method
    	    	 list.remove(search);
    	     }
    	     else 
    	     {
    	    	 assertFalse(list.search(search));//if element not present in list	
    	    	 list.add(search);
    	     }
    	     list.display();                      //display new list
    	     int i=1;
    	   String newList = "";
    	    	while(i!=list.size()+1)
    	    	{
    	    		newList = newList+" "+list.get(i);
    	    		i++;
    	    	}
   
    	     Utility.writeIntoFile(file, newList);     //write content of new linkedlist into file
    	     String newFilecontent =Utility.readAllFromFile(file);
    	     assertNotEquals(oldFileContent, newFilecontent); //test after performing operation file content change or not
    }
}
