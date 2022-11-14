package com.equalsmethod;

public class EqualsMethod {
	int pages;
	EqualsMethod (int pages)
{
this.pages=pages;
System.out.println("the no:of pages in books"+pages);
}
	public boolean equals(Object x)
	{
		if(!(x instanceof EqualsMethod)){
			return true;	
		}
		return pages==((EqualsMethod)x).pages;//downcasting
		
}}

	
