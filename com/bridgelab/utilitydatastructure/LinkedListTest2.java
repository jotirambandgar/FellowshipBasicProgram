package com.bridgelab.utilitydatastructure;

import static org.junit.Assert.*;
import org.junit.Test;

public class LinkedListTest2 {

	LinkedList<String> ll = new LinkedList<>(); 
	
//1===========================================add element at first position=========================================================================
	
	
	public void testAddFirst()
	{
		ll.append("amol");
		ll.append("deepak");
		ll.append("ansar");
		ll.append("aman");
		ll.append("raman");
		ll.addFirst("manohar"); //add element at first position
		assertEquals("amol", ll.firstElement()); //check my first element is equal is expected 
	
	
	}
	
	
//2========================================test whether my add element one after=======================================================================================
	
	
	@Test
	public void testAppend()
	{
		int Prev_length = ll.length();
		ll.append("dog");
		assertTrue(Prev_length<ll.length);//check my length is greater than previous length
	}
	
	
//3=========================test my isEmpty method work correctly==========================================================
	@Test
    public void testisEmpty() 
	{
		//ll.append("cat");
	assertEquals(true,ll.isEmpty());
	}
	@Test
	public void testRemoveData()
	{
		ll.append("amol");
		ll.append("deepak");
		ll.append("ansar");
		ll.append("aman");
		ll.append("raman");
		ll.deleteNode("ansar");
		assertFalse(ll.isPresent("ansar"));
	}
//4=========================test my remove method work correctly==========================================================	
	@Test
	public void testRemoveFirst()
	{

		ll.append("amol");
		ll.append("deepak");
		ll.append("ansar");
		ll.append("aman");
		ll.append("raman");
		ll.removeFirst();
		assertFalse(ll.isPresent("amol"));
	}
//5=========================test my Length method work correctly==========================================================
	@Test
	public void testLength()
	{
		int length1 = ll.length();
		ll.append("sdsd");
		assertTrue(length1<ll.length());
	}
//6================================test position of element work properly=======================================================================	
	@Test
	public void testPositionElement()
	{
		ll.append("amol");
		ll.append("deepak");
		ll.append("ansar");
		ll.append("aman");
		ll.append("raman");
		int position = ll.positionOf("deepak");
		assertEquals(2,position);
	}
//7==================================test insertAt position method=====================================================================================
	@Test
	public void testInsertAt()
	{
		ll.append("amol");
		ll.append("deepak");
		ll.append("ansar");
		ll.append("aman");
		ll.append("raman");
		ll.addAt(3, "bridgelab");
		assertEquals("bridgelab", ll.get(3)); // get element at particular position and check its equal or not
	}
//8================================test remove at position====================================================================================
	@Test
	public void testRemoveAt()
	{
		ll.append("amol");
		ll.append("deepak");
		ll.append("ansar");
		ll.append("aman");
		ll.append("raman");
		ll.removeAt(3);
		assertFalse("ansar"==ll.get(3));
	}
}
