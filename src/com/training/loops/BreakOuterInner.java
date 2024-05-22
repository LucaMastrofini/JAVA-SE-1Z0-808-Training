package com.training.loops;

public class BreakOuterInner {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2 }, { 3, 4 }, { 5, 6, 7 } };

		OUTER : for (int i = 0; i < matrix.length; i++) {
			int k = i+1;
			System.out.println("Outer loop iteration: " + k);
			INNER : for (int j = 0; j < matrix[i].length; j++) {	
				if (matrix[i][j] == 3) {
					System.out.println(matrix[i][j]);
					break OUTER; //break usually exits from the enclosing loop: with OUTER and INNER key words we can specify which loop to exit
				}
			}
			
		}
	}
}
