package com.bridgelab.utilitydatastructure;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
public class TestSinglyLinkedList
{
	public void testLinkedList()
	{
		LinkedList<String> ll = new LinkedList<>();
		int len = ll.length();
		ll.append("dog");
		assertTrue(len<ll.length());
	}

}
