package com.bridgelabz.datastructure.deque;

public class Implementation {
	/**
	 * check my string is palindrom or not
	 * @param check --> operational string
	 * @return----> return boolean value
	 */
	public static boolean palindromCheker(String check)
	{
		check = check.toLowerCase().replaceAll(" ", "");
		Deque <Character> deque = new Deque<>(); 
		boolean result = false ;
		for(int i=0;i<check.length();i++)
		{
			char c =check.charAt(i);
			//adding each character to the rear of the deque
			deque.addRear(c);
		}
		int flag=0;
		//traverse upto size of the deque greater than 1
		while(deque.size()>1)
		{
			char first = ((deque.removeFront()));
			char last =(deque.removeRear());
			if( first== last)
			{
				flag=0;
				
			}
			else
			{
				flag = 1;
				break;
			}
		}
		if(flag==0)
		{
		result = true;
		}
		else
		{
			result = false;
		}
		return result;
	}

}
