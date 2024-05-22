package com.training.loops;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		for (i = 0; i < 10; i++) {
			
			
			
			if (i >= 4) {
				i = 10;
				continue; //Simply stops the loop from performing any other task after. It will bring the loop back to increment then evaluation
			}
						
		}
		System.out.println(i);
	}

}
