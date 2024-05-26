package com.training.arrays;

public class ArraysBasics {
	
	//Array is a container that can hold multiple values
	
	//The elements of the array are addressed by index
	
	//The length of an array is fixed when created
	
	//The elements of the array are of the same type

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] number = new int[4]; //array of 4 int
		
		int number2[]; //syntax used in c++ which java kept.
		
		String  [] names = new String[4];
		
		//Primitives DTs get the proper default value
		//Objects are null
		
		int [] numbers3 = {1,3,4,5,10};
		int [] numbers4 = new int[]{1,2,45,3,2};
		
		int [] empty = new int [0];
		int [] empty2 = {};
		
		int [] bigArray = new int[Integer.MAX_VALUE]; //too big 
		
		
	}

}
