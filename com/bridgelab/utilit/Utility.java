package com.bridgelab.utilit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Utility {
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

}
