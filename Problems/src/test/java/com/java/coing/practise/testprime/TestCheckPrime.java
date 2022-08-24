package com.java.coing.practise.testprime;

import org.junit.Test;

import com.java.coding.practise.testprime.CheckPrime;

import junit.framework.Assert;

public class TestCheckPrime {
	
	// Corner cases.
	@Test
	public void testOutofRange()
	{
		int number = -100;
		boolean isPrime = CheckPrime.isPrime(number);
		Assert.assertEquals(false, isPrime);
		
		number = 1;
		isPrime = CheckPrime.isPrime(number);
		Assert.assertEquals(false, isPrime);
		
		number = Integer.MAX_VALUE +1;
		isPrime = CheckPrime.isPrime(number);
		Assert.assertEquals(false, isPrime);
	}
	
	@Test // Positive and Negative case
	public void checkPrime()
	{
		int number = 7;
		boolean isPrime = CheckPrime.isPrime(number);
		Assert.assertEquals(true, isPrime);

		number = 20;
		isPrime = CheckPrime.isPrime(number);
		Assert.assertEquals(false, isPrime);

	}

}
