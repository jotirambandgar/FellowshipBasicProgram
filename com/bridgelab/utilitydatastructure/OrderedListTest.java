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
		unorder.append(1);
		order.add(7);
		unorder.append(7);
		order.add(6);
		unorder.append(6);
		order.add(4);
		unorder.append(4);
		order.add(3);
		unorder.append(3);
		order.add(56);
		unorder.append(56);
		order.add(3);
		unorder.append(3);
		order.add(5);
		unorder.append(5);
		OrderedList original = new OrderedList();
		//assertTrue(unorder == (Integer)order);
		
		
		
	
	}

}
