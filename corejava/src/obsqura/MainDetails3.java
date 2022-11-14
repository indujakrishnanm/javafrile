package obsqura;
import java.util.Scanner;
public class MainDetails3 extends Details2 {
	void salarySlip() {
		double total=((bp+hra)-(pf-ded)+bonus);
		System.out.println("your basic pay is "+bp);
		System.out.println("your deduction amt "+ded);
		System.out.println("your bonus "+bonus);
		System.out.println("your hra "+hra);
		System.out.println("your pf "+pf);
		System.out.println("Total salary"+total);
		
	}
	public static void main(String[] args) {
		
		MainDetails3 mainDetails3=new MainDetails3();
		mainDetails3.salInput();
		mainDetails3.salCal();
		mainDetails3.salarySlip();
		
		
		
		
	}

}
