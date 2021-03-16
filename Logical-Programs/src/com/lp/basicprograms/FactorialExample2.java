package com.lp.basicprograms;

//program using recursion
public class FactorialExample2 {
	static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n * factorial(n - 1));
		}
	}

	public static void main(String[] args) {
		int i, fact = 1;
		int number = 4; // it is the calculate the factorial
		fact = factorial(number);
		System.out.println("factorial is:" + fact);
	}
}
