package singletonclass;
//its a process of creating a single instance for the class
public class SingleTonClass {
	private  static SingleTonClass i;//* 1:create a private static variable of classtype 

	private SingleTonClass() {//2:create aprivate constructor
		
	}
	public SingleTonClass getInstance() {// 3:create a a non static method of returntype  class
		if(i==null) {
			i=new SingleTonClass();
			
		}
		return i;
		
	}
	public static void main(String[] args) {
		SingleTonClass s1=new SingleTonClass();
		SingleTonClass s2=new SingleTonClass();
	System.out.println(	s1.getInstance());
	System.out.println(	s2.getInstance());
	}

}
