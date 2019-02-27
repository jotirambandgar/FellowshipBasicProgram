package com.bridgelabz.designpattern.creational;
/**
 * create lazy instantiation to overcome Eager object memory management 
 * @author jotiram bandgar
 * 
 */
class Bcd
{
	static Bcd obj;
	private Bcd() {System.out.println("hii");}
	public static Bcd getInstance()//lazzyInstantiation
	{
		
	if(obj == null)
	{
		obj =new Bcd();
	}
	return obj;
	}
}
public class LazzyInstantiation {
public static void main(String[] args) {
	Bcd obj1 = Bcd.getInstance();
	Bcd obj2 = Bcd.getInstance();
}
}
