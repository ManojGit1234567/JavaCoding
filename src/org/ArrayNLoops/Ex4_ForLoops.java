package org.ArrayNLoops;

public class Ex4_ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=10; i++) {
			//String t=" ";
			System.out.print(i+" ");
		}
		System.out.println();
		new Ex4_ForLoops().ABC();
		new Ex4_ForLoops().ABCD();
		new Ex4_ForLoops().ABCDE();

	}
	void ABC() {
		for (int i=1; i<=5; i++) {
			for (int j=i; j<=5; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	void ABCD() {
		for (int i=5; i>=1; i--) {
			for (int j=i; j>=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	void ABCDE() {
		for (int i=5; i>=1; i--) {
			for(int space=i; space<5; space++) {
				System.out.print("  ");
			}
			for (int j=i; j>=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
