package com.bridgelabz.datastructure.deque;
import java.util.Scanner;


public class PalindromChecker {

	public static void main(String[] args) 
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a string:");
	String check = scanner.nextLine();
	boolean result = Implementation.palindromCheker(check);
	System.out.println("is my String palindrom:"+result);
	}

}
