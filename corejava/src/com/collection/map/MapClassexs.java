package com.collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClassexs {

	public static void main(String[] args) {
	Map m1=new HashMap(); //work using hashing code
	m1.put(1, "java");
	m1.put(221,"php");
	m1.put(22, "phython");
	m1.put(4, "c++");
	System.out.println("printed using hash map  s "+m1);
	
	Map m2=new LinkedHashMap();
	m2.put(100, "java");
	m2.put(892,"php");
	m2.put(223, "phython");
	m2.put(143, "c++");
	System.out.println("prinnted using linked hash map   "+m2);
	
	Map m3=new Hashtable<>();
	m3.put(1, "java");
	m3.put(2,"php");
	m3.put(2, "phython");
	m3.put(4, "c++");
	System.out.println("printed using hastable   "+m3);
	
	TreeMap<Integer, String> m4=new TreeMap();
	m4.put(1, "java");
	m4.put(2,"php");
	m4.put(245, "phython");
	m4.put(4, "c++");
	System.out.println("printed using Treemap   "+m4);// it compare the value the ascending order
	


	}
//HashTable                                          //HashMap
//* Legacy class                                     *after 1.2 version
//can't make key or values as null                   *can make one key as null and make no:of values null
//they are synchronixed so thread safe               * not synchronized and so not thread safe
}
