package com.exceptionnewIn;

public class CalssCAstException {

	void display(){
		int a=10;
		Integer integer=new Integer(a);//autoboxing
		//Float float1=new Float(integer);
		String  b=String.valueOf(integer);
		System.out.println(b);
	}
	public static void main(String[] args) {
		CalssCAstException calssCAstException= new CalssCAstException();
		try{calssCAstException.display();}
		catch(Exception e)
		{e.printStackTrace();}
	}

}
