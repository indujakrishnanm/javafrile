package string;

import javax.sound.midi.SysexMessage;

import com.induja.corejava.Constructor.returnob.MainReturnobj3;

//replace()
//append()
//delete()
//charAt()
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder a= new StringBuilder ( "hlw this is me string builderclass");
		a.replace(2, 7,"hiii");
		System.out.println(a);
		System.out.println(a.append(  "   hiii physicst"));
		System.out.println(a.delete(1,8));
		System.out.println(a.charAt(0));
		a.insert(9, "induja_m");
		
	}
	

}
