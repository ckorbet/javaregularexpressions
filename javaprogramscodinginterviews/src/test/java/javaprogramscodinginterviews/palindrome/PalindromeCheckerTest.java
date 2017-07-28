package javaprogramscodinginterviews.palindrome;

import org.junit.Assert;

import org.junit.Test;

public class PalindromeCheckerTest {

	@Test
	public void testCheckPalindromeWithStringBuilderYes() {
		Assert.assertTrue("andna is a pandrome", PalindromeChecker.isPalindromeWithStringBuilder("andna"));
	}
	
	@Test
	public void testCheckPalindromeWithStringBuilderNo() {
		Assert.assertFalse("charlie is NOT a pandrome", PalindromeChecker.isPalindromeWithStringBuilder("charlie"));
	}
	
	@Test
	public void testCheckPalindromeWithForYes() {
		Assert.assertTrue("andna is a pandrome", PalindromeChecker.isPalindromeWithFor("andna"));
	}
	
	@Test
	public void testCheckPalindromeWithForNo() {
		Assert.assertFalse("charlie is NOT a pandrome", PalindromeChecker.isPalindromeWithFor("charlie"));
	}
	
	@Test
	public void testCheckPalindromeWithRecursionYes() {
		Assert.assertTrue("andna is a pandrome", PalindromeChecker.isPalindromeWithRecursion("andna"));
	}
	
	@Test
	public void testCheckPalindromeWithRecursionNo() {
		Assert.assertFalse("charlie is NOT a pandrome", PalindromeChecker.isPalindromeWithRecursion("charlie"));
	}

}
