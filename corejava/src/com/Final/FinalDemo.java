package com.Final;
 final class FinalDemo {// final class
	 final int a=20;// final variable
	   final void main() {//final method
		 System.out.println("this is me final method");
	 }
	 public static void main(String[] args) {
		 FinalDemo finalDemo =new FinalDemo();
		 System.out.println( finalDemo.a);
		 finalDemo.main();
	}

}
/*class FinalDemo2 extends FinalDemo{
	int a=29;
	//void main() {
	//	System.out.println("a");
//}
	public static void main(String[] args) {
		 FinalDemo finalDemo =new FinalDemo();
		 System.out.println( finalDemo.a);
		 finalDemo.main();
	FinalDemo2 finalDemo2 =new FinalDemo2();
	finalDemo2.main(); 
		System.out.println( finalDemo2.a);
		
	}
 //final method,variable,class can't be inherited'
}*/