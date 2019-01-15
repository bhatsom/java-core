package com.somnath.apps.algo;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Factorial recursive: " + factorialRecursive(5));
		System.out.println("Factorial recursive: " + factorialIterative(5));
	}

	public static int factorialRecursive(int n)	{
		if (n <= 1)
			return 1;
		return n * factorialRecursive(n - 1);
	}

	//iterative function calculates n!
	public static int factorialIterative(int n) {
		int fact = 1;

		if (n <= 1)
			return fact;

		while (n > 1) {
			fact *= n;
			n--;
		}
		return fact;
	}

}
