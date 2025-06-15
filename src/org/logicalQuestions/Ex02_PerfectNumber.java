package org.logicalQuestions;

import java.util.Scanner;

public class Ex02_PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Pls provide number");
		int a=sc.nextInt();
		
		int temp=a;
		int sum=0;
		int rem=0;
		
		for(int i=1; i<=a/2; i++ ) {
			rem=temp%i;
			if(rem==0) {
				sum=sum + i;
			}
		}
		if(sum==a) {
			System.out.println("perfect Number");
		} else {
			System.out.println("Not perfect Number");
		}
		}

}
