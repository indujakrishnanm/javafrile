package com.collection;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;
//here since it check as ascending order datatype of 2elements can't be mixed
public class Setclasses1{ 
	public static void main(String[] args) {
		
	
	HashSet hs=new HashSet();//mainly work using hashcode
	hs.add("mango");
	hs.add("apple");
	hs.add("orange");
	hs.add("pineapple");
	hs.add("pineapple");
	hs.add("pineapple p i ");
	System.out.println(hs);


	LinkedHashSet lk=new LinkedHashSet();//works using linked list 
lk.add("diarymilk");
lk.add("kitkat");
lk.add("toblerone");
lk.add("snikers");
lk.add("snikers");
System.out.println(lk);



TreeSet ts=new TreeSet();
ts.add("java");
ts.add("python");
ts.add("php");
ts.add("c++");

System.out.println(ts);

TreeSet ts1=new TreeSet();
ts1.add(23);
ts1.add(12);
ts1.add(98);
ts1.add(17);
//ts1.add("hlw");
System.out.println(ts1);
}
}