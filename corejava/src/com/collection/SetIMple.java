package com.collection;

public class SetIMple {
int age;
int mark;
String name;
SetIMple(int age,int mark,String name){
	this.age=age;
	this.mark=mark;
	this.name=name;
	
}
public String toString() {
	
	return "["+name +","+mark+","+age+"]";
	
}
public int hashCode() {
	
	return age;
	
}
public boolean  equals(Object x) {
	if(!(x instanceof SetIMple) ){
	return false;}
	else
	{
		SetIMple s1=(SetIMple)x;
	return (name.equals(s1.name))&&(age==s1.age)&&(mark==s1.mark);
	
}}}
