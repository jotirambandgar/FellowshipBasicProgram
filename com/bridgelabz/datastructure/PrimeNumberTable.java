package com.bridgelabz.datastructure;
import java.util.LinkedList;

import com.bridgelabz.utility.*;
/**
 * make prime number table in range of 0-1000
 * @author jotiram bandgar
 *
 */
public class PrimeNumberTable {

	public static void main(String[] args) 
	{
	String Range[] = {"0-100" ,"100-200","200-300","300-400","400-500","500-600","600-700","700-800","800-900","900-1000"};
	String prime[][] = new String[25][10];
	LinkedList <Integer> list = new LinkedList<Integer>();
	list.addAll(Utility.primeFinding(1000));//add all prime number in linkedlist
	
     int primenum[] =new int[list.size()]; 
     for(int i = 0;i < primenum.length; i++ )
     {
    	 primenum[i]=list.get(i);
     }
     int count = 0;
     int r1 = 0;int r2 = 0; int  r3 =0;int r4=0;int r5=0;int r6=0;int r7=0;int r8=0;int r9=0;int rten=0;
     int c1 = 0;int c2 = 1; int  c3 =2;int c4=3;int c5=4;int c6=5;int c7=6;int c8=7;int c9=8;int cten=9;// give value for rows and column
     //int count = 0;
     System.out.println("1.prime number");
  
     int choice = Utility.intInput();
    for(int i = 0; i < primenum.length;i++) // store value for particular range
    {
    	
    		if(primenum[i]<100)
    	     {
    		  prime[r1][c1] = Integer.toString(primenum[i]);
    		  r1++;
    		  
    	     }
    		if(primenum[i] >= 100 && primenum[i] <200 )
    		{
    			  prime[r2][c2] = Integer.toString(primenum[i]);
        		  r2++;
    		}
    		if(primenum[i] >= 200 && primenum[i] <300 )
    		{
    			  prime[r3][c3] = Integer.toString(primenum[i]);
        		  r3++;
    		}
    		if(primenum[i] >= 300 && primenum[i] <400 )
    		{
    			  prime[r4][c4] = Integer.toString(primenum[i]);
        		  r4++;
    		}
    		if(primenum[i] >= 400 && primenum[i] <500 )
    		{
    			  prime[r5][c5] = Integer.toString(primenum[i]);
        		  r5++;
    		}if(primenum[i] >= 500 && primenum[i] <600 )
    		{
  			  prime[r6][c6] = Integer.toString(primenum[i]);
      		  r6++;
  		     }
    		if(primenum[i] >= 600 && primenum[i] <700 )
    		{
    			  prime[r7][c7] = Integer.toString(primenum[i]);
        		  r7++;
    		}
    		if(primenum[i] >= 700 && primenum[i] <800 )
    		{
    			  prime[r8][c8] = Integer.toString(primenum[i]);
        		  r8++;
    		}
    		if(primenum[i] >= 800 && primenum[i] < 900 )
    		{
    			  prime[r9][c9] = Integer.toString(primenum[i]);
        		  r9++;
    		}
    		if(primenum[i] >= 900 && primenum[i] <1000 )
    		{
    			  prime[rten][cten] = Integer.toString(primenum[i]);
        		  rten++;
    		}
    		
    		
      }
    for(int i =0; i< 25;i++)
    {
        for(int m =0; m< 10;m++)
        {
        	if(prime[i][m] == null)
        	{
        		prime[i][m] = "";
        	}
        }
    }
    for(int p =0 ;p <Range.length;p++)
    {
    	System.out.print(" "+Range[p]);
    }
    System.out.println("");
    for(int i =0; i< 25;i++)
    {
        for(int m =0; m< 10;m++)
        {
        	String temp = prime[i][m];
        	if(temp.length()<2)
        	{
    	     System.out.print("    "+prime[i][m]);
        	}
        	if(temp.length()>=2 && temp.length()<3)
        	{
        		System.out.print("   "+prime[i][m]);	
        	}
        	if(temp.length() == 3)
        	{
        		System.out.print("     "+prime[i][m]);
        	}
        	if(prime[i][m] == "")
        	{
        		System.out.print("    ");
        	}
    	
        }
        System.out.println("");
    }
	}
}