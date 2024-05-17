package com.training.operators;

public class UnaryOperators {
	
	public static void main(String[]args) {
		
		//Unary operators are used on a single number there are 5 unary operators
		
		//+,- to determine sign of number
		//++, -- to increment or decrement value by 1 (x = x + 1)
		//! for booleans to reverse statement of value (false = !true) ! = not
		
		//x++ and ++x are called respectively post increment and pre increment
		int x = 5;
		double y = 10 * x--;
		System.out.println(x + " " + y); //result x = 4 y = 50
		
		x = 5;
		y = 10 * --x;
		System.out.println(x + " " + y); //result x = 4 y = 40
		
		
	}

}
