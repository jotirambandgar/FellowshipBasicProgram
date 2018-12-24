package com.bridgelab.firstweek.functionalprogram;
import com.bridgelab.utilit.*;

			
	/**
	 * this program calculate number of times player win,loss,percentage of win,loss
	 * by declaring stack,goal,trials 
	 * @author jotiram bandgar
	 * 22/12/2018
	 *
	 */
	public class Gambler 
		{
		public static void main(String[] args)
		{
		int stake;
		int goal;
		int trials;
		System.out.println("Enter stack,goal,trials");
		stake = Utility.intInput();
		goal = Utility.intInput();
		trials = Utility.intInput();
		Utility.gameRecord(stake, goal, trials);

			}
			}


