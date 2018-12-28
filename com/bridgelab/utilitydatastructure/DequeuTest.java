package com.bridgelab.utilitydatastructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class DequeuTest {

//===================================test AddFront method works or not============================================	
	@Test
	public void testAddFront()
	{
		Dequeu<Integer> dequeu = new Dequeu<>();
		dequeu.addRear(1);
		dequeu.addRear(2);
		dequeu.addRear(3);
		dequeu.addRear(4);
		dequeu.addRear(5);
		dequeu.addRear(6);
		dequeu.addRear(7);
		dequeu.addRear(8);
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
		dequeu.addRear(2);
		dequeu.addRear(3);
		assertEquals(3,dequeu.lastElement());
	}
//==================================test removeFront method=====================================================================================
	@Test
	public void testRemoveFront()
	{
		Dequeu<Integer> dequeu = new Dequeu<>();
		dequeu.addRear(1);
		dequeu.addRear(2);
		dequeu.addRear(3);
		dequeu.addRear(4);
		dequeu.addRear(5);
		dequeu.addRear(6);
		dequeu.addRear(7);
		dequeu.addRear(8);
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
			dequeu.addRear(2);
			dequeu.addRear(3);
			dequeu.removeRear();
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

