package com.bridgelabz.objectoriented.stock;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import com.bridgelabz.utility.*;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class FinanceInsatitute 
{
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		System.out.println("1.create new account");
		System.out.println("2.for transection:");
		int choice = Utility.intInput();
		
		switch(choice)
		{
		case 1: System.out.println("Enter user name");
				String name =Utility.stringInput(); 
				String file = "/home/bridgeit/Documents/json/share/user.json";
				Implementation.createNewUser(file, name);
			
		}
		
	} 

	}


