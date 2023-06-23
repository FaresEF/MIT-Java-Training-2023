package com.mit.training.controlStatements;

public class Shark extends SeaAnimal {

	@Override
	public void weight() {
		System.out.println("My weight is 3 tonnes");

	}

	@Override
	public void height() {
		System.out.println("My height is 8m");
	}

	public static void main(String[] args) {
		Shark s1 = new Shark();
		s1.move();
		s1.weight();
		s1.height();
	}

}
