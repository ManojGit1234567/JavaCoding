package org.ArrayNLoops;

public class Ex7_SelectionShort {

	public static void main(String[] args) {
		int a[]= {15,-40,30,-66,28};
		System.out.println("Before sorting");
		System.out.println("{"+a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]+" "+"");
		for (int i=0; i<a.length; i++) {
	    	System.out.println(a[i]);
	    }
		
		int size=a.length;
		for (int i=0; i<size; i++) {
			for (int j=i+1; j<size; j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		//System.out.println(a[i]);
		System.out.println("After sorting");
    for (int i=0; i<size; i++) {
    	System.out.println(a[i]);
    }
	}

}
