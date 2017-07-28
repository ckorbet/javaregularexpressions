package javaprogramscodinginterviews.fibonacci;

import java.util.Scanner;

/**
 * Java program to calculate and print Fibonacci number using both recursion and
 * Iteration. Fibonacci number is sum of previous two Fibonacci numbers fn=
 * fn-1+ fn-2 E.g.: First 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34,
 * 55
 */
public class FibonacciCalculator {

	public static final void main(final String args[]) {

		// input to print Fibonacci series up to how many numbers
		System.out.println("Enter number up to which Fibonacci series to print: ");
		final Scanner myScanner = new Scanner(System.in);		
		int number = myScanner.nextInt();
		myScanner.close();
		System.out.println("Fibonacci series upto " + number + " numbers : ");

		System.out.println("Printing Fibonacci serie with iteration...");
		for (int i = 1; i <= number; i++) {
			System.out.print(FibonacciCalculator.fibonacciLoop(i) + " ");
		}
		System.out.println("Printing Fibonacci serie with recursion...");
		for (int i = 1; i <= number; i++) {
			System.out.print(FibonacciCalculator.fibonacciRecursive(i) + " ");
		}
	}

	/*
	 * Java program for Fibonacci number using recursion. This program uses tail
	 * recursion to calculate Fibonacci number for a given number
	 * 
	 * @return Fibonacci number
	 */
	public static final int fibonacciRecursive(final int number) {
		int res = 0;
		if (number == 1 || number == 2) {
			res = 1;
		} else {
			res = fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2); // tail recursion
		}		
		return res;
	}

	/*
	 * Java program to calculate Fibonacci number using loop or Iteration.
	 * 
	 * @return Fibonacci number
	 */
	public static final int fibonacciLoop(final int number) {
		int res = 0;
		if (number == 1 || number == 2) {
			res =1;
		} else {
			int fibo1 = 1, fibo2 = 1;
			res = 1;
			for (int i = 3; i <= number; i++) {
				// Fibonacci number is sum of previous two Fibonacci number
				res = fibo1 + fibo2;
				fibo1 = fibo2;
				fibo2 = res;
			}
		}
		
		return res; // Fibonacci number
	}
}