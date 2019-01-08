package com.bridgelabz.datastructure.queue;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;
/**
 * method for withdraw and deposit amount in bank
 * @param balance ---> already present amount in bank 
 * @param persons----> number of person in queue
 * @return-----> final balance in bank
 */
public class Implementation {
	
	public static int bankcounter(int balance,int persons)
	{
		Scanner scanner = new Scanner(System.in);
		Queue<Integer> queue = new Queue<>();
		int newbalance = 0;
		int count = 1;
		while(persons != 0 && balance > 0)
		{
			System.out.println("person: "+count);
			System.out.println("1 .for Deposit ");//ask to user for deposit
		 	System.out.println("2 .for withdraw");//ask to user for withdraw
		 	int choice = Utility.intInput();
		 	int amount = 0;
		 		switch(choice)
		 		{
		 		case 1:
		 			System.out.println("Enter amount for Deposit");
		 			amount = scanner.nextInt();
		 			queue.enqueue(amount);       // if want to deposit add money in queue
		 			balance = balance + amount;
		 			System.out.println("amount in bank:"+balance);
		 			persons--;
		 		 	count++;
		 		 	scanner.reset();
		 			break;
		 		case 2:
		 			System.out.println("Enter amount for Withdraw");
		 			amount =  scanner.nextInt();
		 			if(amount>balance)
					{
						System.out.println("Insufficient balance..!");
						break;
					}
		 			queue.enqueue(amount); // if want to 
		 			
		 			balance = balance - amount;
		 			System.out.println("amount in bank:"+balance);
		 			persons--;
		 		 	count++;
		 		 	scanner.reset();
		 			break;
		 		}
		 	}
		 	
		return (balance);
	}


}
