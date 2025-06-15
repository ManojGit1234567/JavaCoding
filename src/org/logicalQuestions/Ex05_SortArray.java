package org.logicalQuestions;

import java.util.Scanner;

public class Ex05_SortArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp=0;
		System.out.println("Provide size of array");
		int sizeOfArray=sc.nextInt();
		int ar[]=new int[sizeOfArray];
		//System.out.println("Provide data in Array");
		for(int i=0; i<sizeOfArray; i++) {
			System.out.println("Provide data");
			ar[i]=sc.nextInt();
		}
		for(int i=0; i<ar.length; i++) {
			for (int j=i+1; j<ar.length; j++) {
				if(ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
				}
			}
		}
		for(int i=0; i<ar.length; i++) {
		System.out.println(ar[i]);
		}

	}

}
