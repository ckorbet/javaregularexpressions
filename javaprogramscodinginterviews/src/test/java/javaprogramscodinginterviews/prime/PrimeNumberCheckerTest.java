package javaprogramscodinginterviews.prime;

import org.junit.Assert;

import org.junit.Test;

public class PrimeNumberCheckerTest {

	@Test
	public final void testIsPrimeYes() {		
		Assert.assertTrue("Number 2 is prime", PrimeNumberChecker.isPrime(2));
	}
	
	@Test
	public final void testIsPrimeNo() {
		Assert.assertFalse("Number 4 is not prime", PrimeNumberChecker.isPrime(4));
	}
	
	@Test
	public final void testIsPrimeNumberYes() {
		Assert.assertTrue("Number 2 is prime", PrimeNumberChecker.isPrimeNumber(2));
	}
	
	@Test
	public final void testIsPrimeNumberNo() {
		Assert.assertFalse("Number 4 is prime", PrimeNumberChecker.isPrimeNumber(4));
	}
	
	@Test
	public final void testIsPrimeOrNotYes() {
		Assert.assertTrue("Number 2 is prime", PrimeNumberChecker.isPrimeOrNot(2));
	}
	
	@Test
	public final void testIsPrimeOrNotNo() {
		Assert.assertFalse("Number 4 is prime", PrimeNumberChecker.isPrimeOrNot(4));
	}

}
