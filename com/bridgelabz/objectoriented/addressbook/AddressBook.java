package com.bridgelabz.objectoriented.addressbook;

import java.io.File;
import java.io.IOException;

import com.bridgelabz.utility.Utility;

/**
 * create address book 
 * @author jotiram bandgar
 *
 */
public class AddressBook {

	public static void main(String[] args) throws Exception {
		String addressBookName = "";
		String firstName;
		String lastName;
		
		AddressBookManager manager = new AddressBookManager();
        int repeat = 1 ;
       //manager.printDetails();
        while(repeat == 1)
        {
        	System.out.println("Menu:");
    		System.out.println("1. create new address book");
    		System.out.println("2. add person in existing address book");
    		System.out.println("3. manage address book");
            int choice = Utility.intInput();
        switch(choice)
        {
        //to create address book
        case 1:
	        		System.out.println("Enter address book name");
	        		addressBookName = Utility.stringInput();
	        		if(manager.createAddressBook(addressBookName))
	        		{
	        			System.out.println("new Address Book created");
	        		}
	        		else
	        		{
	        			System.out.println("address book already created");
	        		}
	        		break;
	      //to add person in address book  		
        case 2:
	        	    File file [] = manager.openFolder();
	        	    for(File file1:file)
	        	    {
	        	    	System.out.println(file1.getName());
	        	    }
	        		System.out.println("Enter address book  ");
	        		addressBookName = Utility.stringInput();
	        	
	        		System.out.println("Enter person first name: ");
	        			firstName = Utility.stringInput();
        			System.out.println("Enter person last name: ");
        			lastName = Utility.stringInput();
        			manager.addPersonInAddressBook(addressBookName, firstName, lastName);
        			break;
        //perform different operation on address book
        case 3: 
        			File file1 [] = manager.openFolder();
        			for(File file2:file1)
        			{
        				System.out.println(file2.getName());
        			}
        	    	System.out.println("Enter address book");
        	    	addressBookName = Utility.stringInput();
        	    	boolean exist = new File("/home/bridgeit/Documents/json/addressbook/"+addressBookName+".json").exists();
        	    	long fileLength = new File("/home/bridgeit/Documents/json/addressbook/"+addressBookName+".json").length();
        	    	if(exist == false || fileLength == 0)
        	    	{
        	    		System.out.println("invalid choice");
        	    	
        	    	}
        	    	
        	    	else
        	    	{
	        	    	System.out.println("content of address book");
	        	    	manager.openAddressbook(addressBookName);
	        	    		
	        	    	System.out.println("To Manage the book press:");
	        	    	
	        	    	System.out.println("1. for add person");
	        	    	System.out.println("2. Edit person details");
	        	    	System.out.println("3. for delete person");
	        	    	System.out.println("4. sort person by name and zip");
	        	    	System.out.println("5. print person details");
	        	    	System.out.println("6. for saveAs");
	        	    	choice = Utility.intInput();
	        	    
	        	    	switch(choice)
	        	    	{
	        	    	
	        	    	//for add person in list
	        	    	case 1:
	        	    		   
	        	    		   manager.add();
	        	    		   break;
	        	    		   
	        	    		 //edit person details  
	        	    	case 2: 
	        	    			System.out.println("Enter person first name:");
	        	    	        firstName = Utility.stringInput();
	        	    	        manager.editPerson(firstName, addressBookName);
	        	    	        break;
	        	    	        
	        	    	       //delete person
	        	    	case 3: 
	        	    			System.out.println("Enter person first name:");
	        	    		    firstName = Utility.stringInput();
	        	    		    manager.delete(firstName, addressBookName);
	        	    		    break;
	        	    		    //sort person by name or by zip
	        	    	case 4:
	        	    			System.out.println("press 1. for sort by name and 2. for sort by zip:");
	        	    			choice = Utility.intInput();
	        	    			if(choice == 1)
	        	    			{
	        	    		    manager.sortByName(addressBookName);
	        	    			}
	        	    			if(choice == 2)
	        	    			{
	        	    				manager.sortByZip(addressBookName);
	        	    			}
	        	    			break;
	        	    			//enter person details
	        	    	case 5: 
	        	    		    System.out.println("Enter First name of person ");
	        	    		    firstName = Utility.stringInput();
	        	    		    manager.print(addressBookName, firstName);
	        	    		    break;
	        	    		    //save as
	        	    	case 6 :
	        	    			System.out.println("Enter new address book name");
	        	    		     String  addName = Utility.stringInput();
	        	    		     System.out.println("Enter file extension");
	        	    		     String extension = Utility.stringInput();
	        	    		     manager.saveAs(addressBookName, addName, extension);
	        	    		     break;
	        	    	default :
	             			    System.out.println("Invalid choice");
	             			     break;
	        	    	}
	        	    	}
	        			break;
        default :
        			System.out.println("Invalid choice");
        			break;
        }
      
        
        System.out.println("To continue press 1 \n and for exit press any number ");
        repeat = Utility.intInput();
	}
        if(repeat != 1)
        {
        	System.out.println("Exit");
        }
}
}