package com.bridgelabz.datastructure;

import java.util.LinkedList;

import com.bridgelabz.utility.Utility;

public class AnagramPrimeNumber
{
public static void main(String[] args) 
{
	String string1 = " ";
	String string2 = " ";
	
	String prime[][] = new String[25][10];
	
	LinkedList <Integer> l = new LinkedList<Integer>();
	LinkedList<String> anagramNumber = new LinkedList<>();
	//add all prime number in linkedlist
	l.addAll(Utility.primeFinding(1000));
	  int primenum[] =new int[l.size()];       
    for(int i = 0;i < primenum.length; i++ )
     {
    	 primenum[i]=l.get(i);
     }
    for(int i = 0; i< primenum.length;i++)
     {
    	 for(int j = i+1; j< primenum.length;j++)
    	 {
    		 string1 = Integer.toString(primenum[i]);
    		 string2 = Integer.toString(primenum[j]);
    	 }
     }
}

}
