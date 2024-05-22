package com.training.loops;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int daysLeft = 3;
		int dayCount = 1;
		while (daysLeft > 0) {
			System.out.println(dayCount);
			daysLeft--;
			dayCount++;
		}
		daysLeft = 3;
		
		 dayCount = 1;
		do {
			System.out.println(dayCount);
			daysLeft--;
			dayCount++;
		} while (daysLeft > 0);
	}

}
