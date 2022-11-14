package com.collection;

import java.util.HashSet;
import java.util.Set;

public class SetImplemain {

	public static void main(String[] args) {
		
		Set Sr=new HashSet();
		Sr.add(new SetIMple(56,28,"induja"));
		Sr.add(new SetIMple( 21,32,"ashrin"));
		Sr.add(new SetIMple ( 21,32,"ashrin"));
				System.out.println(Sr);
	}

}
