package com.training.datatypes;

public class WrapperDemo {
	
	//Wrapper classes encapsulate the primitive data types and are:
	//Byte, Short, Integer, Boolean, Long, Character, Float, Double
	//Why use Wrapper classes instead of primitive DTs?
	//Method access
	//Null value
	//If Object is required
	//Act as class so each time a new Wrapper Class is instantiated we create an entry in the heap and a reference to the stack.
	
	 
	
	public static void main(String[] args) {
		
		Integer a = new Integer(10);
		Integer b = 10;
		
		System.out.println(a.MIN_VALUE);
		System.out.println(a.MAX_VALUE);
		
		int a1 = 10;
		int b1 = 10;
		
		//int primitive DT returns true
		System.out.println(a1 == b1);
		
		//Wrapper class returns false as the reference to the stack is different (even if the value they contain is the same)
		System.out.println(a == b);
		
		//We can use the method intValue() to check the value of the wrapper class
		System.out.println(a.intValue() == b.intValue());
		// TODO Auto-generated method stub

	}

}
