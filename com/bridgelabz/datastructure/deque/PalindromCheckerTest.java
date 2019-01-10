package com.bridgelabz.datastructure.deque;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Scanner;

import org.junit.Test;


import com.bridgelabz.utility.Utility;


public class PalindromCheckerTest
{

	@Test
	public void testPalindromTrue()
	{	String check1 = "Radar";

	boolean result =  Implementation.palindromCheker(check1);
	
    assertTrue(result);
  
				
	  
	}
	@Test
	public void testpalindromFalse()
	{
		String check = "Hello";
		
		boolean result1 = Implementation.palindromCheker(check);
		 
		assertFalse(result1);
	}

}
