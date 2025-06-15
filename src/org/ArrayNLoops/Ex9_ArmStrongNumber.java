package org.ArrayNLoops;

import java.util.Scanner;

public class Ex9_ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Provide Number");
		int number=sc.nextInt();
		int num=number;
		//System.out.println("Provide number");
		
	int rem=0;
	int sum=0;
	while(num>0) {  //153 15 1
	rem=num%10;   //3 5 1
	sum= sum + rem*rem*rem; //27 125+27 125+27+1
	num=num/10; //15 1 0
	}
	if(sum==number) {
	System.out.println("it is an armstrong number");
	}else {
		System.out.println("Not an armstrong numbr");
	}
	}

}
