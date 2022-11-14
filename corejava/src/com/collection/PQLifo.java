package com.collection;

import java.util.PriorityQueue;//works based on prority

public class PQLifo {
public static void main(String[] args) {
	PriorityQueue pr=new PriorityQueue();
pr.add(1);
pr.add(3);
pr.add(11);
pr.add(2);
pr.add(7);
pr.add(9);
//System.out.println(pr.peek());
//System.out.println(pr.poll());
System.out.println(pr.element());
}
}
