package obsqura;
import java.util.Scanner;

public class FulltimeEmployee extends Employee {

	@Override
	void calSal() {
		System.out.println("your salay is"+(100*8));
		
	}
	public static void main(String[] args) {
		 Contractor  contractor=new  Contractor();
		 FulltimeEmployee fulltimeEmployee=new FulltimeEmployee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your designation");
		System.out.println("a:Contractor");
		System.out.println("b:fulltym");
		String choice=sc.next();
		switch(choice){
		case "a":contractor.calSal();
		break;
		case"b":fulltimeEmployee.calSal();
			
		}
		}
		
	}
