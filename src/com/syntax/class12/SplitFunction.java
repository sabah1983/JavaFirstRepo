package com.syntax.class12;

public class SplitFunction {

	public static void main(String[] args) {
		
		System.out.println("---split() function---");
		
		String today="Today is my favorit Java class";
		String [] array=today.split("my");
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		String today1="Today is my favorite Java class";
		String [] stringArray=today1.split("a");
		// print all element from array 1 by 1
		// element type variableName:name of array
		for(String arr:stringArray) {
			System.out.print(arr);
		}
		System.out.println();
		// we want to print String word by word
		String today2="Today is my favorite Java class";
		String [] words=today.split(" ");
		
		for(int i=0; i<words.length; i++) {
			System.out.println(words[i]);
		}
		System.out.println();
		
		String today3="Today my favorite Java class";
		today3=today3.trim();
		System.out.println("String after trimming:"+today3);
		
		// today3=today3.split(); CE type miss match --> split will give you back 
		// array of string
	}

}
