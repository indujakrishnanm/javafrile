package com.multithreading;

public class RunnableinterfcaetodetectMain {
/*void display() {
	for(int i=0;i<=100;i++) {
		System.out.println(i);
	}
}*/
	public static void main(String[] args) {
		RunnableinterfcaetodetectMain ru=new RunnableinterfcaetodetectMain();
		
		 Runnable r=new Runnableinterfcaetodetect();
		 for(int i=0;i<=100;i++) {
				System.out.println(i);
			}
		 //ru.display();
		Thread t =new Thread(r);
		t.start();

	}

}
