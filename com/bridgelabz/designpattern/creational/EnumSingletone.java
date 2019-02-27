package com.bridgelabz.designpattern.creational;
enum E
{
	INSTANCE;
	private E()
	{
	System.out.println("hiii");	
	}
	public static E getInstance()
	{
		return INSTANCE;
	}
}
public class EnumSingletone {
	public static void main(String[] args) {
		
	
	E obj1 = E.getInstance();
	E obj2 = E.getInstance();
	}
}
