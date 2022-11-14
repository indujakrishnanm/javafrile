package Greater;

public class greater{
	public static void main(String args[]) {
	int a=10;
	int b=23;
	int c=23;
	if((a==b)&&(b==c)&&(a==c))
	{
		System.out.println("entered values a,b,c are equal" +a +" "+b+" "+c);
	}
	else if((a==b)||(b==c)||(c==a))
	{
		if(a==b) {
			System.out.println("entered values a,b,c are equal" +a +" "+b);
		}
		if(b==c)
		{
			System.out.println("entered values b,c are equal" +b +" "+c);
		
		}
		if(a==c)
		{
			System.out.println("entered values a,b are equal " +a +" "+c);
		}
	}
if((a>b)&&(a>c))
		{
		System.out.println("entered values a is greater "+a);
		}
/*if (((a<b)&&(a<c))){
	System.out.println("entered values a is lesser "+a);
	
}*/
	if(b>c)
		 {System.out.println("entered values  b is grreater "+b);
		}
	if((c>a)&&(c>b))
	{System.out.println("entered values c is grreater "+c);
	}
		/*else {
			System.out.println("entered values b is lesser "+b);
		}*/}}
	
