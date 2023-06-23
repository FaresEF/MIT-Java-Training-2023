package com.mit.training.controlStatements;

public class AllowedGames {
	
    static int age=10;
	
	public static void main(String args[]) { 
	
	
	if(age>18) {
		System.out.println("R rated games!!");
	}
	
	else if(age<16) {
		System.out.println("M rated games!!");
	}
	
	else if(age<10) {
		System.out.println("You Cannot plauy video games!!");
	}
}
}

