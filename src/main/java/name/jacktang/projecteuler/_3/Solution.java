package name.jacktang.projecteuler._3;

import name.jacktang.projecteuler.util.MathUtil;

public class Solution {
	public long resolve() {
		long num = 600851475143L;
		return MathUtil.getPrimeFactors(num).lastKey();
	}
}
