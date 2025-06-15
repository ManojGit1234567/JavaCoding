package org.ArrayNLoops;

import java.util.ArrayList;
import java.util.List;

public class Ex010_FindDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,13,14,12,14};
		int b[]=new int[5];
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					b[i]=a[i];
				}
			}
		}
		for(int i=0; i<b.length; i++) {
			if(b[i]!=0) {
				l.add(b[i]);
				//System.out.println(b[i]);	
			}else {
				
			}
		
		}
		for(Integer value: l) {
		System.out.println("Duplicate ARrray ="+ value );
		}
		System.out.println(l);

	}

}
