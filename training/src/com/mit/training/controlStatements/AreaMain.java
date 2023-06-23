package com.mit.training.controlStatements;

public class AreaMain {

	public static void main(String args[]) {
		Area ar1=new Area(3,4);
		Area ar2=new Area(3.14,6);
		
		System.out.println("The area of the square is: ");
		System.out.println(ar1.area(3));
		
		System.out.println("The area of the rectangle is: ");
		System.out.println(ar1.area(3,4));
		
		System.out.println("The area of the circle is: ");
		System.out.println(ar2.area(3.14,6));
	}
     
}
