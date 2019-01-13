package com.bridgelabz.objectoriented.stock;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
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
		
	FileWriter fr = new FileWriter(file);
	fr.write("[]"+"[]");
		LinkedList<CompanyShare> company = mapper.readValue(new File("/home/bridgeit/Documents/json/share/company.json"), new TypeReference<LinkedList<CompanyShare>>(){});
          LinkedList<User> user = mapper.readValue(new File("/home/bridgeit/Documents/json/share/user.json"), new TypeReference<LinkedList<User>>(){});
          User tempUser1 = new User();
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
        	    tempUser1 = user.get(tempCountUser);
        		 
        		
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
          //fetch details user buy that company symbol  
          CompanyShare userShare = company.get(tempCountComp);
          //edit number of share in company list 
          int sharePrice = company.get(tempCountComp).getPrice();
          int numberOfCompShare = company.get(tempCountComp).getShare();
          //calculate number of share  user buy
          int numOfShareBuy = amount/sharePrice ;
          //calculate number of share company have after buying
          int companyShareNumber = numberOfCompShare - numOfShareBuy;
         
          //check amount is sufficient for buying share
          if(amount<sharePrice || tempUser1.getUserAmount()<amount)
          {
        	  System.out.println("invalid amount");
        	  return;
          }
          int newUserAmount = tempUser1.getUserAmount() - amount;
         user.get(tempCountUser).setUserAmount(newUserAmount);
          Transaction transaction = new Transaction();
          userShare.setShare(numOfShareBuy);
          transaction.setUserName(name);
          //add to user share
         transaction.setShare(userShare);
       
         
       mapper.writeValue(new File(file), transaction);
        mapper.writeValue(new File("/home/bridgeit/Documents/json/share/user.json"), user);
      //update COMPANY share
        company.get(tempCountComp).setShare(companyShareNumber);
        mapper.writeValue(new File("/home/bridgeit/Documents/json/share/company.json"), company);
	}
public static void sell(String name,String Symbol,int amount  ) throws JsonParseException, JsonMappingException, IOException
{
	 //copy file path into string
	String userFile = "/home/bridgeit/Documents/json/share/user.json";
	String companyFile = "/home/bridgeit/Documents/json/share/company.json";
	String transactionFile = "/home/bridgeit/Documents/json/share/transaction.json";
	//for desire transaction
	Transaction userTransaction = new Transaction();
//for counter use
	int userCount = 0 ;
	int companyCount = 0 ;
	int transactionCount = 0;
	int count = 0;
	boolean check = true ;
	//check file content any value
	if(new File(userFile).length() == 0)
	{
		System.out.println("No element for sell");
		return;
	} 
	
	
	//store all transaction details
	LinkedList<Transaction> transaction = mapper.readValue(new File(transactionFile),new TypeReference<LinkedList<Transaction>>() {} );
	for(Transaction trans : transaction)
	{
		if(trans.getUserName().equals(name))
		{
		transactionCount = count;
		}
		count ++;
	}
	int numberOfShare = transaction.get(transactionCount).getShare().getShare();
	int sharePrice = transaction.get(transactionCount).getShare().getPrice();
	int shareSell = amount/sharePrice;
	if(shareSell>numberOfShare)
	{
		System.out.println("invalid amount");
		return;
	}
	numberOfShare = numberOfShare - shareSell;
	transaction.get(transactionCount).getShare().setShare(numberOfShare);
	mapper.writeValue(new File(transactionFile), transaction);
	
}
}

