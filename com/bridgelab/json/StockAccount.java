package com.bridgelab.json;

import java.io.IOException;
import java.util.Scanner;

import com.bridgelab.utilit.Utility;

public class StockAccount
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		int choice =0;
		AccounDetails account = new AccounDetails();
		Scanner scan = new Scanner(System.in);
     System.out.println("***************Sherkhan stock Exchange****************");
     do
     {
     System.out.println("1.Create a new account:");
     System.out.println("2.login");
     System.out.println("3.Exit");
     choice = Utility.intInput();
     switch(choice)
     {
     case 1:
    	 	System.out.println("Enter a name");
    	 	String name = scan.nextLine();
    	 	account.createAccount(name);
    	 	break;
     }
     }
     while(choice!=3);

}
}
