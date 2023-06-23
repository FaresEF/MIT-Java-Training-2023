package com.mit.training.oops;

/**
 * @author EFares
 *
 */
public class Animal {
	protected String type;
	protected int age;

	public void Animals(String ani1, String ani2) {
		System.out.println(ani1 + " " + ani2);
	}

	protected void Animals(String ani1, String ani2, String ani3) {
		System.out.println(ani1 + " " + ani2 + " " + ani3);
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
