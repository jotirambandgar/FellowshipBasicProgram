package com.bridgelabz.datastructure.queue;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.*;

public class BankingCounterTest {

	@Test
	public void testbankingCounter() 
	{
		System.out.println("Enter initial balance in bank:");
		int balance = Utility.intInput();
		System.out.println("Enter number of person in queue:");
		int persons = Utility.intInput();
		int newbalance = Utility.bankcounter(balance, persons);
		assertNotEquals(balance, newbalance);
		
	}

}
