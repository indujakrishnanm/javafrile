package com.exceptionnewIn;

public class FinallyTry {

	void display() {
		String a=null;
		
				
		try {System.out.println(a.length());
			
		}
		finally {
		System.out.println("hiii its me after null pointer Exception");
	}
		System.out.println("me after finnally be executed");}
	public static void main(String[] args) {
		FinallyTry finallyTry=new FinallyTry();
		finallyTry.display();
	}

}
