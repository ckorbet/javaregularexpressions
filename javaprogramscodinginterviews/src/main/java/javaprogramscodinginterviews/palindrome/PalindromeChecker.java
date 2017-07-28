package javaprogramscodinginterviews.palindrome;

import java.util.Scanner;

/**
 * <p>
 * Class to check whether a given word is a palindrome
 * </p>
 */
public class PalindromeChecker {
	
	public static final void main(final String args[]) {
		
		System.out.println("Enter number to check whether is a palindrome: ");
		final Scanner myScanner = new Scanner(System.in);		
		final String word = myScanner.nextLine();
		myScanner.close();
		System.out.printf("checkPalindromeWithStringBuilder(%s): %s\n", word, PalindromeChecker.isPalindromeWithStringBuilder(word));
		System.out.printf("isPalindromeWithFor(%s): %s\n", word, PalindromeChecker.isPalindromeWithFor(word));
		System.out.printf("isPalindromeWithRecursion(%s): %s\n", word, PalindromeChecker.isPalindromeWithRecursion(word));
		
	}	
	
	public static final boolean isPalindromeWithStringBuilder(final String word) {
		boolean res = false;
		if(word!= null && !word.isEmpty()) {
			res = word.equals(new StringBuilder(word).reverse().toString());
		}		
		return res;
	}
	
	public static final boolean isPalindromeWithFor(final String word) {
		boolean res = true;
		if(word!=null && !word.isEmpty()) {
			final int length = word.length();
			for(int i=0; i<length/2; i++) {
				if(word.charAt(i) != word.charAt(length-i-1)) {
					res = false;
					break;
				}
			}
		}		
		return res;
	}
	
	public static final boolean isPalindromeWithRecursion(final String word) {
		boolean res = false;
		if(word.length() == 0 || word.length() == 1) {
			res = true;
		} else {
			if(word.charAt(0) == word.charAt(word.length()-1)) {
				return isPalindromeWithRecursion(word.substring(1, word.length()-1));
			}
		}
        return res;
    }
}
