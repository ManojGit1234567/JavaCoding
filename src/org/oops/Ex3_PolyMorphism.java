package org.oops;

public class Ex3_PolyMorphism extends AB {

	public static void main(String[] args) {
		System.out.println("Programme starts");
		 Ex3_PolyMorphism obj=new  Ex3_PolyMorphism();
		 obj.A();
		 obj.A(10.4, 10);
		 obj.A(10, 20.4);
		 obj.A(1, 10);
		 
		 //unable to get private method from another class

	}
	public void A() {          
		System.out.println("A");   //method overriding
	}
	public void A(int a, int b) {
		System.out.println("A with 2 int para");
	}
	public void A(int a, int b, int c) {
		System.out.println("A with 3 int para");
	}
	public void A(int a, double b) {
		System.out.println("A with int and double para");
	}
	public void A(double b , int a) {
		System.out.println("A with double and int para");
	}
	//abstract void C(); error bcoz class is not abstract

}
class AB{
	public void A() {
		System.out.println("A");   //method overriding
	}
	private void secret() {
		System.out.println("secret");
	}
}
