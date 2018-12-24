package com.bridgelab.firstweek.functionalprogram;
import java.util.ArrayList;

import com.bridgelab.utilit.*;
/**
 * compute prime factors of number
 * @author jotiram bandgar
 *21/12/2018
 */
public class PrimeFactors 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 int Number;
		 ArrayList<Integer>factors = new ArrayList<Integer>();
         System.out.println("enter a number that u want find prime factors");
         Number=Utility.intInput();
         factors.addAll(Utility.primeFacCal(Number));
         System.out.println("Prime factors of "+Number);
         for(int fact : factors)
         {
        	System.out.print(" "+fact);
         }

	}

}
