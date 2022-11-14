package com.exception.ja;

public class MyOwnException  extends RuntimeException{
	MyOwnException(){
		super();
		
	}
	MyOwnException(String a){
		super(a);
	}

}
