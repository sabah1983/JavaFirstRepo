package com.sytax.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		// hello 5 times
		int num=11;
		while(num<=5) {
			System.out.println("Hello");
			num++;
		}
		System.out.println("----------Using DO WHILE LOOP");
		// hello 5 times
		int num1=11;
		do {
			
			System.out.println("Hello");
			num1++;
			
		} while (num1<=5);

	}

}
