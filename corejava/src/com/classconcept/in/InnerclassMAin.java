package com.classconcept.in;

public class InnerclassMAin {

	public static void main(String[] args) {
		Innerclassin in=new Innerclassin(20);
		
		Innerclassin.Incl2 in2 =in.new Incl2();
		in2.display2();

	}

}
