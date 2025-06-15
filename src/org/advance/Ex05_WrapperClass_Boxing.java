package org.advance;

public class Ex05_WrapperClass_Boxing {

	public static void main(String[] args) {
		int a=10,b=20,c=30,d=40;
		float e=10.2f;
		
		//converting primitive datatype into Wrapper classes is called boxing
		Integer f=new Integer(a);
		System.out.println(f);
		Integer g=b;
		System.out.println(b);
		Integer h=Integer.valueOf(d);
		System.out.println(h);
		String s=String.valueOf(e);
		System.out.println(s);
		s="34";
		System.out.println(s);

	}

}
