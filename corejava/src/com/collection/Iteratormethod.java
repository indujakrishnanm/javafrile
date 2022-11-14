package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Iteratormethod {

	public static void main(String[] args) {
		Set s=new TreeSet();
		s.add("php");
		s.add("java");
		s.add("linux");
		s.add("apple");
		s.add("zebra");
		Iterator itr=s.iterator()	;
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		
//tree always print  in ascending order
		//linkedset prints in entered order
		//Hashset print using hashing code technique
	}

}
