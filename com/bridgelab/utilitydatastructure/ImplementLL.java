package com.bridgelab.utilitydatastructure;



public class ImplementLL {

	public static void main(String[] args)
	{
		UnOrderLinkedList<String> linkedlist = new UnOrderLinkedList<>();
		linkedlist.append("Hii");
		linkedlist.append("Dog");
		linkedlist.append("man");
		linkedlist.append("cat");
		linkedlist.append("horse");
		linkedlist.addFirst("sdfsdf");
		linkedlist.addFirst("dfsdf");
		linkedlist.addFirst("sdssd");
		//linkedlist.deleteNode("man");
		linkedlist.addAt(3, "bridgelab");
		System.out.println(linkedlist.firstElement());
		System.out.println("element at"+linkedlist.get(3));
		System.out.println("postion "+linkedlist.positionOf("Dog"));
		System.out.println("length of linkedlist :"+linkedlist.length());
	 // linkedlist.removeFirst();
	  System.out.println("is my list empty: "+linkedlist.isEmpty());
		linkedlist.show();
		

	}

}
