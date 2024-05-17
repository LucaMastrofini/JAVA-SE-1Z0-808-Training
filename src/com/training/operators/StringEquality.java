package com.training.operators;

public class StringEquality {

	public static void main(String[] args) {
		
		//Every time we create a new string Java checks if it is present in the String Pool (heap) and creates a reference in the stack.  
		String a = "hi";
		String b = "hi";
		//String a and b will have the same address value in the stack pointing at the same memory address in the heap
		String c = new String("hi");
		//Because we instantiate c with the new keyword c will have a new address in the stack outside the String Pool
		System.out.println(a == b);
		System.out.println(a == c);
		String d = "HI".toLowerCase();//This is computed at runtime and will generate a new entry in the heap
		System.out.println(d == c); 
		
		//to view if the content of a string is equal to another we use equals method
		System.out.println(a.equals(c));
		System.out.println(b.equals(d));
		
		//CONCLUSION == compares the value of the address memory while equals compares the value of the String object.
	}

}
