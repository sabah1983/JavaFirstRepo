package com.syntax.class19;

public class USA {
	
	String state, stateCapital;
	
	public USA(String state, String stateCapital) {
		this.state=state;
		this.stateCapital=stateCapital;
	}
	
	public void displayState() {
		
		System.out.println(state);
	}
	
	public void displayStateCapital() {
		
		System.out.println(stateCapital);
	}
	
	//can i call a method inside another method?-->Yes
	
	public void displayInfo() {
		//this.displayState();
		displayState();//by default compiler add this keyword to a method
		displayStateCapital();
	}
	
	public static void main(String[] args) {
		
		USA state1=new USA("Texas","Austin");
		state1.displayInfo();
	}

}