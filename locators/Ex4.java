package org.locators;

public class Ex4 {

	public static void main(String[] args) {
		String dummyprice="0 ";
		String price1="$44.44  $43.56 $34.45";
		price1=dummyprice.concat(price1);
		String arr[]=price1.split("//$");
		for(String output: arr) {
			output.trim();
			System.out.println(output);
			
		}

	}

}
