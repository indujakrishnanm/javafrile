package com.induja.corejava.Constructor.returnob;

public class ReturnObj {
	int noofbooks;
	String name;
	String bookName;
	
	ReturnObj(String n, String bk,int bk1)
	{
		noofbooks=bk1;
		name=bk;
		 bookName=bk;
	}
	void display() {
		System.out.println("title name"+bookName);
		System.out.println("name author"+name);
		System.out.println(" book name"+bookName);	
	}

}
