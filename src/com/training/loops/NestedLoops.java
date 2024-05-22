package com.training.loops;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2 }, { 3, 4 }, { 5, 6, 7} };
		
		for (int i = 0; i<matrix.length; i++) {//A matrix is just an array of arrays
			//the bigger loop iterates through each array
			//the smaller loop iterates each element of the array
			for (int j = 0; j< matrix[i].length; j++) {
				System.out.println(matrix[i][j]);
			}
		}
		System.out.println("**************");
		//WAIT A SECOND -> We can use the for each loop because we have a collection?!
		for (int[] innerArray : matrix) {
			for (int num : innerArray) {
				System.out.println(num);
			}
		}

	}

}
