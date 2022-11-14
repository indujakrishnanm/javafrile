package com.induja.corejava.Constructor.returnob;
import java.util.*;
public class Returnobj2 {
	 ReturnObj bookname() {         //here we turn an object of class type returnobj

	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the author name");
	String name=sc.nextLine();
	System.out.println(" book name");
	String name1=sc.nextLine();
	System.out.println("no:of  books");
	int n=sc.nextInt();
	return new ReturnObj( name,name1,n);
	}
}