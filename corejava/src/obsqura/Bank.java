package obsqura;

import java.util.Scanner;

public class Bank {
Scanner sc=new Scanner(System.in);
private int pin1=1001;
private int pin2=1234;
private int pin3=1212;
private int pin;
void setpin(int pin) {
	this.pin=pin;	
}
	void validate() {
		if((pin== pin1)||( pin==pin2)||(pin==pin3)) {
			System.out.print("withdrawal is possible");
		}
		else {
			System.out.println("incorrect pin ");
		}
	}
 
	 
}

