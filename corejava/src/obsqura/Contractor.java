package obsqura;

import java.util.Scanner;

public class Contractor extends Employee {
Scanner sc=new Scanner(System.in);
	@Override
	void calSal() {
	//	System.out.println("payment p/hr= 100");
		System.out.println("enter the no:of working hours");
		int n=sc.nextInt();
		float tot=n*100;
	System.out.println("your amount for "+n +"is "+tot);
		
		
	}

}
