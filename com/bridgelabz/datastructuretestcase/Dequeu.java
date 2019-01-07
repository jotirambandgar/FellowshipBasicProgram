package com.bridgelabz.datastructuretestcase;

public class Dequeu<T> 
{
	public Dequeu()
	{
		
	}
	UnOrderLinkedList<T> linkedlist = new UnOrderLinkedList<>();
	
//==============================add element at first========================================
	
     public void addFront(T data)
	   {
    		linkedlist.addFirst(data);
	   }
     
//==============================add element at rare==========================================
   
     public void addRear(T data)
     {
    	 linkedlist.add(data);
     }
     
//==============================remove element from front============================================
     public void removeFront()
     {
    	 linkedlist.removeFirst();
     }
     
//===============================remove element from rare=========================================================
     
     public void removeRear()
     {
    	 linkedlist.pop();
     }
     
//=================================check my dequeue is empty=======================================================================
     
     public boolean isEmpty()
     {
    	 return linkedlist.isEmpty();
     }
     
//=================================check size============================================================
   
     public int size()
     {
    	 return linkedlist.size();
     }
   
//=================================return front element====================================================
     public <T>T frontElement()
     {
    	 return linkedlist.firstElement();
     }
   
//=================================return last element================================================================
     public <T>T lastElement()
     {
    	 return linkedlist.lastElement();
     }
}