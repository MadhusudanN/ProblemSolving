package com.java.coding.practise.testprime;

public class CheckPrime {

	public static boolean isPrime(int number) {

		/*
		 * Check for the below corner cases 1. Negative number 2. Out of range values.
		 */

		if (number < 0 || number > Integer.MAX_VALUE || number == 1) {
			return false;
		}

		else {

			for (int i = 2; i < number; i++) {
				int reminder = number % i;
				if (reminder == 0) {
					return false;
				}
			}
			return true;

		}
	}

}
