package com.mit.training.controlStatements;

public class Palindrome {
public static boolean ispalindrom(String str) {

	int length = str.length();

	for (int i = 0; i < length / 2; i++) {
		if (str.charAt(i) != str.charAt(length - 1 - i)) {
			return false;
		}
	}
	return true;
}

public static void main(String args[]) {
	String str = "madam";
	if (ispalindrom(str)) {
		System.out.println("Is Palindrome");
	} else {
		System.out.println("Is Not Palindrome");
	}
}
}
