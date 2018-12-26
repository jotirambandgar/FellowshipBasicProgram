package com.bridgelab.objectoriented;

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
		File file = new File("/home/bridgeit/eclipse-workspace/Fellowship/Fellowship/com/bridgelab/objectoriented/Management.json");
		ObjectMapper obje=new ObjectMapper();
		 List<Value> x=new ArrayList<>();
		x=obje.readValue(file, new TypeReference<List<Value>>(){});
		
		for(int i = 0 ; i < x.size();i++)
		{
			System.out.println("name:"+x.get(i).getName()+",  weight:"+x.get(i).getWeight()+",    price:"+x.get(i).getPrice());
			int weight = x.get(i).getWeight();
			int price = x.get(i).getPrice();
			int total_price = (weight*price);
			System.out.println("Total price:"+total_price);
		}
			}
}
