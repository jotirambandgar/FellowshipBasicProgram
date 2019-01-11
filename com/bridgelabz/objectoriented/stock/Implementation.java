package com.bridgelabz.objectoriented.stock;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class Implementation
{
	static ObjectMapper mapper = new ObjectMapper();
public static void createNewUser(String file,String name) throws JsonGenerationException, JsonMappingException, IOException
{
 User newUser = new User();
 newUser.setUserName(name);
 LocalDate date = LocalDate.now();
 String date1 = date.toString();
 newUser.setDate(date1);
 if(new File(file).length() == 0)
 {
 mapper.writeValue(new File(file), newUser);
 }
 else
 {
	User arr = mapper.readValue(new File(file),User.class);
	LinkedList<User> list = new LinkedList<>();
//	 for(User user : arr)
//	 {
//		 list.add(user);
//		 
//	 }
	
	// mapper.writeValue(new File(file),userDetails);
 }
}
}
