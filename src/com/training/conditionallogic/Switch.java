package com.training.conditionallogic;

import java.time.Month;

public class Switch {

	public static void main(String[] args) {
		
		Month month = Month.DECEMBER;
		switch (month) { //no duplicate values are allowed
		case DECEMBER:
		case JANUARY:
			System.out.println("Winter"); //can group multiple cases for same output
			 //brake is necessary to exit the code or the rest will run (and won't check for any matches);
		case MARCH:
			System.out.println("Spring");
			break;
		case AUGUST:
			System.out.println("Summer");
			break;
		default:
			System.out.println("ops");//if no case matches 
		}
		

	}
	
//	public static String String (String arg, final String finalArg) {
//		String localVar = "a";
//		switch (arg) { //the argument can be anything but the cases must follow some rules
//		case localVar: //not valid localVar is not final
//			return localVar;
//		case finalArg: //not valid finalArg can be null 
//			return finalArg;
//		case 5: //not valid int type while this switch case expects only Strings
//			return "5";
//		default:
//			return "ops";
//		}
//	}

}
