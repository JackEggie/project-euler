package name.jacktang.projecteuler._7;

import name.jacktang.projecteuler.util.MathUtil;

public class Solution {
	public long resolve() {
		long num = 2;
		for (long i = 1; i <= 10_001; num++) {
			if (MathUtil.isPrime(num)) {
				i++;
			}
		}
		return num - 1;
	}
}
