package com.bridgelabz.objectoriented.stock;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import com.bridgelabz.utility.*;

import jdk.jfr.events.FileWriteEvent;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class FinanceInsatitute 
{
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		
		int temp = 1;
		while(temp == 1)
		{
			System.out.println("1.create new account");
			System.out.println("2.for transection:");
			int choice = Utility.intInput();
		switch(choice)
		{
		
		case 1: System.out.println("Enter user name");
				String name =Utility.stringInput(); 
				System.out.println("Enter user amount");
				int amount = Utility.intInput();
				String file = "/home/bridgeit/Documents/json/share/user.json";
				
				boolean result = Implementation.createNewUser(file, name ,amount);
			     if(result == true)
			     {
			    	 System.out.println("new user register");
			     }
			     else
			     {
			    	 System.out.println("user already register");
			     }
			     break;
		
		case 2: System.out.println("1.to buy share:");
				System.out.println("2.to sell share:");
				int transaction = Utility.intInput();
				switch(transaction)
				{
				case 1: 
						System.out.println("Enter user name:");
						String userName =Utility.stringInput() ;
						System.out.println("Enter amount ");
						int buyAmount = Utility.intInput();
						System.out.println("Enter company Symbol");
						String symbol = Utility.stringInput();
						String file2 = "/home/bridgeit/Documents/json/share/transaction.json";
						
						Implementation.buy(userName, symbol, buyAmount,file2);
						break;
				case 2: 
					System.out.println("Enter user name:");
					userName =Utility.stringInput() ;
					System.out.println("Enter amount ");
					buyAmount = Utility.intInput();
					System.out.println("Enter company Symbol");
					symbol = Utility.stringInput();
					
					
					Implementation.sell(userName, symbol, buyAmount);
					break;
				}
				
		}	
		
		System.out.println("Do you want to continue press 1 or for stop press 2");
		temp = Utility.intInput();
		
	} 

	}

}
