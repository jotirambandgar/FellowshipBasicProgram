package com.bridgelab.utilitydatastructure;



public class ImplementLL {

	public static void main(String[] args)
	{
		UnOrderLinkedList<String> linkedlist = new UnOrderLinkedList<>();
		linkedlist.add("Hii");
		linkedlist.add("Dog");
		linkedlist.add("man");
		linkedlist.add("cat");
		linkedlist.add("horse");
//		linkedlist.addFirst("sdfsdf");
//		linkedlist.addFirst("dfsdf");
//		linkedlist.addFirst("sdssd");
		//linkedlist.deleteNode("man");
		linkedlist.addAt(3, "bridgelab");
		System.out.println(linkedlist.firstElement());
		System.out.println("element at"+linkedlist.get(3));
		System.out.println("postion "+linkedlist.positionOf("Dog"));
		System.out.println("length of linkedlist :"+linkedlist.size());
	 // linkedlist.removeFirst();
	  System.out.println("is my list empty: "+linkedlist.isEmpty());
		linkedlist.show();
		

	}

}
