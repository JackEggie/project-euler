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
}
