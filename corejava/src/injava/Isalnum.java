package injava;

public class Isalnum {
	public static void main(String[] args) {
		String s="75#41*";
		String out=s.replaceAll("[^0-9]",   "");
		System.out.println(out);
		
		
	}

}
