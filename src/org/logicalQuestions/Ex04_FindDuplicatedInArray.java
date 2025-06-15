package org.logicalQuestions;

public class Ex04_FindDuplicatedInArray {

	public static void main(String[] args) {
		int arr[]= {11,22,33,33,44,11};
		
		int l=arr.length;
		int brr[]=new int [l];
		for(int i=0; i<l; i++) {
			//int brr[]=new int[arr[i]];
			for(int j=i+1; j<l; j++) {
				if(arr[i]==arr[j]) {
					brr[i]=arr[i];
				
				}
			}
		}
		for(int i=0; i<brr.length; i++) {
			if(brr[i]>0) {
		System.out.println("Duplicates value in array= "+brr[i]);
			}
	}
	}
}
