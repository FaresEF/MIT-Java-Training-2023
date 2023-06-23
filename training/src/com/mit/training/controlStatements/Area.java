package com.mit.training.controlStatements;

public class Area {

	protected float length;
	protected float breadth;

	protected double pi = 3.14;
	protected float radius;

	public Area(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public Area(double pi, float radius) {
		super();
		this.pi = pi;
		this.radius = radius;
	}

	public float area(float length) {
		return length * length;
	}

	public float area(float length, float breadth) {
		return length * breadth;
	}

	public float area(double pi, float radius) {
		return (float) (pi * radius * radius);

	}
	
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
