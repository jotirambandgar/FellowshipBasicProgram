package com.bridgelabz.designpattern.creational;
class F
{
	private F()
	{
		System.out.println("bill pugh");
	}
	private static class innerClass
	{
		private static final F obj = new F();
	}
	public static F getInstance()
	{
		return innerClass.obj;
	}
}
public class BillPugh {
public static void main(String[] args) {
	F obj1 = F.getInstance();
	F obj2 = F.getInstance();
}
}
