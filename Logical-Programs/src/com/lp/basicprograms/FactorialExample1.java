package com.lp.basicprograms;

//factorial calculation  in a simple way
public class FactorialExample1 {
	public static void main(String[] args) {
		int fact=1;
		int number=5; //it is used to calculate factorial
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial is: "+fact);
		
	}

}
