package org.advance;

public class Ex08_RenameToString {

	public static void main(String[] args) {
	
		Ex08_RenameToString obj=new Ex08_RenameToString();
		System.out.println(obj.test1());
		System.out.println(obj);
		System.out.println(obj.toString());

	}
	public String toString() {
		System.out.println("Hello");
		return null;
		
	}
	public int test1() {
		System.out.println("test1");
		return 1;
	}

}
