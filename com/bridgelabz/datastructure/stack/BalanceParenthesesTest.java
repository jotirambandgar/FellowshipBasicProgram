package com.bridgelabz.datastructure.stack;

import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.Test;


public class BalanceParenthesesTest {

	@Test
	public void testBalanceParantheses()
	{
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter Expression:");
		String expression = "(() {{[[]]}})";
		assertTrue(Implementation.checkStable(expression));
	}

}
