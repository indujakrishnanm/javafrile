package arrayin;

import java.util.Scanner;

public class Ascendingorder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
int arr[]=new int [size];
System.out.println("enter the array elements");
for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
	//System.out.println("original data"+arr[i]);
}
System.out.println("sorted array is");

for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
	if(arr[i]>arr[j])
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	
}
	System.out.print(arr[i]+" ");
	
}
	}

}
