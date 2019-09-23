package name.jacktang.projecteuler._10;

import name.jacktang.projecteuler.util.MathUtil;

public class Solution {
	public long resolve() {
		return resolve2();
	}

	/**
	 * performance: less than 30 min
	 */
	private long resolve1() {
		long sum = 2;
		for (long i = 3; i < 2_000_000; i += 2) {
			if (MathUtil.isPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}

	private long resolve2() {
		long sum = 0;
		boolean[] primes = MathUtil.generatePrimes(2_000_000);
		for (int i = 0; i < primes.length; i++) {
			if (primes[i]) {
				sum += i + 1;
			}
		}
		return sum;
	}
}
