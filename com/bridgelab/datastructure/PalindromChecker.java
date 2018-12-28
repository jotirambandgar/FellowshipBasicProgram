package com.bridgelab.datastructure;
import com.bridgelab.utilit.*;
public class PalindromChecker {

	public static void main(String[] args) 
	{
	System.out.println("Enter a string:");
	String check = Utility.stringInput();
	boolean result = Utility.palindromCheker(check);
	System.out.println("is my String palindrom:"+result);
	}

}
