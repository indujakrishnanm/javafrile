package com.exceptionnewIn;

public class ThrowAndTryCatch {
	void age(int age)throws Its_Me_Exception {
		
		if(age>=18) {
			System.out.println("Hiii!! ur Driving License is approved");
			
		}
		else {
			throw new Its_Me_Exception("Sorry!! guys u r under 18 plz wait for "+(18-age)+" more   too");
		}
		
	}

	public static void main(String[] args)
	{
		ThrowAndTryCatch throwAndTryCatch=new ThrowAndTryCatch();
		try{throwAndTryCatch.age(2);


	}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

}}
