package org.advance;

public class Ex07_StringTointeger_intToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//convert following string in int or float
		//String s="My name is Manoj";   NumberFormattingException
		String s="500";
		
		int i=Integer.valueOf(s).intValue(); //1 way
		int k=Integer.parseInt(s); //2nd way
		System.out.println(i);
		System.out.println(k);
		
		//convert following number into string
		int m=120;
		String n=String.valueOf(m);
		System.out.println(n);

	}

}
