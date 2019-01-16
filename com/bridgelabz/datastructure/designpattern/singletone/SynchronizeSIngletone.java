package com.bridgelabz.datastructure.designpattern.singletone;
/**
 * Synchronize singletone
 * @author bridgeit
 *
 */
class D
{
	static D obj;
	private D()
	{
		System.out.println("hello");
	}
	public static synchronized D  getInstance()// allow one thread at one time
	{
		if(obj == null)
		{
			obj = new D();
		}
		return obj;
	}
}
class DoubleCheck
{
	static DoubleCheck obj;
	private DoubleCheck() {System.out.println("hii double check");}
	public static DoubleCheck getInstance()
	{
		if(obj == null)
		{
			synchronized (DoubleCheck.class) {
				if(obj == null)
				{
					obj = new DoubleCheck();
				}
				
			}
		}
		return obj;
	}
}
public class SynchronizeSIngletone 
{
	public static void main(String[] args) {
		
	//for normal synchronization
Thread t1 = new Thread(new Runnable(){
public void run()	
{
	D obj1 = D.getInstance();
}
});
Thread t2 = new Thread(new Runnable(){
public void run()	
{
	D obj1 = D.getInstance();
}
});
t1.start();
t2.start();
//for double check locking
Thread t3 = new Thread(new Runnable(){
public void run()	
{
	DoubleCheck obj1 = DoubleCheck.getInstance();
}
});
Thread t4 = new Thread(new Runnable(){
public void run()	
{
	DoubleCheck obj2 = DoubleCheck.getInstance();
}
});
t3.start();
t4.start();
}

}