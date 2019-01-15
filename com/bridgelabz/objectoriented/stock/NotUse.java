package com.bridgelabz.objectoriented.stock;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.LinkedList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class NotUse 
{
public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
{
	LocalTime time = LocalTime.now();
	System.out.println(time);
	int arr[] = {1,2,3,4,5,6,7};
	for (int i : arr) {
		
	}
//	ObjectMapper mapper = new ObjectMapper();
//	LinkedList<CompanyShare> companyShare = mapper.readValue(new File("/home/bridgeit/Documents/json/share/company.json"),new TypeReference<LinkedList<CompanyShare>>() {});
//	companyShare.get(2).setName("bajaj");
//	mapper.writeValue(new File("/home/bridgeit/Documents/json/share/company.json"), companyShare);
//	System.out.println(companyShare);
File file = new File("/home/bridgeit/Documents/jotiram.txt");
file.createNewFile();
	
}
}
