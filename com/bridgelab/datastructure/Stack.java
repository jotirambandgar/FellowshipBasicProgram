package com.bridgelab.datastructure;

public class Stack<T>
{
Node head;
int length = 0 ;
int top = -1;
static class Node<T>
{
	T data;
	Node<T> next;
 Node(T data)
 {
	this.data =data;
	this.next = null;
 }
}
public Stack()
{
	
}
//===================================push element in stack===========================================================
 public void push(T data)
 {
	 Node<T> new_node = new Node(data);
	 if(head == null)
	 {
		 head = new_node;
		 length++;
		 return;
	 }
	 new_node.next = head;
	 head = new_node;
	 length++;
	
 }
//=====================================check my stack is empty or not=======================================================
 public boolean isEmpty()
 {
	 return (head==null);
 }
//=============================for Last in first out==================================================================
 public void pop()
 {
	 Node current = head;
	 head = current.next;
	 length--;
 }
//==============================check size of stack===============================================
 public int size()
 {
	return length;
 }
//===============================print stack===============================================================
 public void display()
 {
	 int size = size();
	 
	 int count = 0;
	 Node current = head;
	 for(int i = 0; i< size;i++)
	 {
		
		 System.out.println(current.data);
		 current = current.next;
	 }
 }
//================================return top element in stack======================================================
 public <T>  T peek()
 {
	
	 return (T) head.data;
 }

}


