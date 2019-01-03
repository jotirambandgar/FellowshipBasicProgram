//Perform replacement operation on string by using regex
package com.bridgelab.json;
import java.util.Scanner;

import com.bridgelab.utilit.*;
public class Message {

	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
        String s="Read in the following message: Hello <<name>>, We have your full name\n" + 
		"as <<full name>> in our system. your contact number is +91-­xxxxxxxxxx. Please,let us\n" + 
		"know in case of any clarification Thank you BridgeLabz XX/XX/XXXX";
        System.out.println("Enter user name:");
        String uname = sc.nextLine();
        System.out.println("Enter Full name:");
        String fullname = sc.nextLine();
        System.out.println("Enter contact number");
        String phno = sc.nextLine();
       String date = Utility.currentDate();
       s = Utility.replacementregex(s, "<<name>>", uname);
       s = Utility.replacementregex(s, "<<full name>>", fullname);
       s = Utility.replacementregex(s, "xxxxxxxxxx", phno); 
       s = Utility.replacementregex(s, "XX/XX/XXXX", date);
       System.out.println(""+s);
        
	}
}
