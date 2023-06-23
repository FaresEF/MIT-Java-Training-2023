/**
 * 
 */
package com.mit.training.controlStatements;

/**
 * @author EFares
 *
 */
public class Lion extends DesertAnimals {

	@Override
	public void weight() {
		System.out.println("My weight is 2 tonnes");

	}

	@Override
	public void height() {
		System.out.println("My height is 2m");
	}

	public static void main(String[] args) {
		Lion l1 = new Lion();
		l1.move();
		l1.weight();
		l1.height();
	}

}
