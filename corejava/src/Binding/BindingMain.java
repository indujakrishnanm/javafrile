package Binding;

public class BindingMain extends BindingClass2 {

	public static void main(String[] args) {
	//DoCheck(new BindingClass2());// early binding (static)//here A a=new B();so bis reference will be stored over a
	//DoCheck(new BindingClass3());
		BindingClass1 a1=new BindingClass1();
		//a1.bind();
		//a1.checkStatic();
		a1=new BindingClass2();
		a1.bind();
		a1.checkStatic();
		//System.out.println(BindingClass1.checkStatic());
		
	}}
/*static void DoCheck(BindingClass1 a1) {
	a1.bind();//latebinding
	a1.checkStatic();//early binding (static)
	
}
}
*/