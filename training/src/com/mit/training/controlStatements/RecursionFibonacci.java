package com.mit.training.controlStatements;
/*
 * 0
 * 0 1
 * 0 1 1
 * 0 1 1 2
 * 0 1 1 2 3
 * 0 1 1 2 3 5
 */
public class RecursionFibonacci {
	
public static void main(String args[]) {
	int rows=6;
	int []fib=new int[rows];
	for(int i=0;i<rows;i++) {
		fib[i]=RecFibonacci(i);
	}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<=i;j++) {
			System.out.print(fib[j]);
		}
		System.out.println();
	}
}
public static int RecFibonacci(int n) {
	  if(n == 0)
	        return 0;
	  else if(n == 1)
	      return 1;
	  else
	      return RecFibonacci(n - 1) + RecFibonacci(n - 2);
	
}
}
