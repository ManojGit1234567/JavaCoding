package org.ArrayNLoops;

public class Ex8_ReverseData {

	public static void main(String[] args) {
	int a=1234;
	int sum=0, temp=a, rem=0;
	while(temp>0) {
		rem=temp%10; //4,3,2, 1
		sum=sum*10+rem; //4, 43, 432, 4321 
		temp=temp/10; //123,12, 1
	}
System.out.println(sum);
	}

}
