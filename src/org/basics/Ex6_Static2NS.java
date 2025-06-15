package org.basics;

public class Ex6_Static2NS {
static Ex6_Static2NS obj=new Ex6_Static2NS();
	public static void main(String[] args) {
		
		obj.A();
		obj.B();
		obj.C();
		System.out.println(obj.C());

	}
	public void A() {
		System.out.println("A");
		
	}
	public void B() {
		System.out.println("B");
		
	}
	public int C() {
	return (char) 'C';	
	}


}
