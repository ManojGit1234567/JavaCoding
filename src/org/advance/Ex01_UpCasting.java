package org.advance;

public class Ex01_UpCasting extends A
{
	//converting child class property into superclass

	public static void main(String[] args) {
		System.out.println("start");
       Ex01_UpCasting e1=new Ex01_UpCasting();
      // Ex01_UpCasting e2=new A();
	}

}
class A extends B
{
	public static void AB() {
		System.out.println("Hello");
		A obj=new Ex01_UpCasting();
		obj.as();
	//	A ob2=new DownCast();
	}
	public void as() {
		System.out.println("as");
	}
	//A obj=new Ex01_UpCasting();
	
}
class B extends DownCast{
	public static void AB() {
		System.out.println("Bye");
		B b1=new Ex01_UpCasting();
		B b2=new A();
	
		b1.AB();
		b1.sn();
		//b1.
	//	B obj3=new DownCast();
		
		
	}
	public void sn() {
		System.out.println("sn");
	}
	
}
class DownCast{
	DownCast a=new A();
	
}
