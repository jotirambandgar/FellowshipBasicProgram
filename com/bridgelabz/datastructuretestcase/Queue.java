package com.bridgelabz.datastructuretestcase;

public class Queue<T> 
{
UnOrderLinkedList <T> LinkedList =  new UnOrderLinkedList<>();

//========================add element in queue=========================================================

public void enqueue(T data)
{
	LinkedList.add(data);
}

//============================remove first in element=============================================================

public void dequeu()
{
	LinkedList.removeFirst();
}

//===============================check my dequeu i s empty or not=======================================================================

public boolean isEmpty()
{
	return LinkedList.isEmpty();
}

//====================================find size of stack==================================================================
public int size()
{
	return LinkedList.size();
}
//=========================return first element from queue============================================================================

public <T>T topElement()
{
	return (T)LinkedList.firstElement();
}
//==========================================print  stack==============================================================================
public void show()
{
	LinkedList.show();
}
}

