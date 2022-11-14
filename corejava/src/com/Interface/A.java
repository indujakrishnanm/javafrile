package com.Interface;

public interface A {
	void on();
	void  off();

}
interface B extends A{
	void photo();
	void setting();
}
class MainAB implements B
{

	@Override
	public void on() {
		System.out.println("realme on");
		
	}

	@Override
	public void off() {
	
		System.out.println("realme off");
	}

	@Override
	public void photo() {
		System.out.println("realme could take photo");
		
	}

	@Override
	public void setting() {
		System.out.println("realme have setting ");
		
	}
	
}
