package com.training.arrays;

public class IteratingOverArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number = {1,2,3,4,5,6};
		
		for (int i = 0; i < number.length; i++) {
			
			System.out.println("The value of the array is " + number[i]);
			
		}
		
		for (int i : number) {
			System.out.println("The value of the array is " + i);
		}
	}

}
