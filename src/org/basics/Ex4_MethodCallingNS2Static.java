package org.basics;

public class Ex4_MethodCallingNS2Static {
	static Ex4_MethodCallingNS2Static obj;
	
	public static void main(String[] args) {
		System.out.println("Programme Starts");
		obj=new Ex4_MethodCallingNS2Static();
		obj.B();
		System.out.println("Programme Ends");

	}
	public static void A() {
		System.out.println("Static A");
		
	}
	public void B() {
		System.out.println("NS B");
		Ex4_MethodCallingNS2Static.A();
		C();
	}
	public void C() {
		System.out.println("NS C");
		Ex4_MethodCallingNS2Static.D();
	}
	public static void D() {
		System.out.println("Static D");
	}
	

}
