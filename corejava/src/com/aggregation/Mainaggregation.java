package com.aggregation;

public class Mainaggregation {

	public static void main(String[] args) {
	Aggregation1 a=new Aggregation1("trivandrum","kerala","Abc");
	System.out.println(a);
	Aggregation2  a2=new Aggregation2("induja",21,90,a);
	a2.display();
	System.out.println(a2);
	

}
}