package com.bridgelabz.datastructure.queue;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.*;

public class BankingCounterTest 
{

	@Test
	public void testbankingCounter() 
	{
		
		int balance = 5000;
		
		int persons = 4;
		int newbalance = Implementation.bankcounter(balance, persons);
		assertNotEquals(balance, newbalance);
		
	}

}
