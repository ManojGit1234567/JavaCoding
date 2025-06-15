package org.ArrayNLoops;

public class Ex5_whileLoops {

	public static void main(String[] args) {
		int i=5;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		new Ex5_whileLoops().ABS();

	}
	void ABS() {
		int j=2;
		for (int i=0; i<3; i++) {
			while(i==j) {
				System.out.println("Correct");
				break;
			}
		}
	}

}
