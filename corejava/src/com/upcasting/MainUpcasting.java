package com.upcasting;

public class MainUpcasting extends Upcasting1 {
	 static void check(Upcasting upcasting) {
		System.out.println("hlw dude");
		
	}

	public static void main(String[] args) {

		check(new Upcasting1());
		
		Upcasting upcasting=new MainUpcasting();
	//	upcasting.a();
//		upcasting.check();//
		upcasting.b();
	}

}
