package injava;

import java.util.Scanner;

public class GetOccurance {
	 static int getoc(String s,char c) {
		 String d=s.replace(c+"", "");
		 //	 System.out.println(d);
		return s.length()-d.length();
		 
	 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
String s=sc.next();
String pi="";

		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(pi.indexOf(c)!=-1)
				continue;
			int k=getoc(s,c);
			System.out.println(c + "= "+k);
		//	pi+=c;
		//	System.out.println(pi);
			
			
		}
	}

}
