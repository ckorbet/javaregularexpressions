package javaprogramscodinginterviews.fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciCalculatorTest {

	@Test
	public void testFibonacciLoop1() {
		final int res = FibonacciCalculator.fibonacciRecursive(1);
		Assert.assertTrue("Fibonacci number of 1 must be 1", 1 == res);
	}

	@Test
	public void testFibonacciLoop2() {
		final int res = FibonacciCalculator.fibonacciRecursive(2);
		Assert.assertTrue("Fibonacci number of 1 must be 1", 1 == res);
	}
	
	@Test
	public void testFibonacciLoop3() {
		final int res = FibonacciCalculator.fibonacciRecursive(3);
		Assert.assertTrue("Fibonacci number of 1 must be 1", 2 == res);
	}
	
	@Test
	public void testFibonacciRecursive1() {
		final int res = FibonacciCalculator.fibonacciRecursive(1);
		Assert.assertTrue("Fibonacci number of 1 must be 1", 1 == res);
	}

	@Test
	public void testFibonacciRecursive2() {
		final int res = FibonacciCalculator.fibonacciRecursive(2);
		Assert.assertTrue("Fibonacci number of 1 must be 1", 1 == res);
	}
	
	@Test
	public void testFibonacciRecursive3() {
		final int res = FibonacciCalculator.fibonacciRecursive(3);
		Assert.assertTrue("Fibonacci number of 1 must be 1", 2 == res);
	}
}