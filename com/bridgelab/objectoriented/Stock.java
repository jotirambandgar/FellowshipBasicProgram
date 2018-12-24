package com.bridgelab.objectoriented;

import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.sun.xml.internal.ws.encoding.soap.DeserializationException;

import sun.rmi.server.DeserializationChecker;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Stock {

	public static void main(String[] args) throws  IOException {
		File file = new File("/home/bridgeit/eclipse-workspace/Fellowship/Fellowship/stock.json");
		ObjectMapper mapper = new ObjectMapper();
		List<PojoStock> stock=new ArrayList<>();
		stock=mapper.readValue(file, new TypeReference<List<PojoStock>>(){});
		for(int i = 0 ; i < stock.size();i++)
		{
			System.out.println(stock.get(i));
		}

	}

}
