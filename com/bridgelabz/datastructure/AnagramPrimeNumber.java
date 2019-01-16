package com.bridgelabz.datastructure;

import java.util.LinkedList;
import com.bridgelabz.datastructure.orderlist.*;
import com.bridgelabz.datastructure.unorderlist.*;

import com.bridgelabz.utility.Utility;

public class AnagramPrimeNumber
{
public static void main(String[] args) 
{
	String string1 = " ";
	String string2 = " ";
	
	String prime[][] = new String[25][10];
	
	LinkedList <Integer> primeNumber = new LinkedList<Integer>();
	UnOrderList<Integer> uniqueNumber = new UnOrderList<Integer>();
	OrderedList<Integer> anagram = new OrderedList<>();
	//add all prime number in linkedlist
	primeNumber.addAll(Utility.primeFinding(1000));
	  int primenum[] =new int[primeNumber.size()];       
    for(int i = 0;i < primenum.length; i++ )
     {
    	 primenum[i]=primeNumber.get(i);
     }
    for(int i = 0; i< primenum.length;i++)
     {
    	 for(int j = i+1; j< primenum.length;j++)
    	 {
    		 string1 = Integer.toString(primenum[i]);
    		 string2 = Integer.toString(primenum[j]);
    		 if(Utility.isAnagram(string1, string2))
    		 {
    			 uniqueNumber.add(Integer.parseInt(string1));
    			 uniqueNumber.add(Integer.parseInt(string2));
    		 }
    	 }
     }
   int size = uniqueNumber.size();
   System.out.println("List in normal order: ");
   
   uniqueNumber.display();
   System.out.println("");
   System.out.println("list in reverse order:");
   for(int i = size;i>0;i--)
   {
	   System.out.print(" "+uniqueNumber.get(i));
   }
}

}
