package com.bridgelabz.datastructure.queue;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BankCounter {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter initital amount in bank");
		int balance = Utility.intInput();
		System.out.println("Enter number of pepole in queue");
		int persons = scanner.nextInt();
		int amount =  Implementation.bankcounter(balance,persons);
		System.out.println("new balance after total withdraws and deposit: "+amount);
	}

}
