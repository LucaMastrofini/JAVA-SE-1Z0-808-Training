package com.training.datatypes;

public class DeclaringVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber = 25;
		int secondNumber;
		
		System.out.println(firstNumber);
		//System.out.print(secondNumber); secondNumber has not been initialized (compilation error)
		
		//Initialize multiple variables of same type inline
		short day = 1, month, year = 2000;
		
		char letter = 'A';
		System.out.println(letter);
		
		boolean isTrue = true;
		System.out.println(isTrue);
		
		//int for -> for not valid name for a variable. like many other (while true if else...)
		//int 1s -> any word that starts with a number is not valid
		int s1 = 10;
		System.out.println(s1);
		
		//add suffix f to any float if omitted the value is considered a double 
		float myFloat = 1.1f;
		double myDouble = 1.1d;
		double myDouble2 = 1.1;
		System.out.println(myFloat);
		System.out.println(myDouble);
		System.out.println(myDouble2);
		
		//Naming Rules
		//Can only start with letter $ or _
		//Subsequent characters can also be numbers
		//Cannot use java keywords
		//Java is case sensitive
		int For = 10;  //for is not ok For is ok (don't capitalize variables, bad practice)
		
		
	}

}
