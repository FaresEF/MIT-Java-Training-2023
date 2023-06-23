package com.mit.training.controlStatements;

public class PrimeNumber {
	
public static void main(String args[]) {
	int i=37;
	int count=0;
	
	for(int j=1;j<=i/2;j++) {
		if(i%j==0) {
			count++;
		}
	}
	if(count>1) {
		System.out.println("not prime");
	}
	else {
		System.out.println("prime");
	}
}
	
}
