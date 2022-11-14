package com.collection;

import java.util.ArrayList;
import java.util.List;

//add
//remove
//indexOf
//lastIndex
//get
//set
//subList
public class ListMethods {
public static void main(String[] args) {
	List list=new ArrayList();
	list.add("java");
	list.add("welcome");
	list.add(9);
	list.add("hle");
	System.err.println(list);
	list.add(0," list replaced");
	System.out.println(list);
	list.remove(0);
	list.add("hle");
	System.out.println(list);
	list.set(0, "list");
	
	System.out.println(list.get(0));
	System.out.println(list.indexOf(9));
	System.out.println(list.lastIndexOf("hle"));
	System.out.println(list.subList(2, 4));
}
}
