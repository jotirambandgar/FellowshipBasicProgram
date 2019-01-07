package com.bridgelabz.datastructure.queue;



public class Queue<T> 
{
	Node head;
	int length = 0;
class Node<T>
{
	T data;
	Node next;
	
	Node(T data)
	{
		this.data = data;
		head = null;
	}
}

//========================add element in queue=========================================================

public void enqueue(T data)
{
	Node new_node = new Node(data);
	Node temp = head;
	boolean flag = false;
	if(head == null)  // if no element present in List
	{
		head = new_node;
		length++;
		return;
	}
	while(temp.next != null ) // traverse upto temp.next become null
	{
		if(temp.data.equals(data)) // check element is already present
		{
			flag = true;
		}
		temp = temp.next;
		
	}
	if(flag == false)
	{
	temp.next = new_node;// add element after present element
	length++;
	 new_node.next = null;
	}
}

//============================remove first in element=============================================================

public void dequeu()
{
	if(length == 0)
	{
		System.out.println("No element present in List");
		return;
	}
	head = head.next;
	
	length--;
}

//===============================check my dequeue i s empty or not=======================================================================

public boolean isEmpty()
{
	return(length == 0);
}

//====================================find size of stack==================================================================
public int size()
{
	return length;
}
public <T>T topElement()
{
	return (T)head.data;
}
//==========================================print  stack==============================================================================
public void display()
{
	Node new_node = head;
	int size = size();
	System.out.print("[");
	for(int i = 0 ; i <size;i++)
	{
		if(i<size-1)
		{
		System.out.print(new_node.data+" ,");
		}
		else
		{
			System.out.print(new_node.data+"");
		}
		new_node = new_node.next;
		
	}
	System.out.print("]");
	
	return;
}
//====================================get element from position================================================================================================================
public <T>T get(int position)
{
	Node new_node = head;
	int count = 1;
	if(position == 1)
	{
		return (T) new_node.data;
	}
	T element;
		while(new_node.next != null)
		{
		new_node = 	new_node.next;
		count++;
		if(count == position)
		{
			element = (T)new_node.data;
			return (T) element;
		}
		}
	return null ;
}
}

