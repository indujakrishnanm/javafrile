package com.aggregation;

public class Aggregation2 {
String name;
int age;
int mark;
Aggregation1 adr;
public Aggregation2(String name, int age, int mark,Aggregation1 adr) {
	super();
	this.name = name;
	this.age = age;
	this.mark = mark;
	this.adr=adr;
}
void display() {
	System.out.println("Student details:");
	System.out.println("Student name:"+name);
	System.out.println("Student age"+age);
	System.out.println("Student mark:"+mark);
	System.out.println("Student address:"+adr);
	
}
}
