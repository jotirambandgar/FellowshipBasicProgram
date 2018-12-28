package com.bridgelab.datastructure;

import static org.junit.jupiter.api.Assertions.*;
import com.bridgelab.utilit.*;
import org.junit.jupiter.api.Test;

class StackTestBalanceParentheses {
    static Stack <Character> stack = new Stack<>();
	@Test
	void testStack() 
	{
		System.out.println("Enter Expression:");
		String expression = Utility.stringInput();
		for(int  i = 0 ; i < expression.length(); i++)
		{
			stack.push(expression.charAt(i));
		}
		stack.display();
		assertEquals(expression, stack.size());
	}

}
