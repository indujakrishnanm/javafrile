package obsqura;

import java.util.Scanner;

public class Hdfc implements Rbi{
		  float amt;
			double  intrest(float amt) {
				this.amt=amt;
				
				return amt*intres ;
			}
			@Override
			public String RecurringDeposit(int noyear,float amt1) {
			double b=this.intrest(amt1);
			double fd=b*noyear;
			return "the amount after "+noyear+" year will be :"+fd;
			}
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				Hdfc hdfc=new Hdfc();
				 System.out.println("enter the  deposit amt");
				float dep=sc.nextFloat();
				System.out.println("enter the no: of month");
				int year=sc.nextInt();
				System.out.println( hdfc.RecurringDeposit(year,dep));	 
			}}
			
