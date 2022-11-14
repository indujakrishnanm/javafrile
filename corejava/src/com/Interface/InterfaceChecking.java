package com.Interface;

public interface InterfaceChecking {
	void hle();// only implementation is possible
	void hlw();// by default public, and abstract

}
  class MainIn implements InterfaceChecking{
public void hle() {	
	System.out.println("im in hle");
}
public void hlw() {
	System.out.println("im in hlw");
	
}
}
  class Mainin2 implements InterfaceChecking{

	@Override
	public void hle() {
		System.err.println("im in hle ,main2");
	}

	@Override
	public void hlw() {
		System.out.println("im in hle, main in2");
		
	}
	  
  }
