package injava;

public class UpperToLower {

	public static void main(String[] args) {
		String a="JAVA";
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			//System.out.println(ch);
			int b=(int)ch;
			b= b+32;
			System.out.print((char)b);
			
		}

	}

}
