package org.oops;

public class Ex4_Inheritence extends ABC {

	public static void main(String[] args) {
		System.out.println("Ex4_Inheritence class");
		Ex4_Inheritence obj=new Ex4_Inheritence();
		obj.A();
		obj.B();
		obj.C();
	}

}
class ABC extends XYZ{

	public void A() {
		System.out.println("ABC class");

	}
}
class XYZ extends PQR{
	public void B (){
		System.out.println("XYZ class");
	}
}
class PQR{
	public void C(){
		System.out.println("PQR class");
	}
}
