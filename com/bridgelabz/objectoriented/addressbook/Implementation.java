package com.bridgelabz.objectoriented.addressbook;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.utility.Utility;

public class Implementation {
	static Scanner scanner = new Scanner(System.in);
	static ObjectMapper mapper = new ObjectMapper();
	public static boolean createNewAddressBook(String addressBookName) throws IOException{
		File file = new File("/home/bridgeit/Documents/json/addressbook/"+addressBookName+".json");
		return file.createNewFile();
	}
public static void addPersonInAddressBook(String addressBook,String firstName,String lastName) throws JsonGenerationException, JsonMappingException, IOException {
	
	if(new File("/home/bridgeit/Documents/json/addressbook/"+addressBook+".json").exists()==false)
	{
		System.out.println("invalid address book");
		return;
	}
	System.out.println(new File("/home/bridgeit/Documents/json/addressbook/"+addressBook+".json").length());
	if(new File("/home/bridgeit/Documents/json/addressbook/"+addressBook+".json").length() == 0)
	{
	PersonDetails person = new PersonDetails();
	Address address = new Address();
	PhoneNumber phone = new PhoneNumber();
	System.out.println("Enter street:");
	String street = scanner.nextLine();
	System.out.println("Enter city:");
	String city = scanner.nextLine();
	System.out.println("Enter State:");
	String state = scanner.nextLine();
	System.out.println("Enter zip");
	int zip = scanner.nextInt();
	address.setStreet(street);
	address.setCity(city);
	address.setState(state);
	address.setZip(zip);
	System.out.println("Enter mobile number:");
	Long phoneNumber =  scanner.nextLong();
	phone.setMobileNumber(phoneNumber);
	System.out.println("press 1 to add landLine ");
	int choice =  scanner.nextInt();
	if(choice == 1)
	{
		long landline =scanner.nextLong();
		phone.setLandlineNumber(landline);
	}
	person.setFirstName(firstName);
	person.setLastName(lastName);
	person.setAddress(address);
	person.setPhoneNumber(phone);
	mapper.writeValue(new File("/home/bridgeit/Documents/json/addressbook/"+addressBook+".json"),person);
	
	}
}
public static void printDetails() throws JsonParseException, JsonMappingException, IOException
{
	PersonDetails person = mapper.readValue(new File("/home/bridgeit/Documents/json/addressbook/bridgelabz.json"), PersonDetails.class);
	System.out.println(person);
}
}
