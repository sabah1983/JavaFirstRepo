package com.syntax.class15;

public class Large {
	
	void isLarge(int a, int b) {
		if (a>b) {
			System.out.println(a+" is large");
		}else {
			System.out.println(b+" is large");
		}
	}
	public static void main(String[] args) {
		
		Large num=new Large();
		
		num.isLarge(30, 40);
	}
	

}
