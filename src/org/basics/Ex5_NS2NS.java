package org.basics;

public class Ex5_NS2NS {
	static Ex5_NS2NS obj=new Ex5_NS2NS();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
obj.A();
	}
	public void A() {
		System.out.println("A");
		B();
	}
	public void B() {
		System.out.println("B");
		System.out.println(C());
	}
	public int C() {
	return (char) 'C';	
	}

}
