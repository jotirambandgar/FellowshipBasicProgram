package com.bridgelab.datastructure;

public class Queue<T> 
{
UnOrderList <T> LinkedList =  new UnOrderList<>();

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

//===============================check my dequeue i s empty or not=======================================================================

public boolean isEmpty()
{
	return LinkedList.isEmpty();
}

//====================================find size of stack==================================================================
public int size()
{
	return LinkedList.size();
}
public <T>T topElement()
{
	return (T)LinkedList.firstElement();
}
//==========================================print  stack==============================================================================
public void display()
{
	LinkedList.display();
}
}

