package com.bridgelab.functionalprogram;
import com.bridgelabz.utility.*;
/**
 * flip coin coin and calculate percentage of head and tails
 * @author jotiram bandgar
 *
 */
public class FlipCoin {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("*****Flip coin*****");
		System.out.println("Enter how many time you want to flip coin");
		int time =  Utility.intInput();
		Utility.coinOpt(time);

	}

}
