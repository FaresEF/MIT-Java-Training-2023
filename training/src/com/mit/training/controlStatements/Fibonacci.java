package com.mit.training.controlStatements;

public class Fibonacci {
	
public static void main(String args[]) {
	
	int i=0,j=1;
	int x=0;
	int count =0;
	
	while(count<5){
		System.out.println(i); 
		x=i+j;
		  
		i=j;
		  
		j=x;
		 
		count++;
	}
	System.out.println(x);
}
}
