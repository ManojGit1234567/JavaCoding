package org.logicalQuestions;

import java.util.Scanner;

public class Ex01_ReverseNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Pls provide number");
	int a=sc.nextInt();
	int rem=0;
	int sum=0;
	int temp=a;
	while(temp>0) {
		
		rem=temp%10;
		sum=sum*10 +rem;
		temp=temp/10;
		
	}
	if(a==100) {
	System.out.println("00"+sum);

	}
	else if(a==10) {
		System.out.println("0"+sum);

		} else {
	System.out.println(sum);
		}
	}

}
