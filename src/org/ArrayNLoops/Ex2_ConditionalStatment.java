package org.ArrayNLoops;

public class Ex2_ConditionalStatment {

	public static void main(String[] args) {
		int a=10;
		if (a<=20) {
			System.out.println("Not Correct");
		} else if(a<=30) {
			System.out.println("Again Not correct");
		}
		else if(a<=100) {
			System.out.println("Correct");
		}else {
			System.out.println("Inavlid");
			
		}
		
		if(a>10) {
			if(a>20) {
				if(a>50) {
					if(a>101) {
							}
					else {
						System.out.println("Not greater than 100");
					} 
				}else {
						System.out.println("greater than 50");
					}
				
				} else {
					System.out.println("Grater than 20");
				}
			} else {
				System.out.println("Greater than 10");
			}
		}

	}


