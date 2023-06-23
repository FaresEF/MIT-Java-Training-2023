package com.mit.training.oops;

public class Main {
	public static void main(String args[]) {
		AnimalSon ani=new AnimalSon();
		
		System.out.println("In the first zoo we have: ");
		ani.Animals("Lion","Snake");
		
		System.out.println("In the first zoo we have: ");
		ani.Animals("Dog","Cat","Rat");
		
		ani.setAge(1);
		System.out.println("The son of the dog has an age of: "+ani.age);
		
		ani.setType("PitBull");
		System.out.println("The son of the dog has a type of: "+ani.type);
		
		}
	
}
