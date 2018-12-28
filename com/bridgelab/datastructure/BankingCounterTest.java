package com.bridgelab.datastructure;

import static org.junit.Assert.*;
import com.bridgelab.utilit.*;
import org.junit.Test;

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
