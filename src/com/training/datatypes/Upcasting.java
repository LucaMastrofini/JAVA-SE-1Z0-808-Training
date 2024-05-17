package com.training.datatypes;

public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte -> short -> int -> long -> float -> double
		long longNumber = 10L;
		float floatNumber = 2.5F;
		float result = longNumber * floatNumber;
		
		//int intNumber = longNumber; Compiling error java doesn't convert types automatically
		int intNumber = (int)longNumber;
	}

}
