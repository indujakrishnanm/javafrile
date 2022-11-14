package com.exceptionnewIn;

public class TryCatch {

	void display() {
		int a=10;
		int b=0;
		try {
			int c=a/b;
			
		}
		catch(Exception e) {
			System.out.println("Im caught!!!");
			e.printStackTrace();// throws exception in red else only shows the msg
		}
		System.out.println("It's me after eXception will i be displayed if execption is occured");
		
	}
	public static void main(String[] args) {
		
		
		TryCatch tryCatch=new TryCatch();
		tryCatch.display();
	}

}
