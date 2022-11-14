package com.classconcept.in;
//Nested class is used to create a class inside a clas or interface, there are 2types of nested classes static class and non-static class, 
//non-static class is called inner class
public class NestedClass {
	private static int i;
	NestedClass (int i){
	this.i=i;
		System.out.println("hlw java");
	}
	static class Nested1{
		static void displayI() {
			System.out.println(i);//inner class we can acess private as well as public members
		}
		
		
	}
	
	

}
