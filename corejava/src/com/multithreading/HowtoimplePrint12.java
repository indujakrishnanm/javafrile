package com.multithreading;

public class HowtoimplePrint12 {//
	//multithreading executing multiple prgm concurrently ------>thread is an independent path of execution 
	//we can acheive multithrreading by
	//*overriding the run() from Thread class
	//*overriding the run() from runnable interface

	public static void main(String[] args) {
		Thread t=new PrintingAbc(); 
		 t.start();
		for(int i=0;i<100;i++) {
			System.out.println(i);
		}
		
	}

}
