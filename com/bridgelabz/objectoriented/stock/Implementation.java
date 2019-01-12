package com.bridgelabz.objectoriented.stock;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.io.JsonStringEncoder;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONArray;

public class Implementation
{
	static ObjectMapper mapper = new ObjectMapper();

public static boolean createNewUser(String file,String name, int amount) throws JsonGenerationException, JsonMappingException, IOException
{
 
	// if no entry present in list
	if(new File(file).length() == 0)
	{
		FileWriter fr = new FileWriter(file);
		fr.write("[]");
	
	   	User newUser = new User();
	   	LinkedList<User> list = new LinkedList<>();
	   	
		newUser.setUserName(name);
		newUser.setUserAmount(amount);
		//used java local date feature
		LocalDate date = LocalDate.now();
		String date1 = date.toString();
		newUser.setDate(date1);
		//add new user in file
		list.add(newUser);
		System.out.println(list);
		mapper.writeValue(new File(file),list);
	
		return true;
	}


	//if object present json array 
	else
	{
		LinkedList<User> alreadyUser = mapper.readValue(new File(file),new TypeReference<LinkedList<User>>(){});
	   	User newUser = new User();
		
		for(User check:alreadyUser)
		{
		if(check.getUserName().equals(name))
		{
			return false;
		}
		}
		newUser.setUserName(name);
		newUser.setUserAmount(amount);
		LocalDate date = LocalDate.now();
		String date1 = date.toString();
		newUser.setDate(date1);
		alreadyUser.add(newUser);
	
		mapper.writeValue(new File(file),alreadyUser);
		return true;
		
 }
	
}
// for buy share 
	public static void buy(String name,String symbol,int amount,String file) throws JsonGenerationException, JsonMappingException, IOException
	{
		
		LinkedList<CompanyShare> company = mapper.readValue(new File("/home/bridgeit/Documents/json/share/company.json"), new TypeReference<LinkedList<CompanyShare>>(){});
          LinkedList<User> user = mapper.readValue(new File("/home/bridgeit/Documents/json/share/user.json"), new TypeReference<LinkedList<User>>(){});
          boolean tempUser = false ;
          boolean tempComp = false ;
          int count1 = 0;
          int count2 = 0;
          int tempCountUser =0 ;
          int tempCountComp =0 ;
          tempComp = true;
		  String companyName ="" ;
		  String symbol1= "";
		  int price = 0;
          for(User user1 :user )
          {
        	 if(user1.getUserName().equals(name))
        	 {
        		 tempUser = true ;
        		 
        		 tempCountUser = count1;
        	 }
        	 count1++;
          }
          
          if(tempUser == false)
          {
        	  System.out.println("User Not register");
        	  
          }
          for(CompanyShare share : company)
          {
        	  if(share.getSymbol().equals(symbol))
        	  {
        		  tempComp = true;
        		   companyName = share.getName();
        		   symbol1 = share.getSymbol();
        		  price = share.getPrice();
        		  tempCountComp = count2;
        	  }
        	  count2++;
          }
          if(tempComp == false)
          {
        	  System.out.println("Invalid symbol");
        	  
          }
          int sharePrice = company.get(tempCountComp).getPrice();
          int numberOfCompShare = company.get(tempCountComp).getShare();
          int numOfShareBuy = amount/sharePrice ; 
          int companyShareNumber = numberOfCompShare -numOfShareBuy;
          company.get(tempCountComp).setShare(companyShareNumber);
          Transaction transaction = new Transaction();
           transaction.setUserName(name);
           transaction.setCompanyName(companyName);
           transaction.setNumber(numOfShareBuy);
           LocalDate date = LocalDate.now();
   		String date1 = date.toString();
   		transaction.setDate(date1);
   		System.out.println(transaction);
       System.out.println(company);
	}
}

