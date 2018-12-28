package com.bridgelab.datastructure;

public class UnOrderList<T>
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
    UnOrderList()
	{
		
	}
//========================================add first=========================================================================================================
	public void addFirst(T data)
	{
		
			
		Node new_node = new Node(data);
		if(head == null)
		{
			head = new_node;
			length++;
			new_node.next = null;
			return;
		}
		new_node.next = head;
		head = new_node;
		length++;
	}
//========================================add element in order=========================================================================

	public void add(T data)
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
				length++;
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
//================================search data in UnOrderLinkedList=================================================================================================
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
		public void display()
		{
			Node new_node = head;
			int size = length();
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
//=================================================first position element==========================================================================
		public <T>T firstElement()
		{
			return (T)head.data;
		}
//=================================================first position element==========================================================================
			public <T>T lastElement()
			{
				Node temp = head;
				while(temp.next != null)
				{
					temp = temp.next;
				}
				return (T) temp.data;
			}
		
//==================================================element at particular position===============================================================================
		public String get(int position)
		{
			Node new_node = head;
			int count = 1;
			if(position == 1)
			{
				return (String)new_node.data;
			}
			String element;
				while(new_node.next != null)
				{
				new_node = 	new_node.next;
				count++;
				if(count == position)
				{
					element = (String)new_node.data;
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
	public boolean search(T data)
	{
		Node temp = head;
		if(head.data.equals(data))
		{
			return true;
		}
		while(temp.next != null)
		{
			temp = temp.next;
			if(temp.data.equals(data))
			{
				return true;
			}
		}
		return false;
		
	}
//==========================================remove data element from linkedlist===============================================
	public void remove(T data)
	{
	Node temp = head;
	Node prev = temp;
	if(temp.data.equals(data)) // if head contain key
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
		if(temp.data.equals(data))
		{
			prev.next = temp.next;
			length--;
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
				length--;
				return;
				//new_node.next = temp;
			}
		}
		
	}
}
