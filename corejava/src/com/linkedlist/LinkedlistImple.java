package com.linkedlist;

public class LinkedlistImple {
	private  Node start;
	private  Node last;
	private int count;
	void add(Object element) {
	if(start==null) {
		start=new Node(element);
		last=start;
		
	}
	else
	{
		last.next=new Node(element);
		last=last.next;
	}
	}
	int getsize() {
		return count;
		
	}Object getindex(int index){
		if(index>=getsize()) {
			throw new ArithmeticException();		}
		Node p=start;
	
		for(int i=0;i<=index;i++) {
			
			p=p.next;
		}
	return p.data;
	}
	public String toString() {
		if(getsize()==0) {
		return"[]";
		}
		String s="["+start.data;
		Node p=start;
		while(p.next!=null) {
			s=s+" "+p.data;
			
		}
		
		return s+"]";
		
	}
	
		class Node{
			Object data;
			Node next;
			Node(Object ele)
			{
            data=ele;
				count++;
				//toString();
			}
			
		}
	}


