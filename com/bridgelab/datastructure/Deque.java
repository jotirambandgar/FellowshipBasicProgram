package com.bridgelab.datastructure;

public class Deque<T> 
{
	public Deque()
	{
		
	}
	UnOrderList<T> linkedlist = new UnOrderList<>();
	
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
     public <T>T removeFront()
     {
    	 T firstElement =  linkedlist.firstElement();
    	 linkedlist.removeFirst();
    	return firstElement;
    	 
     }
     
//===============================remove element from rare=========================================================
     
     public <T>T removeRear()
     {
    	 T lastElement = linkedlist.lastElement();
    	 linkedlist.pop();
    	 return lastElement;
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
     public void display()
     {
    	 linkedlist.display();
     }
}
