package arrayin;

import java.util.Scanner;

public class Multidimensional {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no:of rows");
		int rows=sc.nextInt();
		System.out.println("enter the no:of col");
		int col=sc.nextInt();
		int arr[][]=new int[rows][col];
		System.out.println("enter the array elements");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				 arr[i][j]=sc.nextInt()	;	
				 }}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++) {
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	
		}
	

	}

