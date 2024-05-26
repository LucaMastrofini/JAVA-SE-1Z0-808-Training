package com.training.arrays;

public class ArraysAndMethods {

	public static void main(String[] args) {
		
		//Arrays are passed by reference in the method so 2 variables are created in the stack which point to the same 
		//memory address in the heap.
		int numbers [] = {1,3,5};
		
		change(numbers);
		
		for (int i : numbers) {
			System.out.println(i);
		}

	}
	
	public static void change(int [] array) {
		
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
		
	}

}
