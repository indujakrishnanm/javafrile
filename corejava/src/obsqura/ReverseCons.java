package obsqura;
import java.util.Scanner;
public class ReverseCons {
	int n;
	ReverseCons(int n){
		this();
		this.n=n;
		int rem;
		int rev=0;
		while(n>0) {
			rem=n%10;
			rev=(rev*10)*rem;
			n=n/10;
			
		}
		System.out.println("the reverse of number is"+rev);}
		ReverseCons(){	
			System.out.println("finding reverse");
		}
		

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to find reverse");
		int n=sc.nextInt();
		ReverseCons reverseCons=new ReverseCons();

	}

}
