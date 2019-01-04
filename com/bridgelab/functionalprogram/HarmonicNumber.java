package com.bridgelab.functionalprogram;
import com.bridgelabz.utility.*;
/**
 * compute harmonic series
 * by calculating 1/1 + 1/2 + 1/3 + ... + 1/N
 * @author jotiram bandgar
 *
 */
public class HarmonicNumber {

	public static void main(String[] args)
	{
			// TODO Auto-generated method stub
			System.out.println("Enter positive Integer");
			int number = Utility.intInput();
			while(number<0)              // check enter number is positive or negative 
			{
			number = Utility.intInput();
			}
			float harmonicNumber = Utility.harmonicCalculation(number);
			System.out.println(number+"th harmonic number= "+harmonicNumber);
	}

}
