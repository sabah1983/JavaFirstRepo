package com.syntax.class09;

public class ArryIntro {

	public static void main(String[] args) {
		
        int num=10;
        int num1;
        num1=10;
        
        // declare an array and initialize it and store values
        
        int[] array=new int[4];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        
        // access elements from an array
        System.out.println(array[1]);
        
        // 2 way
        
        String [] carArray; //Preferred way
        String carArray1[];
        
        carArray=new String[3];
        
        
        carArray[0]="BMW";
        carArray[1]="Honda";
        carArray[2]="Dodge";
        // I am driving Dodge
        System.out.println("I am driving "+carArray[2]);
        
        //////////////////
        int[] numbers=new int[3];
        numbers[0]=100;
        numbers[1]=200;
        numbers[2]=300;
        // change value of numbers[1]
        
        numbers[1]=2000;
        System.out.println(numbers[1]+numbers[0]); //2100
 	}

}
