package com.training.loops;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for (type e : collection) {
		//statement
		//}
		String [] fruits = new String[2];
		fruits[0] = "apple";
		fruits[1] = "orange";
		for (String fruit : fruits) {//It iterates each object in the collection one by one assign to the variable defined in the loop 
			//the current object.
			System.out.println(fruit);
		}
		//The Object to iterate must be a collection (String is not)
		//The DT of the defined object must match the one defined in the loop statement. 
		//Wrapper classes can be associated to their respective primitive DTs
		
	}

}
