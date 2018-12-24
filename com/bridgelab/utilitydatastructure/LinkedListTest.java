package com.bridgelab.utilitydatastructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void test() {
		LinkedList<String> ll = new LinkedList<>();
		int len = ll.length();
//		ll.append("dog");
//		assertTrue(len<ll.length());
		assertEquals(true,ll.isEmpty());
	}

}
