package com.induja.corejava.Constructor;

public class InstanceConstructor
{
	float tot;
	
	InstanceConstructor(int purchaseamt){
		tot=purchaseamt;
		System.out.println("your total purchase is"+tot);
	}
	public void discount() {
		if(tot>5000) {
			System.out.println("u received 20%of discount");
			
			tot=(20/100f)*tot;
			System.out.println("amount to be paid is"+tot);	
			}
		else {
			System.out.println(" since your total bal"+tot+" is les than 5000,discount  not  applicable");
		}
	}
	public static void main(String args[]) {
		InstanceConstructor obj=new InstanceConstructor(6700);
		obj.discount();
		
		
	}

}
