package org.ArrayNLoops;

public class Ex011_ReverseString {

	public static void main(String[] args) {
		String a="Manoj Pandit";
	char[]c=a.toCharArray();
	for(int i=c.length-1; i>=0; i--) {
		System.out.print(c[i]);
	}
	System.out.println();
	
	String b="Rahul MAhajan";
	StringBuffer bb=new StringBuffer(b);
	StringBuffer ss=bb.reverse();
	System.out.println(ss);

	}

}
