package com.downcasting;

public class MainDownChecking {
public static void main(String[] args) {
	DownCasting d1=new UPcasting();
	d1.display();//upcasting
	 UPcasting u1=  (UPcasting) d1;	//downcasting
	 u1.test();
}
}
