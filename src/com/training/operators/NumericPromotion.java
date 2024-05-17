package com.training.operators;

public class NumericPromotion {

	public static void main(String[] args) {
		
		//Any small DTs (byte and short) are promoted to int with arithmetic operations
		//i.e.
		short x = 2;
		short y = 3;
		//WARNING not allowed short z = x * y;
		short z = (short) (x * y);
		//or 
		int z1 = x*y;
		System.out.println(z + " " + z1);
		
		//In case of two different types Java promotes to the larger DT.
		int a = 5;
		long b = 10;
		long c = a * b;
		//int c is not allowed
		

	}

}
