package com.induja.corejava.Constructor;

public class GD {
	
	int a;
	int b;
	int c;
	int total;
	GD(int d)
	{
	total=d;
	System.out.println("total mark is "+total);
	}
	public void name1()
	{
	a=100;
	b=100;
	c=90;
	total=a+b+c;
	System.out.println("first student mark is" +total);
	name2()	;
	}
	public static void name2()
	{
	//GD obj1=new GD();
	/*obj1.a=25;
	obj1.b=30;
	obj1.c=90;
	obj1.total=obj1.a+obj1.b+obj1.c;
	System.out.println("second student mark is" +obj1.total);
	obj1.name();
	}*/}
	public void name()
	{
	if(total>=100)
	{
		
		System.out.println("grade is a");
	}
	else if(total>=80)
	{
	System.out.println("grade is b");
	}
	else if(total>=60)
	{
		System.out.println("grade is c");
	}
	else if(total>=50)
	{
		System.out.println("grade is d");
	}
	else
	{
		System.out.println("failed");
	}
	}

	public static void main(String args[])
	{
	GD obj1=new GD(100);
	//GD obj1=new GD();



	}
	}

