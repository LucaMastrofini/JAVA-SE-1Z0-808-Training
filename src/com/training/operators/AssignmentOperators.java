package com.training.operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		//Using compound assignment  java will do undercasting automatically so y = y + x is not the same as y+= x
		long x = 2;
		int y = 3;
		//y = y+x;
		y += x;
		System.out.println(y);
	}

}
