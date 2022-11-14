package com.equalsmethod;

public class EqualsMain {

	public static void main(String[] args) {
		EqualsMethod e1=new EqualsMethod(200);
		EqualsMethod e2=new EqualsMethod(300);
		//System.out.println(e1.pages==e2.pages);
		System.out.println(e1);
		System.out.println(e2);	
	//	System.out.println((e1.pages).equals(e2.pages));
		System.out.println(e1.equals(e2));
	}

}
