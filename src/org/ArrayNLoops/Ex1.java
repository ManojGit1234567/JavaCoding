package org.ArrayNLoops;

public class Ex1 {
  public static void main(String[] args) {
	  //declare and define   1D Array
	int a[]=new int[2];
	a[0]=2; a[1]=3; //a[2]=4; //a[3]=5;
	for (int i=0; i<a.length; i++) {
		System.out.println("a["+i+"]="+a[i]);
	}
	
	//define  1 D Array
	int b[]= {11,22,33,44,55};
	for (int i=0; i<b.length; i++) {
		System.out.println("b["+i+"]="+b[i]);
	}
	
	// define 2D Array
	int c[][]={{11,22},{33,44},{55,66}};
	for (int r=0; r<c.length; r++) {
		for(int d=0; d<2; d++) {
			System.out.println("c["+r+"]["+d+"]="+c[r][d]);
		}
	}
	
	//declare and define 2D Array
	String s[][]=new String[3][2];
	s[0][0]="10"; s[0][1]="20"; //s[0][2]="30";
	s[1][0]="40"; s[1][1]="50"; //s[1][2]="60";
	s[2][0]="70"; s[2][1]="80"; //s[2][2]="90";
	for(int r=0; r<s.length; r++) {
		for (int d=0; d<2; d++) {
			System.out.println("s["+r+"]["+d+"]="+s[r][d]);
		}
	}
}
}
