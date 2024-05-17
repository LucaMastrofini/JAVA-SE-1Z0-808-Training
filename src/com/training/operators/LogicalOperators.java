package com.training.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		//OR = | AND = & this are called inclusive logical operators and both sides of the condition are evaluated
		int x = 5;
		boolean y = x > 3 | x-- < 2; // this checks if x is grater then 2 or less then 4
		//the first clause is true so therefore y has to be true but this is inclusive so it checks also the next statement
		//x then should be decremented and x = 5
		System.out.println(x + " " + y);
		
		//meanwhile if we use the close circuit the second part of the statement is not necessary evaluated
		//with OR if the first is true then the result has to be true, with AND if the first is false then it has to be false
		x = 5;
		y = x > 3 || x-- < 2;
		System.out.println(x + " " + y); //With close circuit we can view that x-- is not being executed. 
		
		//XOR = ^ this means that is one ore the other and not both false false or true true give false.
		
	}

}
