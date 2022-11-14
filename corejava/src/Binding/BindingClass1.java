package Binding;

public class BindingClass1 {
void bind() {
	System.out.println("myself  first binding,in A");
}
static void checkStatic() {
	System.out.println("myself  first binding,in A static");
}
}
class BindingClass2 extends BindingClass1{
	void bind() {
		System.out.println("myself  first binding,in B");
	}
	static void checkStatic() {
		System.out.println("myself  first binding,in B static");
	}
}
class BindingClass3 extends BindingClass2{
	void bind() {
		System.out.println("myself  first binding,in c");
	}
	static void checkStatic() {
		System.out.println("myself  first binding,in c static");
	}
}
