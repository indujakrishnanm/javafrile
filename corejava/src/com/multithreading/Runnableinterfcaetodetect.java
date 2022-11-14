package com.multithreading;

public class Runnableinterfcaetodetect implements Runnable {

	@Override
	public void run() {
		for(char c='a';c<='z';c++) {
			System.out.println(c);
		}
		
		
	}
	

}
