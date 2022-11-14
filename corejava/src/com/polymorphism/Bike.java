package com.polymorphism;

public class Bike {
	void test() {
		System.out.println("im in bike");
	}

}
class Vehicle extends Bike
{
	void test() {
		System.out.println("im in vehicle");
	}
}
