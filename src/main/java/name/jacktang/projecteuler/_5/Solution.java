package name.jacktang.projecteuler._5;

import name.jacktang.projecteuler.util.MathUtil;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public long resolve() {
		Set<Long> factors = new HashSet<>();
		for (long i = 2; i <= 20; i++) {
			if (MathUtil.isPrime(i)) {
				factors.add(i);
			}
		}
		for (long i = 20; i > 1; i--) {
			long base = MathUtil.isPowerNumber(i, 5);
			if (base != 0 && factors.contains(base)) {
				factors.remove(base);
				factors.add(i);
			}
		}
		long ret = 1;
		for (long num : factors) {
			ret *= num;
		}
		return ret;
	}
}
