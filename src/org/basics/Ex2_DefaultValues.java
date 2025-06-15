package org.basics;

public class Ex2_DefaultValues {
 static int a;
 static double d;
//char c; do not have default char value in global
static  float m;
 
 
	public static void main(String[] args) {
	int j;
	double k;
	char c;
	float f;
	System.out.println(a);
	System.out.println(d);
	//System.out.println(this.c);
	System.out.println(m);
	//System.out.println(j);   default global value is zero. but we do not have default local values
	

	}

}
