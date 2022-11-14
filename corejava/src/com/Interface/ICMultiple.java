package com.Interface;

public interface ICMultiple {
	void on();
	void  off();


}
class MainABMultiple
{

	public void on() {
		System.out.println("realme on");
		
	}

	public void off() {
	
		System.out.println("realme off");
	}}
class MainInterface   extends MainABMultiple implements ICMultiple{
	public void on() {
		System.out.println("hii, im in MainInterface   ");
	}
public void off() {
	System.out.println(" hii im in ,MainInterface");
}
	
}