package org.ArrayNLoops;

public class Ex3_SwitchCases {

	public static void main(String[] args) {
		String name="Manoj";
		switch(name.toLowerCase()) {
		case "Vijay": System.out.println("Not Right");
		break;
		case "Viraj": System.out.println("Not Correct");
		break;
		case "manoj" : System.out.println("Correct");
		break;
			default : System.out.println("Invalid");
			return; //exit from code
		}
	}

}
