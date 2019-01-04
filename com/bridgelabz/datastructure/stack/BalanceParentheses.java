package com.bridgelabz.datastructure.stack;

import com.bridgelabz.utility.Utility;

public class BalanceParentheses
{

	public static void main(String[] args)
	{
	System.out.println("Enter Expression:");
	String expression = Utility.stringInput();
	boolean balance = Utility.checkStable(expression);
	System.out.println("is my expression is balance:"+balance);

	}
   
}
