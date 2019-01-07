package com.bridgelabz.objectoriented;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InventoryManagement 
{
	public static void main(String[] args) throws IOException 
	{
		File file = new File("/home/bridgeit/eclipse-workspace/Fellowship/Fellowship/com/bridgelabz/objectoriented/Management.json");
		ObjectMapper obje=new ObjectMapper();
		 List<Value> list=new ArrayList<>();
		list=obje.readValue(file, new TypeReference<List<Value>>(){});
		
		for(int i = 0 ; i < list.size();i++)
		{
			System.out.println("name:"+list.get(i).getName()+",  weight:"+list.get(i).getWeight()+",    price:"+list.get(i).getPrice());
			int weight = list.get(i).getWeight();
			int price = list.get(i).getPrice();
			int total_price = (weight*price);
			System.out.println("Total price:"+total_price);
		}
	}
}
