/**
 * 
 */
package com.mit.training.controlStatements;

import java.util.ArrayList;

/**
 * @author EFares
 *
 */
public class ArrayTable {
 public static void main(String args[]) {
	 ArrayList <String> months=new ArrayList<String>();
	 
	 months.add("January");
	 months.add("February");
	 months.add("March");
	 months.add("April");
	 months.add("May");
	 months.add("June");
	 
	 months.remove(5);
	 
	 for(String mo:months) {
		 System.out.println(mo);
	 }
 }

}
