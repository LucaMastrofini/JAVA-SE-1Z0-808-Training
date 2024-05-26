package com.training.arrays;

import java.util.Arrays;

public class ArraysAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays are objects
		int [] numbers = {1,2,3,4,5};
		String [] names = {"mark" , "susan"};
		String cl1 = numbers.getClass().getName();
		String cl2 = names.getClass().getName();
		
		System.out.println(cl1); //[I
		System.out.println(cl2); //[Ljava.lang.String;
		
		//Arrays don't override the Object.equals method
		
		int [] numbers2 = {1,2,3,4,5};
		System.out.println(numbers.equals(numbers2)); 
		System.out.println(Arrays.equals(numbers, numbers2));
		
		System.out.println(numbers.hashCode() + " " + numbers2.hashCode());
		//use instead
		System.out.println(Arrays.hashCode(numbers)+ " " + Arrays.hashCode(numbers2));
	}

}
