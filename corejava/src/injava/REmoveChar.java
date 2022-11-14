package injava;



public class REmoveChar {

	public static void main(String[] args) {
	String s="icecream";
	//char[] a=s.toCharArray()

	for(int i=0;i<s.length();i++) {
	//	System.out.print(s.length());
		String k=s.replace(s.charAt(0)+"","");
	//System.out.println(	k);
		
	System.out.println(k.replace(s.charAt(7) +"", ""));


	}
	
		
	}

	}
