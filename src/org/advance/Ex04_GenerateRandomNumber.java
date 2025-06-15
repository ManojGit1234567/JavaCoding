package org.advance;

import java.util.Random;

public class Ex04_GenerateRandomNumber {

	public static void main(String[] args) {
		// way1
		System.out.println(Math.random());
		
		//way2
		Random n=new Random();
		System.out.println(n.nextInt(100));
		System.out.println(n.nextInt(10, 19));
		System.out.println(n.nextBoolean());
		System.out.println(n.nextDouble(50.4));
		int d=n.nextInt(10, 30);
		System.out.println(d);
		
		//same way we can generate alphabet
		//System.out.println(n.nextInt((char)65, (char)80));
		char c=(char)(n.nextInt(67, 80));
		System.out.println("c= "+c);
		//String s=String.valueOf(n.nextInt(65, 85));
		//System.out.println(s);
		//char ab[]=new char[5];
		char abc;
		String bc="remove";
		
		for(int i=1; i<=5; i++) {
			//char a=(char)n.nextInt(65, 84);
			//ab[i]=a;
			abc=(char)n.nextInt(65, 84);
			bc=bc.concat(String.valueOf(abc));
			}
		System.out.println(bc);
		bc=bc.replaceAll("remove", "");
		System.out.println(bc);
		

	}

}
