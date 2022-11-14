package obsqura;
import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the pin");
		int pin=sc.nextInt();
		Bank bank=new Bank();
		bank.setpin(pin);
			bank.validate();
		}
		
	}

