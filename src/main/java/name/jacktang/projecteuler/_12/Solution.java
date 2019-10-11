package name.jacktang.projecteuler._12;

import name.jacktang.projecteuler.util.MathUtil;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
	public long resolve() {
		long i = 1;
		long sum = i;
		TreeMap<Long, Integer> factors;
		while (true) {
			i++;
			sum += i;
			factors = MathUtil.getPrimeFactors(sum);
			int count = 1;
			for (Map.Entry<Long, Integer> entry : factors.entrySet()) {
				count *= entry.getValue() + 1;
			}
			if (count > 500) {
				return sum;
			}
		}
	}
}
