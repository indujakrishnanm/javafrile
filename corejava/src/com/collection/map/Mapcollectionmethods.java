package com.collection.map;

import java.util.Hashtable;
import java.util.Map;

public class Mapcollectionmethods {
     //get()
	//put()
	//size()
   //keyset()
	public static void main(String[] args) {
		Map m3=new Hashtable();
		m3.put(1, "java");
		m3.put(2,"php");
		m3.put(2, "phython");
		m3.put(4, "c++");
		System.out.println(m3.get(4));// work using keys
		System.out.println(m3.size());
		System.out.println(m3.keySet());
		System.out.println("printed using hastable   "+m3);

	}

}
