package org.logicalQuestions;

import java.util.Random;

public class Ex07_GenerateRandString_Reverse {

	public static void main(String[] args) {
		Random r=new Random();
		char[]c=new char[5];
		for(int i=0; i<5; i++) {
			c[i]=(char)r.nextInt(65, 86);
		}
		//int a=r.nextInt(65, 86);
		//char c=(char)a;
		System.out.println(c);
		for(int i=4; i>=0; i--) {
			if(i==4) {
				System.out.print("After Reverse= ");
			}
			System.out.print(c[i]);
		}
		System.out.println();
		String s=String.valueOf(c);
		StringBuffer b=new StringBuffer(s);
		System.out.println("After Reverse by buffer= "+b.reverse());

	}

}
