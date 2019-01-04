package com.bridgelabz.datastructure.dequeue;



public class Deque<T> 
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
	public Deque()
	{
		
	}

	
//==============================add element at first========================================
	
     public void addFront(T data)
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
     
//==============================add element at rare==========================================
   
     public void addRear(T data)
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
    			temp = temp.next;
    		}
    		temp.next = new_node;// add element after present element
    		length++;
    		new_node.next = null;
    }
     
//==============================remove element from front============================================
     public <T>T removeFront()
     {
    	 T first = frontElement();
    	 if(length == 0)
 		{
 			System.out.println("No element present in List");
 			return null;
 		}
 		head = head.next;
 		length--;
 		return first;
    	 
     }
     
//===============================remove element from rare=========================================================
     
     public <T>T removeRear()
     {
    	 T lastElement = lastElement();
    	 Node prev_node = head;
 		Node temp = head;
 		if(length == 0)
 		{
 			System.out.println("No element present in List");
 			return null;
 		}
 		while(temp.next != null)
 		{
 			prev_node =temp;
 			temp= temp.next;
 		}
 		prev_node.next = null;
 		length--;
    	 return lastElement;
     }
     
//=================================check my dequeue is empty=======================================================================
     
     public boolean isEmpty()
     {
    	 return(length == 0);
     }
     
//=================================check size============================================================
   
     public int size()
     {
    	 return length;
     }
   
//=================================return front element====================================================
     public <T>T frontElement()
     {
    	return (T)head.data;
     }
   
//=================================return last element================================================================
   
     public <T>T lastElement()
     {
    	 Node temp = head;
			int count = size();
			while(temp.next!=null)
			{
				temp = temp.next;
				count--;
			}
			return (T) temp.data;
     }
     
//==============================display===========================================================================================     
     
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
}
