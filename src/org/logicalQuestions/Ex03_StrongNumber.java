package org.logicalQuestions;

import java.util.Scanner;

public class Ex03_StrongNumber {
     public static int func(int val) {
    	 int f=1;
    	 for(int i=1; i<=val; i++) {
    		 f=f*i; //1 2 6 24 120
    		 
    	 }
    	 return f;
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int n=a;
		int rem=0;
		int sum=0;
		int output = 0;
		while(n>0) {
			rem=n%10;
			sum=Ex03_StrongNumber.func(rem);
			n=n/10;
			output=sum+output;
		}
		if(output==a) {
			System.out.println("Strong Number");
		}else {
			System.out.println("Not Strong Number");
		}
		
		}

}
