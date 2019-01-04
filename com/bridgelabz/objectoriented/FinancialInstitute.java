package com.bridgelabz.objectoriented;

import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * create program for financial institute for register, maintain transaction record of user 
 * @author jotiram bandgar
 *4/1/2019
 */
public class FinancialInstitute
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		int choice =0;
		Account ac = new Account();
		Scanner scanner = new Scanner(System.in);
		System.out.println("***************Sherkhan stock Exchange****************");
		do
		{
			System.out.println("1.Create a new account:");
			System.out.println("2.for transaction");
			System.out.println("3.Exit");
			choice = Utility.intInput();
			switch(choice)
			{
			case 1:
					System.out.println("Enter a name");
					String name = scanner.nextLine();
					boolean result = Utility.createAccount(name);//creating new user json file
					if(result == true)//if file create 
					{
						System.out.println("new user register");
					}
					else//file not create 
					{
						System.out.println("user already register");
					}
					break;
			case 2:
					System.out.println("Enter register name:");
					name = scanner.nextLine();
					System.out.println("1.to buy");
					System.out.println("2.to sell");
					int choice2 = scanner.nextInt();
					switch(choice2)
					{
					case 1: 
							
							System.out.println("Enter Symbol of company:");
							String symbol = scanner.next();
							System.out.println("Enter amount to buy stock:");
							int amount = scanner.nextInt();
							int numberOfShare = ac.buy(name,amount, symbol);
							System.out.println("number of share buy:"+numberOfShare);
							break;
					case 2:
							System.out.println("Enter Symbol of company:");
							symbol = scanner.next();
							System.out.println("Enter amount to sell stock:");
							amount = scanner.nextInt();
							numberOfShare = ac.sell(name,amount, symbol);
							System.out.println("number of share sell:"+numberOfShare);
					        break;
					}
			}
			
		}
     while(choice!=3);

}
}
