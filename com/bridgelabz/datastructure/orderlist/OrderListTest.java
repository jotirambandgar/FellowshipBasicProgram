package com.bridgelabz.datastructure.orderlist;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderListTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		OrderedList<Integer> order = new OrderedList<>();
		int unorder[]=null;
		int sorted[]=null;
		order.add(1);
		unorder[0] =1;
		order.add(7);
		unorder[1] =7;
		order.add(6);
		unorder[2] =6;
		order.add(4);
		unorder[3] =4;
		order.add(3);
		unorder[4] =3;
		order.add(56);
		unorder[5] =56;
		order.add(3);
		unorder[6] =3;
		order.add(5);
		unorder[7] =5;
		int count = 0;
		while(count <= order.size())
		{
			sorted[count] =order.get(count+1);
			count++;
		}
		
		//test input which unsorted is same as sorted  
		assertFalse(sorted.equals(unorder));
		
		//test value present in list after adding element into list
		assertTrue(order.search(3));
		
		//test value not present in list after remove
		order.remove(56);
		assertFalse(order.search(56)); 
	}

}
