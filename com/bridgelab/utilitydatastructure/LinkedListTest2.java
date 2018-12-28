package com.bridgelab.utilitydatastructure;

import static org.junit.Assert.*;
import org.junit.Test;

public class LinkedListTest2 {

	UnOrderLinkedList<String> ll = new UnOrderLinkedList<>(); 
	
//1===========================================add element at first position=========================================================================
	
	@Test   //annotation
	//provide additional metadata
	// @test: means tells JUnit that this public void method (Test Case here) to which it is attached can be run as a test case.
	public void testAddFirst()
	{
		ll.add("amol");
		ll.add("deepak");
		ll.add("ansar");
		ll.add("aman");
		ll.add("raman");
		ll.addFirst("manohar"); //add element at first position
		System.out.println(ll.get(1));
		assertEquals("manohar", ll.get(1)); //check my first element is equal is expected 
	
	
	}
	
	
//2========================================test whether my add element one after=======================================================================================
	
	
	@Test
	public void testAppend()
	{
		int Prev_length = ll.size();
		ll.add("dog");
		assertTrue(Prev_length<ll.length);//check my length is greater than previous length
	}
	
	
//3=========================test my isEmpty method work correctly==========================================================
	@Test
    public void testisEmpty() 
	{
		//ll.append("cat");
	assertEquals(true,ll.isEmpty());
	}
//4==============================remove given data element==================================================================================
	
	@Test
	public void testRemoveData()
	{
		ll.add("amol");
		ll.add("deepak");
		ll.add("ansar");
		ll.add("aman");
		ll.add("raman");
		ll.remove("ansar");
		assertFalse(ll.search("ansar"));
	}
//5=========================test my remove method work correctly==========================================================	
	@Test
	public void testRemoveFirst()
	{

		ll.add("amol");
		ll.add("deepak");
		ll.add("ansar");
		ll.add("aman");
		ll.add("raman");
		ll.removeFirst();
		assertFalse(ll.search("amol"));
	}
//6=========================test my Length method work correctly==========================================================
	@Test
	public void testLength()
	{
		int length1 = ll.size();
		ll.add("sdsd");
		assertTrue(length1<ll.size());
	}
//7================================test position of element work properly=======================================================================	
	@Test
	public void testPositionElement()
	{
		ll.add("amol");
		ll.add("deepak");
		ll.add("ansar");
		ll.add("aman");
		ll.add("raman");
		int position = ll.positionOf("deepak");
		assertEquals(2,position);
	}
//8==================================test insertAt position method=====================================================================================
	@Test
	public void testInsertAt()
	{
		ll.add("amol");
		ll.add("deepak");
		ll.add("ansar");
		ll.add("aman");
		ll.add("raman");
		ll.addAt(3, "bridgelab");
		//System.out.println(ll.get(4));
		assertEquals("bridgelab", ll.get(3)); // get element at particular position and check its equal or not
	}
//9================================test remove at position====================================================================================
	@Test
	public void testRemoveAt()
	{
		ll.add("amol");
		ll.add("deepak");
		ll.add("ansar");
		ll.add("aman");
		ll.add("raman");
		ll.removeAt(3);
		assertFalse("ansar"==ll.get(3));
	}
	
}
