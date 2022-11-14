package injava;

public class RepaetedChar {

	public static void main(String[] args) {
		String a="java";
		int count=0;
		char b[]=a.toCharArray();
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]==b[j]) {	
			System.out.println("repeating "+b[j]  );
					break;
				}
				         
			}
			
			
		}

	}

}
