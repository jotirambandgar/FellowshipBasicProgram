package com.bridgelab.datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import static org.junit.Assert.*;
import org.junit.Test;

import com.bridgelab.utilit.Utility;

public class WordList {
   static UnOrderList<String> list = new UnOrderList<>();
	public static void main(String[] args) 
	{
     String file = "/home/bridgeit/Desktop/jotiram/word.txt";
     UnorderAddOpt(file);
     System.out.println("Enter a search word:");
     String search = Utility.stringInput();
	}
	
	
//===========================add element==========================================	
	@Test
    public static void UnorderAddOpt(String address)
    {
    	     
		String fileContain = Utility.readAllFromFile(address);  
    	     String array[] =fileContain.split(" ");
    	 ;
    	     for(int i = 0; i < array.length;i++)
    	     {
    	    	 list.add(array[i]);
    	     }
    	    assertFalse(list.isEmpty());
    }
}
