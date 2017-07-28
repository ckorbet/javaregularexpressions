package javaprogramscodinginterviews.prime;

import java.util.Scanner;

/**
 * <p>
 * Class with generic functionality to check whether a number is prime.
 * </p>
 * <p>
 * A number is prime if is not divisible by any other number
 * </p>
 */
public class PrimeNumberChecker {
	
	public static final void main(final String args[]) {
		System.out.println("Enter number to check whether is a prime: ");
		final Scanner myScanner = new Scanner(System.in);		
		int number = myScanner.nextInt();
		myScanner.close();
		System.out.printf("isPrime(%d): %s\n", number, PrimeNumberChecker.isPrime(number));		
		System.out.printf("isPrimeNumber(%d): %s\n", number, PrimeNumberChecker.isPrimeNumber(number));
		System.out.printf("isPrimeOrNot(%d): %s\n", number, PrimeNumberChecker.isPrimeOrNot(number));
	}
	
	/* 
	 * Java method to check if an integer number is prime or not. 
	 * @return true if number is prime, else false 
	 */ 
	public static final boolean isPrime(int number) {
		boolean res = true; 
		int sqrt = (int) Math.sqrt(number) + 1;
		for (int i = 2; i < sqrt; i++) {
			if (number % i == 0) {
				// number is perfectly divisible - no prime
				res = false;
				break;
			}
		}
		return res;
	}
	
	/*
	 * Second version of isPrimeNumber method, with improvement like not
	 * checking for division by even number, if its not divisible by 2.
	 * @return true if number is prime, else false
	 */
	public static boolean isPrimeNumber(int number) {
		boolean res = true;
		if(number != 2 && number != 3) {
			if (number % 2 == 0) {
				res = false;
			} else {
				int sqrt = (int) Math.sqrt(number) + 1;
				for (int i = 3; i < sqrt; i += 2) {
					if (number % i == 0) {
						res = false;
					}
				}
			}
		}		
		return res;
	}
	
	/*
	 * Third way to check if a number is prime or not.
	 * @return true if number is prime, else false
	 */
	public static boolean isPrimeOrNot(int num) {
		boolean res = false;
		if(num > 0) {
			if(num != 0 && num != 1) {
				if(num == 2 || num == 3) {
					res = true;
				} else {
					if((num * num - 1) % 24 == 0) {
						res = true;
					}
				}				
			}
		}	
		return res;
	}
}