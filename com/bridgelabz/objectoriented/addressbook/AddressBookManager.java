package com.bridgelabz.objectoriented.addressbook;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.utility.Utility;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;
interface manager
{
	void save1(PersonDetails person,String addressBook) throws JsonGenerationException, JsonMappingException, IOException ;
		// TODO Auto-generated method stub
		
	
	  void add() throws JsonGenerationException, JsonMappingException, IOException;
	void delete(String name,String addressBook) throws JsonParseException, JsonMappingException, IOException;
	void sortByName() throws JsonParseException, JsonMappingException, IOException;
	void sortByZip();
    void print(String bookName);
}
class AddressBookManager  implements manager {
	static ObjectMapper mapper = new ObjectMapper();
	static String firstName;
	static String lastName;
	static String bookName;
	
	public static boolean createAddressBook(String name) throws IOException,Exception
	{
	//create file with user name
	File file = new File("/home/bridgeit/Documents/json/addressbook/"+name+".json");
	
	//check file create or not
	boolean result = file.createNewFile();
	
	return result;
	
	}
	public static void addPersonInAddressBook(String addressBook,String firstName,String lastName) throws JsonGenerationException, JsonMappingException, IOException {
		
		if(new File("/home/bridgeit/Documents/json/addressbook/"+addressBook+".json").exists()==false)
		{
			System.out.println("invalid address book");
			return;
		}
	
		
		PersonDetails person = new PersonDetails();
		Address address = new Address();
		PhoneNumber phone = new PhoneNumber();
		System.out.println("Enter street:");
		String street = Utility.stringInput();
		System.out.println("Enter city:");
		String city =  Utility.stringInput();
		System.out.println("Enter State:");
		String state = Utility.stringInput();
		System.out.println("Enter zip");
		int zip =  Utility.intInput();
		
		System.out.println("Enter mobile number:");
		Long phoneNumber =  Utility.longInput();
		
		System.out.println("press 1 to add landLine ");
		int choice =  Utility.intInput();
		if(choice == 1)
		{
			long landline =Utility.longInput();
			phone.setLandlineNumber(landline);
		}
		phone.setMobileNumber(phoneNumber);
		address.setStreet(street);
		address.setCity(city);
		address.setState(state);
		address.setZip(zip);
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAddress(address);
		person.setPhoneNumber(phone);
		System.out.println("press "+"$"+"to save details");
		System.out.println("");
		String save = Utility.stringInput();
		if(save.equals("$"))
		{
			AddressBookManager manager = new AddressBookManager();
			manager.save1(person, addressBook);
		}
		
		
		}
	
	
	public  void save1(PersonDetails person,String addressBook) throws JsonGenerationException, JsonMappingException, IOException
	{
		
		if(new File("/home/bridgeit/Documents/json/addressbook/"+addressBook+".json").length() == 0)
		{
		LinkedList<PersonDetails> newPerson = new LinkedList<>();
		newPerson.add(person);
		System.out.println(newPerson);
		mapper.writeValue(new File("/home/bridgeit/Documents/json/addressbook/"+addressBook+".json"), newPerson);
		if(new File("/home/bridgeit/Documents/json/addressbook/"+addressBook+".json").length() != 0)
		{
			System.out.println("data successfully store in file");
		}
		else
		{
			System.out.println("data not fill in file");
		}
		}
		else
		{
			long preFileLength = new File("/home/bridgeit/Documents/json/addressbook/"+addressBook+".json").length();
		LinkedList<PersonDetails> multiple= mapper.readValue(new File("/home/bridgeit/Documents/json/addressbook/"+addressBook+".json"),new TypeReference<LinkedList<PersonDetails>>() {});
		multiple.add(person);
		mapper.writeValue(new File("/home/bridgeit/Documents/json/addressbook/"+addressBook+".json"),multiple);
		
		}
	}
	
	public void add() throws JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter person first name:");
		firstName = Utility.stringInput();
		System.out.println("Enter last name");
		lastName = Utility.stringInput();
		System.out.println("Enter address book name");
		bookName = Utility.stringInput();
		addPersonInAddressBook(bookName, firstName, lastName);
	}

	public void delete(String name, String addressBook) throws JsonParseException, JsonMappingException, IOException {
		LinkedList <PersonDetails> details = mapper.readValue(new File("/home/bridgeit/Documents/json/addressbook/"+addressBook+".json"), new TypeReference<LinkedList<PersonDetails>>() {});
		int count = 0 ;
		boolean result = true;
		for(PersonDetails person: details)
		{
			if(person.getFirstName().equals(name))
			{
				details.remove(count);
			}
			count++;
		}
		for(PersonDetails person: details)
		{
			if(person.getFirstName().equals(name))
			{
				result = false;
			}
		}
		if(result == true)
		{
			System.out.println("person successfully remove");
		}
	}
	
	public void sortByName() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Enter address Book");
		bookName = Utility.stringInput();
		LinkedList <PersonDetails> details = mapper.readValue(new File("/home/bridgeit/Documents/json/addressbook/"+bookName+".json"), new TypeReference<LinkedList<PersonDetails>>() {});
		LinkedList<String> name = new LinkedList<>();
		int count = 0;
		for(PersonDetails person :details)
		{
		name.add(person.getFirstName());
			
		}
		String names[] = new String[name.size()];
		for(String value: name)
		{
			names[count] = value.replaceAll(" ", "");
			count++;
		}
		Arrays.sort(names);
		for(String s:names)
		{
			System.out.println(s);
		}
		System.out.println("sort by first name");
		count = 0;
		while(count < names.length)
		{
			System.out.println("hii");
			for(PersonDetails person: details)
			{
				if(person.getFirstName().equals(names[count]))
				{
					System.out.println(person);
				}
				count++;
			}
		}
	}
	@Override
	public void sortByZip() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void print(String addressBook) {
		// TODO Auto-generated method stub
		
	}

	

}
