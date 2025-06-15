package org.oops;

public class Ex5_Interface extends C implements AA,B {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Programme starts");
		new Ex5_Interface().a();
		new Ex5_Interface().b();
		new Ex5_Interface().c();
		try {
		new Ex5_Interface().clone();
		}catch(Exception e) {
			System.out.println("not working");
			e.printStackTrace();
		}
		
	}

	
	public void b() {
		System.out.println("omplemented b");
		
	}

	@Override
	public void a() {
		System.out.println("implemented a");
		
	}

}
 interface AA{
	 public void a();
 }
 interface B{
	 public void b();
	 public static void cb() {
		 System.out.println("static method in interface");
	 }
	 //we cant hve any NS concrete method in interface as it contains onlu NS abstract meyhods
 }
 class C{
	public void c() {
		System.out.println("c");
	}
 }
