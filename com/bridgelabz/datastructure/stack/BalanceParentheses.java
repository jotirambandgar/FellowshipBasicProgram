package com.bridgelabz.datastructure.stack;

import java.util.Scanner;



public class BalanceParentheses
{

	public static void main(String[] args)
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Expression:");
	String expression = scanner.nextLine();
	boolean balance = Implementation.checkStable(expression);
	System.out.println("is my expression is balance:"+balance);

	}
   
}
