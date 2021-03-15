package com.lp.basicprograms;

//fibonacci series program in java using recursion.

public class FibonacciExample2 {

	static int n1=0,n2=1,n3=0;
	static void printFibonacci(int count) {
			
		if(count >0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			printFibonacci(count-1); //when count is upto zero it will work otherwise program will program will terminate
		}
	}
	
	public static void main(String[] args) {
		int count=10;
		System.out.print(n1+" "+n2); //printing 0 and 1
		printFibonacci(count-2);//printing n-2 because two numbers are already printed.
	}
}
