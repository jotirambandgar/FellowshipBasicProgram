package com.bridgelab.utilitydatastructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class DequeuTest {

//===================================test AddFront method works or not============================================	
	@Test
	public void testAddFront()
	{
		Dequeu<Integer> dequeu = new Dequeu<>();
		dequeu.addRare(1);
		dequeu.addRare(2);
		dequeu.addRare(3);
		dequeu.addRare(4);
		dequeu.addRare(5);
		dequeu.addRare(6);
		dequeu.addRare(7);
		dequeu.addRare(8);
		dequeu.addFront(10);
		dequeu.addFront(110);
		assertEquals(110, dequeu.frontElement());
		
	}
	
//=====================================test addRare method works or not=================================================================
	
	@Test
	public void testAddRare()
	{
		Dequeu<Integer> dequeu = new Dequeu<>();
		dequeu.addFront(10);
		dequeu.addFront(110);
		dequeu.addFront(101);
		dequeu.addFront(1102);
		dequeu.addFront(1011);
		dequeu.addFront(110111);
		dequeu.addFront(310);
		dequeu.addFront(510);
		dequeu.addRare(2);
		dequeu.addRare(3);
		assertEquals(3,dequeu.lastElement());
	}
//==================================test removeFront method=====================================================================================
	@Test
	public void testRemoveFront()
	{
		Dequeu<Integer> dequeu = new Dequeu<>();
		dequeu.addRare(1);
		dequeu.addRare(2);
		dequeu.addRare(3);
		dequeu.addRare(4);
		dequeu.addRare(5);
		dequeu.addRare(6);
		dequeu.addRare(7);
		dequeu.addRare(8);
		dequeu.addFront(10);
		dequeu.removeFront();
		System.out.println(dequeu.frontElement());
		assertEquals(1, dequeu.frontElement());
	}
	//==================================test removeRare method=====================================================================================
		@Test
		public void testRemoveRare()
		{
			Dequeu<Integer> dequeu = new Dequeu<>();
			dequeu.addFront(10);
			dequeu.addFront(110);
			dequeu.addFront(101);
			dequeu.addFront(1102);
			dequeu.addFront(1011);
			dequeu.addFront(110111);
			dequeu.addFront(310);
			dequeu.addFront(510);
			dequeu.addRare(2);
			dequeu.addRare(3);
			dequeu.removeRare();
			assertEquals(2,dequeu.lastElement());
		}
//==============================test isEmpty method works or not=======================================================================
		@Test
		public void testIsEmpty()
		{
			Dequeu<Integer> dequeu = new Dequeu<>();
			dequeu.addFront(10);
			dequeu.addFront(110);
			dequeu.addFront(101);
			dequeu.addFront(1102);
			dequeu.addFront(1011);
			dequeu.addFront(110111);
			dequeu.addFront(310);
			assertFalse(dequeu.isEmpty());
		}
		}

