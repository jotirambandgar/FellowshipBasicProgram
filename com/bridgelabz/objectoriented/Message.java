//Perform replacement operation on string by using regex
package com.bridgelabz.objectoriented;
import java.util.Scanner;

import com.bridgelabz.utility.*;
public class Message {

	public static void main(String[] args) 
	{
	  
        String string="Read in the following message: Hello <<name>>, We have your full name\n" + 
		"as <<full name>> in our system. your contact number is +91-­xxxxxxxxxx. Please,let us\n" + 
		"know in case of any clarification Thank you BridgeLabz XX/XX/XXXX";
        System.out.println("Enter user name:");
        String uname = Utility.stringInput();
        System.out.println("Enter Full name:");
        String fullname = Utility.stringInput();
        System.out.println("Enter contact number");
        String phno = Utility.stringInput();
       String date = Utility.currentDate();
       string = Utility.replacementregex(string, "<<name>>", uname);
       string = Utility.replacementregex(string, "<<full name>>", fullname);
       string = Utility.replacementregex(string, "xxxxxxxxxx", phno); 
       string = Utility.replacementregex(string, "XX/XX/XXXX", date);
       System.out.println(""+string);
        
	}
}
