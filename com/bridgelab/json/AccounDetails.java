package com.bridgelab.json;

import java.io.File;
import java.io.IOException;

public class AccounDetails
{
public void createAccount(String name) throws IOException,Exception
{
	
	File file = new File("/home/bridgeit/Documents/json/"+name+".json");
	System.out.println(""+file.createNewFile());
	if(file.createNewFile()== false)
	{
	System.out.println("user already registerd:");
	}
	else
	{
		System.out.println("new user register");
	}
}
}
