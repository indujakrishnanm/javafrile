package com.exceptionnewIn;

public class WithoutTryCatch {
void display() {
	int a=10;
	int b=0;
	int c=a/b;
	System.out.println("It's me after eXception will i be displayed if execption is occured");
}
	public static void main(String[] args) {
		WithoutTryCatch withouttrycatch=new WithoutTryCatch();
		withouttrycatch.display();
		

	}

}
