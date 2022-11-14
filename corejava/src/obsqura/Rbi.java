package obsqura;
public interface Rbi {
public abstract String  RecurringDeposit(int year,float amt );
public double intres = .05*100;
}
/*class Hdfc implements Rbi{
  float amt;
	double  intrest(float amt) {
		this.amt=amt;
		
		return amt*intres ;
	}
	@Override
	public String RecurringDeposit(int noyear,float amt1) {
	double b=this.intrest(amt1);
	double fd=(amt1*b)*noyear;
	return "the amount after "+noyear+"will be"+fd;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 Hdfc  hdfc=new  Hdfc();
		 System.out.println("enter the  deposit amt");
		float dep=sc.nextFloat();
		System.out.println("enter the no: of years");
		int year=sc.nextInt();
		 hdfc.RecurringDeposit(year,dep);	 
	}}*/
	