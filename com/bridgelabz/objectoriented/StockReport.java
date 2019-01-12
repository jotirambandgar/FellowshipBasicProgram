package com.bridgelabz.objectoriented;

import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.datastructure.*;
import com.sun.xml.internal.ws.encoding.soap.DeserializationException;

import sun.rmi.server.DeserializationChecker;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class StockReport {

	public static void main(String[] args) throws  IOException {
		File file = new File("/home/bridgeit/eclipse-workspace/Fellowship/Fellowship/com/bridgelabz/objectoriented/stock.json");
		ObjectMapper mapper = new ObjectMapper();
		List<PojoStock> stock=new ArrayList<>();
		

		stock=mapper.readValue(file, new TypeReference<List<PojoStock>>(){});
		System.out.println("stock report:");
		System.out.println(stock.get(0));
		for(int i = 0 ; i < stock.size();i++)
		{
			//System.out.println(stock.get(i));
			int number = stock.get(i).getNumber();
			int price = stock.get(i).getPrice();
			int total_price = (number*price);
			System.out.println("Total price:"+total_price);
			
		}

	}

}
