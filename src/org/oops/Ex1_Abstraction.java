package org.oops;

public class Ex1_Abstraction  extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1_Abstraction obj=new Ex1_Abstraction();
		obj.test1();
		obj.test2();
		System.out.println(obj.test3());
	}

	@Override
	void test2() {
		System.out.println("implemented test2");
		
	}

	@Override
	public int test3() {
		// TODO Auto-generated method stub
		System.out.println("implemented tet3");
		return 0;
	}
	/*Ex1_Abstraction(){
		super();
		System.out.println("hello");
		//super(10);
	}*/

}
abstract class A{
	public void test1() {
		System.out.println("test1");
	}
	abstract void test2(); 
	abstract public int test3();	
	A(){
		this(10);
		System.out.println("Abstract class constructor");
		//this(10);
	}
	A(int a){
		System.out.println("Abstract class para constructor");
	}
	 
}
