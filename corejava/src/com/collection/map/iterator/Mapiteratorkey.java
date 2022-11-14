package com.collection.map.iterator;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Mapiteratorkey {

	public static void main(String[] args) {
		
		Map m3=new Hashtable();
		m3.put(1, "java");
		m3.put(2,"php");
		m3.put(2, "phython");
		m3.put(4, "c++");
		System.out.println("printed using hastable   "+m3);
Iterator itr= m3.keySet().iterator();
while(itr.hasNext())
	{Object key =itr.next();
	Object value = m3.get(key);
	System.out.println(key+"  = "+value);
	}
	}

}
