package com.training.arrays;

public class AccessingElemets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = new String[4];
		
		names[1] = "John";
		
		System.out.println(names[1]); //John
		System.out.println(names[2]); //null
		System.out.println(names[5]); //Throws Out of bond exception
		
	}

}
