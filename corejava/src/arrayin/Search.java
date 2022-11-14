package arrayin;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);int i;
	int arr[ ]= {1,4,8,9,7,0};
System.out.println("enter the element to be seached");
int s=sc.nextInt();
for(i=0;i<arr.length;i++) {
if(s==arr[i]) {
	System.out.println("searched element is present at index "+i);
	break;
}}
while(i==arr.length) {
	System.out.println("elSement not found in arrays");
	break;
}
}
}
