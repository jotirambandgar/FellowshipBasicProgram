package com.bridgelabz.designpattern.creational;
/**
 * achieve singletone by using Eager singletone  
 * @author bridgeit
 *
 */
class Abc
{
	static Abc obj = new Abc();
	private Abc()
	{
		System.out.println("hii im in constructor");
	}
	 
	public static Abc getInstance()
	{
		return obj;
	}
	
}

public class Eager {
	public static void main(String args[])
	{
		Abc obj1 =  Abc.getInstance();
		Abc obj2 = Abc.getInstance();
		
	}

}
