package com.bridgelab.datastructure;

import static org.junit.Assert.*;
import com.bridgelab.utilit.*;
import org.junit.Test;

public class BalanceParenthesesTest {

	@Test
	public void testBalanceParantheses()
	{
		System.out.println("Enter Expression:");
		String expression = Utility.stringInput();
		assertTrue(Utility.checkStable(expression));
	}

}
