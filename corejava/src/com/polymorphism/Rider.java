package com.polymorphism;

public class Rider {
	void test(Bike b1) {
		System.out.println("hii im in rider");
		b1.test();
	}
	void test(Vehicle v1) {
		System.out.println("hii im in rider with vechicle");
		v1.test();//CompileTym
	}
	

}

