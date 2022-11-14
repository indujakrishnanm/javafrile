package com.collection;

import java.util.ArrayList;

public class CollectionMethods {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		ArrayList obj2=new ArrayList();
		obj.add("induja");
		obj.add(0);
		obj.add(9.0f);
		obj2.add("apple");
		obj2.add("90");
		obj2.add(9.0f);
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.containsAll(obj2));
		System.out.println(obj.equals(obj2));
	obj.clear();
	
	System.out.println(obj);
	System.out.println(obj.isEmpty());
	System.out.println(obj.addAll(obj2));
	System.out.println(obj);
	System.out.println(obj.contains("90"));
	System.out.println(obj.remove("apple"));
	System.out.println(obj);
	System.out.println(obj.hashCode());
;	
		}

}
