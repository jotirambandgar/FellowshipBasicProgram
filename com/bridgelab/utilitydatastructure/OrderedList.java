package com.bridgelab.utilitydatastructure;



public class OrderedList 
{
	Node head;
	int length = 0;
class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data = data;
		this.next = null; 
	}
	
}
//================================add node as well as sort it======================================================

public void add(int data)
{
	Node new_node = new Node(data);
	Node temp = head;
	Node prev = temp;
	if(head == null)
	{
		head = new_node;
		length++;
		return;
	}
	if(head.data > data)
	{
		new_node.next = head;
		head = new_node;
		length++;
		return;
	}
	while(temp.next != null)
	{
		prev = temp;
		temp = temp.next;
		if(temp.data>data)
		{
			prev.next =new_node;
			new_node.next =temp;
			length++;
			return;
		}
		
		
	}
	if(temp.next == null )
	{
		temp.next = new_node;
		length++;
	}
	
}
//==========================================remove data element from linkedlist===============================================
public void remove(int data)
{
Node temp = head;
Node prev = temp;
if(temp.data == data) // if head contain key
{
	//head = null; 
	head=temp.next;//change head
	length--;
	return;
}
while(temp.next != null )
{
	prev = temp;
	temp =temp.next;
	if(temp.data == (data))
	{
		prev.next = temp.next;
		length--;
		return;
	}
}
if(temp.next == null)                        // If key is not present in linked list 
{
return;	
}
}
//============================================check my element is present in linkedlist==============================================================================
public boolean search(int data)
{
	Node temp = head;
	if(head.data == data)
	{
		return true;
	}
	while(temp.next != null)
	{
		temp = temp.next;
		if(temp.data == data) 
		{
			return true;
		}
	}
	return false;
	
}
//================================search data in UnOrderLinkedList=================================================================================================
	public int index(int data)
	{
		int count  = 1 ;
		Node temp = head;
		if(head.data==(data))
		{
			return count;
		}
		while(temp.next != null)
		{
			temp = temp.next;
			count++;
			if(temp.data == (data))
			{
				return count;
			}
		}
		if(count == length)
		{
			System.out.println("data not present");
		}
		return 0;
	}
//======================================print linkedlist==============================================================	
	public void show()
	{
		Node new_node = head;
		int size = length();
		System.out.print("[");
		for(int i =0 ; i < size; i++)
		{
			
			System.out.print(new_node.data+",");
			new_node = new_node.next;
			
		}
		System.out.print("]");
		
		return;
	}
//=================================================check my linkedlist is empty or not=====================================================================
		
		public boolean isEmpty()
		{
			return(length == 0);
		}
//===================================find length========================================================================================================
		public int length()
		{
			return length;
		}
//========================================element at particular position===============================================================================
		public int get(int position)
		{
			Node new_node = head;
			int count = 1;
			if(position == 1)
			{
				return new_node.data;
			}
			int element;
				while(new_node.next != null)
				{
				new_node = 	new_node.next;
				count++;
				if(count == position)
				{
					element = new_node.data;
					return element;
				}
				}
			return 0 ;
		}
}
