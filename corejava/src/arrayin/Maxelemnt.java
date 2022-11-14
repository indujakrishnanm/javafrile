package arrayin;

import java.util.Scanner;


public class Maxelemnt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int [4];
		System.out.println("enter the array elemnts");
		for(int i=0;i<4;i++) {
			arr[i]=sc.nextInt();
			}int max=arr[0];
		for (int i=1;i<arr.length;i++)
		{
		
		if(arr[i]>max) {
			max=arr[i];
			
		}
		
		}
		System.out.println("largest is"+max);}
	}


