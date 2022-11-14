package com.aggregation;

public class Aggregation1 {
	String city;
	String state;
	String college;
	Aggregation1(String city,String state,String college){
		this.college=college;
		this.state=state;
		this.city=city;
		
	}
public String toString() {
	
	return("City ="+city+" state ="+state+"college Name ="+college);
}

}
