package com.multithreading;

public class PrintingAbc  extends Thread{
	 public void run() {
		 for(char i='a';i<='z';i++) {
			 System.out.println(i);
			 
		 }
		
	}

}
