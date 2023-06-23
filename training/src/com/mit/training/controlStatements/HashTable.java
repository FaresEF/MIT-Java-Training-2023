package com.mit.training.controlStatements;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class HashTable {
	public static void main(String args[]) {
		Hashtable<String, String> months = new Hashtable<String, String>();

		months.put("1", "January");
		months.put("2", "February");
		months.put("3", "March");
		months.put("4", "April");
		months.put("5", "May");
		months.put("6", "June");

		Set<String> monthsKeys = months.keySet();
             months.remove("1");
             
		for (String Key : monthsKeys) {
			System.out.println(months.get(Key));
		}
		
		System.out.println("-------------");
		
		Collection<String> str = months.values();

		for (String val : str) {
			System.out.println(val);
		}
	}
}
