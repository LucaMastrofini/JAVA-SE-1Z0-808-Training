package com.training.arrays;

import java.util.Arrays;

public class UtilityArraysMehtods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {1,2,3,4,5};
		
		int [] numbers2 = Arrays.copyOf(numbers, 6); //(array to copy, length of new array) 
		//Truncates values or adds 0s at the end of array to copy.
		System.out.println(Arrays.toString(numbers2));
		
		int [] numbers3 = Arrays.copyOfRange(numbers, 1, 8);
		
		System.out.println(Arrays.toString(numbers3)); //If right range exceeds elements of array if will fill with 0.
		
		Arrays.sort(numbers3);
		
		System.out.println(Arrays.toString(numbers3));
		
		
	}

}
