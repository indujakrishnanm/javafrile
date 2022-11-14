package obsqura;
import java.util.Scanner;
public class TwoConstructor {
	
	int rev;
	static int a;
	TwoConstructor (int n){
		rev=0;
		int rem;
		while(n>0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}}
		TwoConstructor(){
			this(a);
			System.out.println("reverse of a number is"+rev);
		}

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to find reverse");
		 a=sc.nextInt();
		TwoConstructor 	twoConstructor=new TwoConstructor();
		
	}

}
