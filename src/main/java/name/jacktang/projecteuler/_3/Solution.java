package name.jacktang.projecteuler._3;

import name.jacktang.projecteuler.util.MathUtil;

import java.util.Comparator;
import java.util.TreeSet;

public class Solution {
	public long resolve() {
		long num = 600851475143L;
		TreeSet<Long> factors = new TreeSet<>(Comparator.reverseOrder());
		factors.addAll(MathUtil.getFactors(num));
		for (long factor : factors) {
			if (MathUtil.isPrime(factor)) {
				return factor;
			}
		}
		return 0;
	}
}
