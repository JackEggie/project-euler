package name.jacktang.projecteuler.util;

import java.util.TreeSet;

public class MathUtil {

	public static boolean isPrime(long num) {
		if (num < 2) {
			return false;
		}
		for (int factor = 2; factor < num; factor++) {
			if (num % factor == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean[] generatePrimes(int limit) {
		boolean[] numbers = new boolean[limit];
		for (int i = 1; i < limit; i++) {
			numbers[i] = true;
		}
		int i = 1;
		while (i + 1 <= Math.sqrt(limit)) {
			for (int multiple = 2; (i + 1) * multiple <= limit; multiple++) {
				numbers[(i + 1) * multiple - 1] = false;
			}
			i++;
			while (!numbers[i]) {
				i++;
			}
		}
		return numbers;
	}

	public static boolean isPalindrome(int num) {
		String numString = String.valueOf(num);
		for (int i = 0; i < numString.length() / 2 + 1; i++) {
			if (numString.charAt(i) != numString.charAt(numString.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param num a positive number at least 2
	 * @return a set of factors in asc order
	 */
	public static TreeSet<Long> getFactors(long num) {
		TreeSet<Long> factors = new TreeSet<>();
		for (long factor = 2; factor < num; factor++) {
			if (num % factor == 0) {
				factors.add(factor);
				factors.add(num / factor);
				num = num / factor;
			}
		}
		return factors;
	}

	public static long isPowerNumber(long num, long maxBase) {
		for (long base = 2; base <= maxBase; base++) {
			long devision = num;
			while (devision != 1) {
				if (devision % base != 0) {
					break;
				}
				devision /= base;
			}
			if (devision == 1) {
				return base;
			}
		}
		return 0;
	}
}
