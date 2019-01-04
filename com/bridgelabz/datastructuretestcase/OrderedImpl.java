package com.bridgelabz.datastructuretestcase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import com.bridgelabz.utility.Utility;


public class OrderedImpl {

	public static void main(String[] args) throws IOException, Exception
	{
		// TODO Auto-generated method stub
		
	FileReader file = new FileReader("/home/bridgeit/eclipse-workspace/Fellowship/Fellowship/com/bridgelab/utilitydatastructure/number.txt");
    BufferedReader br = new BufferedReader(file);
    int arr[];
      String s;
	
	while((s = br.readLine()) != null)
	{
		System.out.println(s);
		String str[] = s.split(" ");
		operation(str,s);
	}
	}
	public static void operation(String arr[],String s) throws Exception
	{
		OrderedList<Integer> oll = new OrderedList<>();
		for(int i = 0; i < arr.length ;i++ )
		{
			oll.add(Integer.parseInt((arr[i])));
			
		}
	     oll.display();
	     System.out.println("Enter search number");
	     int number = Utility.intInput();
	     boolean result = oll.search(number);
	     System.out.println("is my number present in list:"+result);
	     if(result == true)
	     {      
	    	 System.out.println("Remove from list:"+number);
	    	 	oll.remove(number);
	     }
	     else
	     {
	    	 System.out.println("add to list:"+number);
	    	 oll.add(number);
	     }
	     System.out.println("UnOrderLinkedList afer operation:");
	     oll.display();
     

}
}
