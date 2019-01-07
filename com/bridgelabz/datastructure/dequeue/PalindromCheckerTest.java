package com.bridgelabz.datastructure.dequeue;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import com.bridgelabz.utility.Utility;


public class PalindromCheckerTest
{

	@Test
	public void testPalindrom()
	{	
	  Scanner scan = new Scanner(System.in);
		System.out.println("1: for True testing:");
		System.out.println("2: for false testing:");
		System.out.println("Enter your choice:");
		int choice = Utility.intInput();
		switch(choice)
		{
		case 1:	
			
				System.out.println("Enter string:");
				String check1 = scan.nextLine();
				
				boolean result =  Implementation.palindromCheker(check1);
				System.out.println(result);
			    assertTrue(result);
			   	break;
			
				
		case 2: 
				System.out.println("Enter string:");
				String check2 = scan.nextLine();
				boolean result1  = Implementation.palindromCheker(check2);
				assertFalse(result1);
				//System.out.println("hii");
				break;
				
	   default: 
	   			
	   			System.out.println("Invalid choice");
				break;
	   				
		}
	}

}
