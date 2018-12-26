package com.bridgelab.utilitydatastructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {

//============================1.TESTING ENQUE METHOD===========================================================================
	@Test
	public void testEnque()
	{
		Queue <Integer> queue = new Queue<>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
		
		queue.show();
		System.out.println(queue.size());
		System.out.println(queue.topElement());
		assertEquals(9, queue.size()); // after adding element check my size equals to number of elements
		
		assertEquals(1, queue.topElement()); // check it follow fifo order
	}
//===============================TestDequeu method =======================================================================================
	@Test
	public void testDeque()
	{
		Queue <Integer> queue = new Queue<>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
		queue.dequeu();
		assertEquals(2, queue.topElement());
		queue.dequeu();
		queue.dequeu();
		queue.dequeu();
		queue.dequeu();
		queue.dequeu();
		queue.dequeu();
		queue.dequeu();
		queue.dequeu();
		assertTrue(queue.isEmpty()); // check after deletion of element stsck is empty or not 
	}
	
//==================================test size method==========================================================================
	@Test
	public void testSize()
	{
		Queue <Integer> queue = new Queue<>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
		assertEquals(9, queue.size());

	}
}
