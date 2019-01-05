package com.bridgelabz.objectoriented;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
public class Account 
{
	ObjectMapper mapper = new ObjectMapper();

	File file = new File("/home/bridgeit/eclipse-workspace/Fellowship/Fellowship/com/bridgelabz/objectoriented/companyshare.json");
	 int numberOfShare = 0;
	 List<PojoInstitute> shareDetails = new LinkedList<PojoInstitute>();//list for storing details
	  List<PojoInstitute> userShareDetails = new LinkedList<PojoInstitute>();
/**
 * this method use for buying share and update into original file
 * @param amount-->for buy share
 * @param symbol-->company symbol
 * @return--> number of share buy by the user
 * @throws JsonParseException
 * @throws JsonMappingException
 * @throws IOException
 */
public int buy(String user,int amount,String symbol) throws JsonParseException, JsonMappingException, IOException
{
	 
	  File userFile = new File("/home/bridgeit/Documents/json/"+user+".json");
	 
	  shareDetails = mapper.readValue(file, new TypeReference<List<PojoInstitute>>(){});//convert json into java
	  userShareDetails = mapper.readValue(userFile, new TypeReference<List<PojoInstitute>>(){});//convert json into java
	  for(int i = 0 ; i < shareDetails.size();i++)
	  {
		  if(shareDetails.get(i).getSymbol().equals(symbol)) //if symbol match
		  {
		   userShareDetails.add(shareDetails.get(i));
		   int price = shareDetails.get(i).getPrice();//store value of per stock
		   numberOfShare =amount/price;               // calculate number of share buy
		  
		   int number = shareDetails.get(i).getNumber_of_share();
		   number = number - numberOfShare;
		   shareDetails.get(i).setNumber_of_share(number);//change original share number into resultant
		}
	  }
	  mapper.writeValue(file, shareDetails);              //write updated values into company json file
	  for(int i = 0 ; i < userShareDetails.size();i++)
	  {
		  if(userShareDetails.get(i).getSymbol().equals(symbol))
		  {
			  int userShareNumber = userShareDetails.get(i).getNumber_of_share();
			  userShareNumber +=numberOfShare;
			  userShareDetails.get(i).setNumber_of_share(userShareNumber);
		  }
	  }
	  mapper.writeValue(userFile, userShareDetails);     //write updated values into user json file
      	
      		return numberOfShare;
}
public int sell(String user,int amount,String symbol) throws JsonParseException, JsonMappingException, IOException
{
	  File userFile = new File("/home/bridgeit/Documents/json/"+user+".json");
	  userShareDetails = mapper.readValue(file, new TypeReference<List<PojoInstitute>>(){});//convert json into java
	/*  for(int i = 0 ; i < shareDetails.size();i++)
	  {
		  if(shareDetails.get(i).getSymbol().equals(symbol)) //if symbol match
		  {
		   userShareDetails.add(shareDetails.get(i));
		   int price = shareDetails.get(i).getPrice();//store value of per stock
		   numberOfShare =amount/price;               // calculate number of share buy
		  
		   int number = shareDetails.get(i).getNumber_of_share();
		   number = number + numberOfShare;
		   System.out.println(""+number);
		   shareDetails.get(i).setNumber_of_share(number);//change original share number into resultant
		}
	  }
	  mapper.writeValue(file, shareDetails);              //write updated values into company json file
*/	  
	  for(int i = 0 ; i < userShareDetails.size();i++)
	  {
		  if(userShareDetails.get(i).getSymbol().equals(symbol))
		  {
			  System.out.println(""+userShareDetails.get(i).getNumber_of_share());
			  int number =  userShareDetails.get(i).getNumber_of_share();
			  int price = userShareDetails.get(i).getPrice();//store value of per stock
			  numberOfShare =amount/price;               // calculate number of share buy
			  number = number-numberOfShare;
			  userShareDetails.get(i).setNumber_of_share(number);
		  }
	  }
	  mapper.writeValue(userFile, userShareDetails);     //write updated values into user json file
      	
      		return numberOfShare;
}
}
