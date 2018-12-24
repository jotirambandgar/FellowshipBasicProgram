package com.bridgelab.firstweek.functionalprogram;
import com.bridgelab.utilit.*;

/**
 * taking user name from user and replace <<UserName>> with name
 * @author jotiram bandgar
 *
 */
public class StringReplace
{
	public static void main(String[] args)
	{
		String original = "Hello <<UserName>>, How are you?";
		System.out.println(original);
		System.out.println("Enter user name");
		StringBuffer user_name = new StringBuffer(Utility.stringInput()); // taking input by using stringbuffer becoz of its mutable  
	    while(user_name.length()<3)  // check user name length is greater than 2 or not
			{
				System.out.println("Enter valid user name");
				user_name = new StringBuffer(Utility.stringInput());
			}

		  
	
		System.out.println(	Utility.replacementOpt(original,user_name));

	}

}
