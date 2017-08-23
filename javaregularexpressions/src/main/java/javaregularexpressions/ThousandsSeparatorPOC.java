package javaregularexpressions;

import java.util.Scanner;

public class ThousandsSeparatorPOC {
	
	/*
	 * 10,05 ==> FAILURE
	 * 10,005 ==> SUCCESS = 10005
	 * 10.05 ==> SUCCESS = 10'05
	 * 10.005 ==> SUCCESS = 10'005
	 * 10,005.004 ==> SUCCESS = 10005'004
	 * 
	 * ',' ==> Thousands separator
	 * '.' ==> Decimals separator
	 */
	
	// Original reg. exp.: ^\d+|\d{1,3}(?:\.\d{3})*$ ==> does not work	
	//private static final String MY_FIRST_REGEXP = "^\\d+|\\d{1,3}(?:\\,\\d{3})*$";
	// Original reg. exp.: ^(?:0|[1-9][0-9]{0,2}(?:\.[0-9]{3})*)$ ==> does not work
	//private static final String MY_SECOND_REGEXP = "^(?:0|[1-9][0-9]{0,2}(?:\\,[0-9]{3})*)$";
	// Original reg. exp.: ^([+\-]?[0-9\,]*(\.[0-9]*)?)$
	//private static final String MY_THIRD_REGEXP = "^([+\\-]?[0-9\\,]*(\\.[0-9]*)?)$";
	// Original reg. exp.: ^[+-]?[0-9]{1,3}(,[0-9]{3})*(\.[0-9]+)?$
	private static final String MY_FOURTH_REGEXP = "^[+-]?[0-9]{1,3}(,[0-9]{3})*(\\.[0-9]+)?$";
	
	public static final void main(final String args[]){
		
		System.out.println("Enter number to test thousands separator: ");
		final Scanner myScanner = new Scanner(System.in);
		final String string = myScanner.next();		
		myScanner.close();
		
		System.out.printf("Entered string '%s' matches reg. exp.: %b\n", 
				string, string.matches(MY_FOURTH_REGEXP));
		
	}	
}