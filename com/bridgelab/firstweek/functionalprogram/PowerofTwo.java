package com.bridgelab.firstweek.functionalprogram;
import com.bridgelab.utilit.*;
	public class PowerofTwo
	{
	public static void main(String[] args)
	{
		int number = Integer.parseInt(args[0]);
		while(number>32)
		{
			System.out.println("Enter number less than 32");
			number = Utility.intInput();
		}
		 int power[] = Utility.powerCalcu(number);
		 for(int i = 0 ; i < power.length;i++)
		 {
			 System.out.println("2^"+i+" = "+power[i]);
		 }
	}
	}

