package com.bridgelab.firstweek.functionalprogram;

import com.bridgelab.utilit.Utility;

public class Coupons 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter numbers of coupons");
		int coupons = Utility.intInput();
		Utility.uniqueRandom(coupons);
		
	}

}
