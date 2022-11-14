package com.iterable;

public class ArrayListImplementation {
	Object arr[]=new Object[3];
	int p=0;
	void display(int ele ){
		if(p>=arr.length) {
			increase();
		}
		arr[p++]=ele;
	}

	void increase() {
		int newSize=(arr.length+(arr.length/2));
		Object arr2=new Object[newSize];
		for(int i=0;i<=arr.length;i++) {
			arr2=arr[i];
			System.out.println(arr2);
		}
		arr2=arr;
}
	public static void main(String[] args) {
		ArrayListImplementation obj=new ArrayListImplementation();
		obj.display(1);
		obj.display(0);
		obj.display(908);
		obj.display(0);
		
		
	}
}
