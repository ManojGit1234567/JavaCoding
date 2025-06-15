package org.advance;

public class Ex06_WrapperClass_UnBoxing {

	public static void main(String[] args) {
		Integer i=10;
		Float f=10.4f;
		//converting wrapper classes into primitive datatype is called unboxing
		float g=f;  //implicit unboxing
		int k=i.intValue();
		System.out.println(g);
		System.out.println(k);

	}

}
