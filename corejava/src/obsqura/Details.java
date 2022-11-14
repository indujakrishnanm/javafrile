package obsqura;

import java.util.Scanner;

public class Details {
	float bp,ded,bonus;
	
	Scanner sc=new Scanner(System.in);
	void salInput() {
		System.out.println("enter the basic pay");
		 bp=sc.nextInt();
		System.out.println("enter the dedu pay");
		 ded=sc.nextInt();
		System.out.println("enter the bonus pay");
		 bonus=sc.nextInt();
		
	}

}
