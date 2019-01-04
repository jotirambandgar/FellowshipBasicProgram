package com.bridgelabz.datastructure.stack;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.*;

public class BalanceParenthesesTest {

	@Test
	public void testBalanceParantheses()
	{
		System.out.println("Enter Expression:");
		String expression = Utility.stringInput();
		assertTrue(Utility.checkStable(expression));
	}

}
