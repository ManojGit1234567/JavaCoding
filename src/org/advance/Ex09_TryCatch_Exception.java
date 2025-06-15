package org.advance;

import java.util.Scanner;

public class Ex09_TryCatch_Exception {

	public static void main(String[] args) {
		int a []= {11,22,33,44};
		try {
			for(int i=0; i<=4; i++) {
				System.out.print(a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("End of try catch  block");
		Ex09_TryCatch_Exception obj=new Ex09_TryCatch_Exception();
		obj.test1();
		obj.test2();
		obj.test3();
	}


	public void test1() {
		int a=100, b=300;
		try {
			int c=a/0;
			System.out.println(c);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("test1 mthd ends");
	}
	public void test2() {
		int a=100;
		try {
			int c=a/0;
		}
		catch(Exception e) {
			e.printStackTrace();	
		}finally {
			System.out.println("Finally block always execute if there is no exception before finally block");
			try {
				int h=100/0;
			}catch(Exception e) {
				e.printStackTrace();
			} System.out.println("Excuted try-catch from finally");
		}
		System.out.println("executed test2");
	}
	public void test3() {
		Scanner sc=new Scanner(System.in);
		System.out.println("test3 starts");
		try {
			System.out.println("adscf");
			int d=sc.nextInt();
			System.out.println("d= "+d);
		}finally {
			sc.close();
			//sc.reset();
		}
	}
}



