package com.bridgelab.utilit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelab.datastructure.*;

public class Utility 
{
	static Scanner scan = new Scanner(System.in); 
//========================================Taking variable Input++++++++++++++++++++++++++++++++++++++++++

/**
 * for taking user input at runtime
 * @string
 */
public static  String stringInput() // string input
{
return scan.nextLine();
}


public static int intInput()    // integer input
{
return scan.nextInt();
}	

public static double doubleInput() // double integer
{
return scan.nextDouble();
}
public static float floatInput() // float input
{
return scan.nextFloat();
}
//==============================================print array================================================================================================================================

//printing integer array.
public static void printIntArray(int number[])
{
	for(int i = 0 ;i<number.length;i++)
	{
		System.out.println(number[i]);
	}
}
//printing string array.
public static void prinStringArray(String string[])
{
	for(int i = 0 ;i<string.length;i++)
	{
		System.out.println(string[i]);
	}
}

//=============================================String replacement=================================================================================================

/**
 * check valid user name and replace original string 
 * @param orignal
 * @return replace string
 */
public static String replacementOpt(String original,StringBuffer user_name)
{
	
	return original.replace("<<UserName>>",user_name);
	
}
//===========================arg0======================Flip coin============================================================================

/**
 * flip coin and calculate percentage of head and tails
 * use random function for calculate head and tails
 * @param time
 */
public static void coinOpt(int time)
{
double head = 0 ;
	double tails = 0;
	int count = 0;
	for(int i =0 ; i<time; i++)
	{
		double result = Math.random();
		if(result < 0.5)   // if result is greater than 0.5 then increment head else increment tails
		{
			head++;
		}
		else
		{
			tails++;
		}
		count++;
	}
	double percentage_head = (head/time)*100;
	double percentage_tails = (tails/time)*100;
	System.out.println("head = "+percentage_head+"%");
	System.out.println("tails = "+percentage_tails+"%");
}
//====================================Leap year===========================================================================================================
/**
 * check entered year is 4 digit and whether it leap year or not
 * @param year
 * @return leap year or not
 */
public static String leapYear(int year)
{
	
	if(year % 4 == 0)
	{
		return " enter year leap year";
	}
		return "Not a leap year";
}


//==============================================Power of two========================================================================================================================================


/**
 * this method calculate user given power table of two
 * @param N
 * @return power 
 */
public static int[] powerCalcu(int N)
{
	int result[] = new int[N+1];// result store in array
	int power =1;
	int count = 0;
	while(count <= N)
	{
		result[count] = power;
		power = power*2;          //power calculate by multiply it by base number
		count++;
	}
	return result;
}
//=================================================harmonic series==================================================================================

/**
 * compute harmonic series
 * by calculating 1/1 + 1/2 + 1/3 + ... + 1/N
 * @param number
 * @return harmonic number
 */
public static float harmonicCalculation(int number)
{
	float harmonic = 0;
	for(float i = 1; i <= number ; i++ )
	{
		harmonic = harmonic+(1/i);
	}
	return harmonic;
}
//================================================Prime factors of number==========================================================================================

/**
 * calculate prime factors of number
 * @param n
 * 21/12/2018
 */
public static ArrayList primeFacCal(int nnumber)
{
	int num=nnumber;
	ArrayList<Integer>fact=new ArrayList<Integer>();
	for(int i=2;i<=num;i++)
	{
		while(num%i==0 )      //if num is  divisible by i enter into loop
		{
			fact.add(i);    //add it into arraylist
			num /= i;      // divide it by "i"
		}
			
		}

	return fact;
}

//=================================================Gambler======================================================================================================================

/**
 * this method use for maintain record of game
 * also calculate number of win,loss and percentage of win,percentage of loss
 * @param stake
 * @param goal
 * @param trials
 * 21/12/2018
 */
public static void gameRecord(int stake,int goal,int trials)
{
float win=0;
float loss=0;
int cash=stake;
double tem;
int winbet=0;
int lossbet=0;
float Perc_win;
float perc_loss;
//float avgbet=0;
for(int i=trials;i>0;i--)
{
 //tem=Math.random();	

while(cash>0 && cash!=goal)
{
	 tem=Math.random();	
	if(tem>0.5)
	{
		win++;
		cash++;
		winbet++;
	}
	else
	{
		loss++;
		cash--;
		lossbet++;
	}
	
}
//System.out.println("number of times he win="+win);
//System.out.println("number of times he loss="+loss);


}
Perc_win= (win/(winbet+lossbet))*100;
perc_loss= (loss/(winbet+lossbet))*100;
System.out.println("number of times he win="+win);
System.out.println("number of times he loss="+loss);
System.out.println("percentage of win="+Perc_win);
System.out.println("percentage of loss="+perc_loss);
}
//=====================================================Write File===================================================================================================================
//=====================================================Balance Paranthesis=================================================
//==============================read file contains===================================================================================
/**
 * this method use for read content of file and return in string
 * @param address ----> link of file
 * @return---------->content of file
 */
public static String readAllFromFile(String address)
{
	String line=null;
	String readedFile="";
	try 
	{
		FileReader filereader=new FileReader(address); 
		BufferedReader bufferedReader=new BufferedReader(filereader);
		while((line=bufferedReader.readLine())!= null)
		{
			readedFile+=line;
		}
		bufferedReader.close();
	}
	catch(FileNotFoundException fileNotFoundException)
	{
		System.out.println("your file is not found in the location '"+address+"'");
	}
	catch(IOException ioException)
	{
		System.out.println("Error in reading your file '"+address+"'");
	}
	return readedFile;

}
//=====================================Write data into file=========================================
/**
 * Write data into particular file
 * @param address-->link of file
 * @param content-->data which fill into file
 * @throws Exception--->for file not found
 */
public static  void writeIntoFile(String address,String content)throws Exception
{
	FileWriter filewriter=new FileWriter(address);
	BufferedWriter bufferedwriter=new BufferedWriter(filewriter); 
	bufferedwriter.write(content);
	bufferedwriter.close();
}
//=====================================print array================================================================================================================
public void printStringArray(String array[])
{
	for(int i = 0; i < array.length; i++)
	{
		System.out.println(array[i]);
	}
}
//=====================================Balance parenthesis==================================================================================================

/**
 * check my expression is balance or not
 * @param expression-------->mathematical expression
 * @return-->boolean value stack is empty or not
 */
public static boolean checkStable(String expression)
{
 Stack <Character> stack = new Stack<Character>();
		
	for(int  i = 0 ; i < expression.length(); i++)
	{
		if(expression.charAt(i)=='(' ||expression.charAt(i)=='{'||expression.charAt(i)=='[')
		{
		stack.push(expression.charAt(i));
		}
		if(expression.charAt(i)==')' && stack.peek().equals('('))
		{
		stack.pop();	
		}
		if(expression.charAt(i)=='}' && stack.peek().equals('{'))
		{
		stack.pop();	
		}
		if(expression.charAt(i)==']' && stack.peek().equals('['))
		{
		stack.pop();	
		}
	}
	return stack.isEmpty();
	
}

//=============================== bank counter==========================================================================================================================

/**
 * method for withdraw and deposit amount in bank
 * @param balance ---> already present amount in bank 
 * @param persons----> number of person in queue
 * @return-----> final balance in bank
 */
public static int bankcounter(int balance,int persons)
{
	Queue<Integer> queue = new Queue<>();
	int newbalance = 0;
	int count = 1;
	while(persons != 0 && balance > 0)
	{
		System.out.println("person: "+count);
		System.out.println("1 .for Deposit ");//ask to user for deposit
	 	System.out.println("2 .for withdraw");//ask to user for withdraw
	 	int choice = Utility.intInput();
	 	int amount = 0;
	 	while(balance>0 )
	 	{
	 	switch(choice)
	 	{
	 	case 1:
	 			System.out.println("Enter amount for Deposit");
	 			amount = intInput();
	 			queue.enqueue(amount);       // if want to deposit add money in queue
	 			balance = balance + amount;
	 			System.out.println("amount in bank:"+balance);
	 			persons--;
	 		 	count++;
	 			break;
	 	case 2:
	 			System.out.println("Enter amount for Withdraw");
	 			amount = intInput();
	 			queue.enqueue(amount); // if want to 
	 			balance = balance - amount;
	 			System.out.println("amount in bank:"+balance);
	 			persons--;
	 		 	count++;
	 			break;
	 	}
	 	}
	 	
	}
	return (balance);
}

//===================================palindrom checker by deque=======================================================================================
/**
 * check my string is palindrom or not
 * @param check --> operational string
 * @return----> return boolean value
 */
public static boolean palindromCheker(String check)
{
	Deque <Character> deque = new Deque<>(); 
	boolean result = false ;
	for(int i=0;i<check.length();i++)
	{
		char c =check.charAt(i);
		//adding each character to the rear of the deque
		deque.addRear(c);
	}
	int flag=0;
	while(deque.size()>1)//Check the size of the deque greater than 1
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
//===========================================Find Day code for calendar==========================================================================================
public static int findDcode(int d,int m,int y)
{
	int y0 = ((y - (14-m) / 12));

int x = (y0 + y0/4 - y0/100 + y0/400);
int m0 = (m + 12 * ((14 - m) / 12) -2);
int d0 = (((d + x + 31*m0 / 12)%7));
return d0;
}
//================================prime number finding in given rang================================================================================================
public static List<Integer> primeFinding(int N)
{
	List<Integer> l=new LinkedList<Integer>();
    int count = 0;
    for(int i=2;i<=N;i++)
    	{
    	count = 0;
    	for(int j=2;j<=i/2;j++)
    	{
    		if(i%j==0)
    		{
    			count=1;
    		}
    	}
    	if(count==0)
    	{
    		l.add(i);
    		
    	}
    	}
    return l;
}
//=======================================json object mapper======================================================================================
static ObjectMapper mapper = new ObjectMapper(); 
//========================================
}
