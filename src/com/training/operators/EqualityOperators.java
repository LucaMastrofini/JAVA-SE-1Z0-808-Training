package com.training.operators;

public class EqualityOperators {

	public static void main(String[] args) {
		
		//== equal = is 
		boolean x = true;
		boolean y = x = false; //assigning x to false and then y = x
		System.out.println(y);
		y = x == false; //checking if x == false and if it is y = statement;
		System.out.println(y);
		
	}

}
