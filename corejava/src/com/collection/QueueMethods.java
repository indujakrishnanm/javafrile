package com.collection;

import java.util.LinkedList;

import javax.swing.plaf.synth.SynthStyleFactory;

public class QueueMethods {
//LIFO
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add("hii");
		list.add("mango");
		list.add("orange");
		list.add("amla");
		System.out.println(list);
		System.out.println(list.peek());
		//System.out.println(list);
		list.poll();
System.out.println(list);
	//list.pollFirst();
	//list.pollLast()
//;	System.out.println(list);}
	
System.out.println(list.element());
}}