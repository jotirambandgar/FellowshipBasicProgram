package com.bridgelabz.datastructuretestcase;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	
//======================================check isEmpty method work correctly=====================================
	/**
	 * check isEmpty method work properly or not
	 * by checking without inserting element
	 * use Junit assert true method
	 */
	@Test
        public void testIsEmpty()
        {
        	Stack<Integer> stack = new Stack<>();
        	assertTrue(stack.isEmpty());
        }
//==================================testing element insert inside stack=================================== 	
	    /**
	     *testing push method 
	     *use assertFalse method for checking my statck is empty or not
	     */
	    @Test
	    
        public void testAppend()
        {
        	Stack<Integer> stack = new Stack<>();
    		stack.push(1);
    		stack.push(2);
    		stack.push(3);
    		stack.push(4);
    		stack.push(5);
    		stack.push(6);
    		stack.push(7);
    		stack.push(8);
    		assertFalse(stack.isEmpty());
		  }
//========================TESTING POP METHOD======================================================    
	    /**
	     * testing pop method by using asserttrue method
	     * assertTrue ch
	     */
	    @Test
	    public void testPop()
	    {
	    	Stack<Integer> stack = new Stack<>();
	    	stack.push(1);
    		stack.push(2);
    		stack.push(3);
    		stack.push(4);
    		stack.push(5);
    		stack.push(6);
    		stack.push(7);
    		stack.push(8);
    		stack.pop();
    		assertEquals(7,stack.peek());
	    }
//=============================TEST SIZE METHOD==============================================================
	    @Test
	    public void testSize()
	    {
	    	Stack<Integer> stack = new Stack<>();
	    	stack.push(1);
    		stack.push(2);
    		stack.push(3);
    		stack.push(4);
    		stack.push(5);
    		stack.push(6);
    		stack.push(7);
    		stack.push(8);
    		//System.out.println(stack.size());
    		assertEquals(8,stack.size());
	    }
//===============================TEST PEEK METHOD====================================================================================================
	    @Test
	    public void testPeek()
	    {
	    	Stack<Integer> stack = new Stack<>();
	    	stack.push(1);
    		stack.push(2);
    		stack.push(3);
    		stack.push(4);
    		stack.push(5);
    		stack.push(6);
    		stack.push(7);
    		stack.push(8);
    		assertEquals(8, stack.peek());
	    }
	    
}
