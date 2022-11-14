package com_encapsulation_Inheritance;

//process of declare the field as private and access them through public methods using getter and setter,
//advantage;;we can make the datamemmbers as read only  and write only
public class Mainencap extends Encapsulation{
public static void main(String[] args) {
	 Mainencap mainencap=new Mainencap();
	// Encapsulation en =new Encapsulation();
System.out.println( mainencap.getAge());
System.out.println( mainencap.getName());
mainencap.setrno(45);
System.out.println( mainencap.getrno());
}
}
