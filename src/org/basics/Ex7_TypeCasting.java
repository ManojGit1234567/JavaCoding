package org.basics;

public class Ex7_TypeCasting {

	public static void main(String[] args) {
		System.out.println("Programme starts");

	}
	public void NArrowing() {
		//narrowing means converting large datatype into small one
		int a=10;
		double d= 23.4;
		float f=43.5f;
	long b=1;
		
		int e=(int) d; //explicit narrowing typecasting
		//int k=b;
		double m=f; //implicit narrowing
		}
	public void Widening() {
		//widening means converting small datatype into large one
		int a=10;
		double d= 23.4;
		float f=43.5f;
	long b=1;
	
	long l=a;
	double k=f;
	
	}

}
