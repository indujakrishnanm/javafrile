package string;

public class StringclassChecking {

	public static void main(String[] args) {
	String s="hii";// using string literal
	String s1=new String("HLLLW1");// by new keyword
    String k =s1.concat(s);
    String h="hle";
    String h1="Hle";
    String i="induja";
    String i1="induja ";
    
    StringBuilder d=new StringBuilder("hlw");
    StringBuffer d1=new StringBuffer("hlw");
    
//literals************
		System.out.println("String using literal "+s);
		System.out.println("String using new keyword is "+s1);	
//concat()method******
		System.out.println("String using concat() is "+k);
//equals method********
		System.out.println("String using equals() is "+h1.equals(h));
		System.out.println("String using equals() is "+h1.equalsIgnoreCase(h));
//length()*************
		System.out.println("String using length() is "+h1.length());
//compare()*************
		System.out.println("String using compare() is "+h1.compareTo(h));// returns -ve bcz hi is greater

		System.out.println("String using compare() is "+i1.compareTo(i));// returns 0 bcz hoth are equal
		System.out.println("String using compare() is "+h.compareTo(h1));// returns +ve bcz h is greater
//Contains()*************
		System.out.println("String using contains() is "+i1.contains(s1));// returns  bcz hi is greater	
		System.out.println("String using contains() is "+s1.contains(i1));
		//System.out.println("String using contains() is "+s1.contains(i1));
		System.out.println(d1.reverse());
		System.out.println(d.replace(1,2, "Java"));
		d.append("hii induja");
		System.out.println(d);
		
		
	}

}
