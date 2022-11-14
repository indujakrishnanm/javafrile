package com.multithreading.lifecycle;

public class Lifecycleth  extends Thread{
public //new-->a new thread is born using thread t=new thread()
//Runnable-->this interface schedule the time for thread created
//Running-->denote the thread currently running
//Dead -->thread after terminating
	void run(){
	System.out.println(Thread.currentThread().getPriority());
	//System.out.println(Thread.currentThread().setPriority(10));
	for(int i=0;i<=10;i++) {
		System.out.println(i);
		
	}
	
		
	}
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getPriority());
	Lifecycleth li=new Lifecycleth();
	//li.setPriority(10);//here we can control only in process level,not in os level
	li.start();
	Lifecycleth li2=new Lifecycleth();
	li2.setPriority(10);
	li2.start();
	System.out.println("hlw java");
}

}
