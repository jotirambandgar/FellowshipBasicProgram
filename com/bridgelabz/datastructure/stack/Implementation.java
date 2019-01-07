package com.bridgelabz.datastructure.stack;

public class Implementation
{
	/**
	 * check my expression is balance or not
	 * @param expression-------->mathematical expression
	 * @return-->boolean value stack is empty or not
	 */
	public static boolean checkStable(String expression)
	{
	 Stack <Character> stack = new Stack<Character>();
			
		for(int  i = 0 ; i < expression.length(); i++)
		{
			if(expression.charAt(i)=='(' ||expression.charAt(i)=='{'||expression.charAt(i)=='[')
			{
			stack.push(expression.charAt(i));
			}
			if(expression.charAt(i)==')' && stack.peek().equals('('))
			{
			stack.pop();	
			}
			if(expression.charAt(i)=='}' && stack.peek().equals('{'))
			{
			stack.pop();	
			}
			if(expression.charAt(i)==']' && stack.peek().equals('['))
			{
			stack.pop();	
			}
		}
		return stack.isEmpty();
		
	}
}
