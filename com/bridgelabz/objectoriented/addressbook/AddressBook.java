package com.bridgelabz.objectoriented.addressbook;

import java.io.File;
import java.io.IOException;

import com.bridgelabz.utility.Utility;

public class AddressBook {

	public static void main(String[] args) throws IOException {
		String addressBookName = "";
		String firstName;
		String lastName;
		System.out.println("Menu:");
		System.out.println("1. create new address book");
		System.out.println("2. add person in existing address book");
		System.out.println("3. manage address book");
        int choice = Utility.intInput();
        switch(choice)
        {
        case 1:
        		System.out.println("Enter address book name");
        		addressBookName = Utility.stringInput();
        		if(Implementation.createNewAddressBook(addressBookName))
        		{
        			System.out.println("new Address Book created");
        		}
        		else
        		{
        			System.out.println("address book already created");
        		}
        		break;
        case 2:
        		System.out.println("Enter address book  ");
        		addressBookName = Utility.stringInput();
        	
        		System.out.println("Enter person first name: ");
        		firstName = Utility.stringInput();
        		System.out.println("Enter person last name: ");
        		lastName = Utility.stringInput();
        		Implementation.addPersonInAddressBook(addressBookName, firstName, lastName);
        		
        }
	}
}
