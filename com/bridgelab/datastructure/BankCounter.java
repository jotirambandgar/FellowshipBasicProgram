package com.bridgelab.datastructure;

import com.bridgelab.utilit.Utility;

public class BankCounter {

	public static void main(String[] args) 
	{
		System.out.println("Enter initital amount in bank");
		int balance = Utility.intInput();
		System.out.println("Enter number of pepole in queue");
		int persons = Utility.intInput();
		int amount =  Utility.bankcounter(balance,persons);
		System.out.println("new balance after total withdraws and deposit: "+amount);
	}

}
