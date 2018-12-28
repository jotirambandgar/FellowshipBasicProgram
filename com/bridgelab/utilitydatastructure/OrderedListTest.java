package com.bridgelab.utilitydatastructure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderedListTest {

	static OrderedList order = new OrderedList();
	static UnOrderLinkedList<Integer> unorder= new UnOrderLinkedList<>();

	@Test
	public static void testSortLinkedList()
	{
		order.add(1);
		unorder.add(1);
		order.add(7);
		unorder.add(7);
		order.add(6);
		unorder.add(6);
		order.add(4);
		unorder.add(4);
		order.add(3);
		unorder.add(3);
		order.add(56);
		unorder.add(56);
		order.add(3);
		unorder.add(3);
		order.add(5);
		unorder.add(5);
		OrderedList original = new OrderedList();
		//assertTrue(unorder == (Integer)order);
		
		
		
	
	}

}
