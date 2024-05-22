package com.training.loops;

public class FoorLoop {

	public static void main(String[] args) {
		//3 optional arguments* spaced by semicolon ";" -> variable declaration; condition; increment
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		System.out.println("****************");
		for (int i = 1; i <= 27; i = i * 3) {
			System.out.println(i); //powers of 3 until 27
		}
		System.out.println("****************");
		for (int x = 1, y = 10; x < 3 || y > 5; x++, y--) {
			System.out.println(x + " - " + y);
		}
		System.out.println("****************");
		for (int x = 1, y = 10; x < 3 && y > 5; x++, y--) {
			System.out.println(x + " - " + y);
		}
		
		for (;;) { System.out.println("hello"); break;} //valid but infinite loop (brake to exit)
		System.out.println("****************");
		int i;
		for ( i = 2; i < 8; i *= 2) { 
			i++;			
			//variable declaration happens only once
			//condition is checked and afterwards enters the loop block
			//afterwards the increment gets executed
			//ORDER OF EXECUTION: condition, loop block, increment
		}
		System.out.println(i);
		
	}

}
