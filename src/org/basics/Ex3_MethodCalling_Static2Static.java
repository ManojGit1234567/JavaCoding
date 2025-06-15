package org.basics;

public class Ex3_MethodCalling_Static2Static {
	//Ex3_MethodCalling_Static2Static obj=new Ex3_MethodCalling_Static2Static();
	public static void main(String[] args) {
		System.out.println("Programme starts");
		Ex3_MethodCalling_Static2Static.A();
		System.out.println("Programme Ends");

	}
	private static void A() {
		System.out.println("A");
		System.out.println(Ex3_MethodCalling_Static2Static.B());
	}
	public static int B() {
		//System.out.println("B");
		Ex3_MethodCalling_Static2Static.C();
		return (char) 'B';
	}
	public static void C() {
		System.out.println("C");
	}

}
