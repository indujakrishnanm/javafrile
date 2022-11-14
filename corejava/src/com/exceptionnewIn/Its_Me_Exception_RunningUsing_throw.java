package com.exceptionnewIn;

public class Its_Me_Exception_RunningUsing_throw {
	void age(int age)throws Its_Me_Exception {
		
		if(age>=18) {
			System.out.println("Hiii!! ur Driving License is approved");
			
		}
		else {
			throw new Its_Me_Exception("Sorry!! guys u r under 18 plz wait for "+(18-age)+" more   too");
		}
		
	}

	public static void main(String[] args)throws Its_Me_Exception{ 
		Its_Me_Exception_RunningUsing_throw its_Me_Exception_Running=new Its_Me_Exception_RunningUsing_throw();
		its_Me_Exception_Running.age(2 );
		
		
		

	}

}
