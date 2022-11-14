package injava;

public class Alphanumeric {

/*	static boolean display(String a) {
		if(a.matches("[1-9] "+"") {
			System.out.println(a.matches("1-9"));
			return true;
			
		}
		else
		return false;
	}*/
	public static void main(String[] args) {
String a="75#41hlw *java= how *& u?";
//String pi="";
//for(int i=0;i<a.length();i++)
/*{
	if(a.al
	char c=a.charAt(i);

System.out.println(display(c));
}*/
String k=a.replaceAll("[^0-9]", "");//if ^ is not  given it will print except numbers
String k2=a.replaceAll("[^a-zA-z0-9]",    "");
String k3=a.replaceAll("[a-zA-z0-9]",    "");
System.out.println(k);
System.out.println(k2);
System.out.println(k3);

	}

}
