package com.bridgelab.utilitydatastructure;


public class LinkedList<T>
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
		next = null;
	}
	
}
//========================================add first=========================================================================================================
public void addFirst(T data)
{
	Node new_node = new Node(data);
	new_node.next = head;
	head = new_node;
}
//========================================add element in linkedList=========================================================================

public void append(T data)
{
Node new_node = new Node(data);
Node temp = head;
if(head == null)  // if no element present in List
{
	head = new_node;
	length++;
	return;
}
while(temp.next != null) // traverse upto temp.next become null
{
	temp = temp.next;
}
temp.next = new_node;// add element after present element
length++;
new_node.next = null;
}
//=====================================inset at==================================================================================================
public void addAt(int position,T data)
{
	Node new_node = new Node(data);
	int count =1;
	Node temp = head;
	Node prev = temp;
	while(temp != null && count <= position)
	{
		prev = temp;
		temp = temp.next;
		count++;
		if(count == position)
		{
			prev.next =new_node;
			new_node.next = temp;
			break;
		}
	}
	
}
//===================================remove first element==================================================================================================================
public void removeFirst()
{
	if(length == 0)
	{
		System.out.println("No element present in List");
		return;
	}
	head = head.next;
	length--;
}
//===================================remove last element===============================================================================
public void removeLast()
{
	
	Node prev_node = head;
	Node temp = head;
	if(length == 0)
	{
		System.out.println("No element present in List");
		return;
	}
	while(temp.next != null)
	{
		prev_node =temp;
		temp= temp.next;
	}
	prev_node.next = null;
	length--;
}
//===================================find length===============================================================================================================
public int length()
{
	return length;
}
//================================search data in LinkedList=================================================================================================
	public int positionOf(T data)
	{
		int count  = 1 ;
		Node temp = head;
		if(head.data.equals(data))
		{
			return count;
		}
		while(temp.next != null)
		{
			temp = temp.next;
			count++;
			if(temp.data.equals(data))
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
		for(int i = 0 ; i <size-1;i++)
		{
			if(new_node.data!=null)
			{
			System.out.print(new_node.data+",");
			new_node = new_node.next;
			}
		}
		System.out.print("]");
		
		return;
	}
//=================================================first position element==========================================================================
	public <T>T firstElement()
	{
		return (T)head.data;
	}
//==================================================element at particular position===============================================================================
	public String get(int position)
	{
		Node new_node = head;
		int count = 1;
		String element;
			while(new_node.next != null)
			{
			new_node = 	new_node.next;
			count++;
			if(count == position)
			{
				element = new_node.data.toString();
				return element;
			}
			}
		return null ;
	}
//=================================================check my linkedlist is empty or not=====================================================================
	
public boolean isEmpty()
{
	return(length == 0);
}
//============================================check my element is present in linkedlist==============================================================================
public boolean isPresent(T data)
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
//==========================================remove data from linkedlist===============================================
public void deleteNode(T data)
{
Node temp = head;
Node prev = temp;
if(temp.data.equals(data)) // if head contain key
{
	//head = null; 
	head=temp.next;//change head
	return;
}
while(temp.next != null )
{
	prev = temp;
	temp =temp.next;
	if(temp.data.equals(data))
	{
		prev.next = temp.next;
	}
}
if(temp.next == null)                        // If key is not present in linked list 
{
return;	
}

}
//=================================================remove at position==============================================================================
public void removeAt(int position)
{
	
	int count =1;
	Node temp = head;
	Node prev = temp;
	while(temp != null && count <= position)
	{
		prev = temp;
		temp = temp.next;
		count++;
		if(count == position)
		{
			prev.next =temp.next;
			//new_node.next = temp;
		}
	}
	
}
}


