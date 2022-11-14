package com.exception.ja;



public class Trowsnew {
	public  static void test(int mark) throws MyOwnException {  
		if(mark>40) {
			System.out.println("paased with  grade A ");
		}
		else {
			throw new MyOwnException("your mark is "+mark +"not eligible for higher studies");
		}
	}

	public static void main(String[] args) throws  MyOwnException {
		//test(23);
	try {
		test(23);
	} catch (MyOwnException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}}
