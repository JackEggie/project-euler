package name.jacktang.projecteuler._5;

import name.jacktang.projecteuler.util.MathUtil;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
	public long resolve() {
		TreeMap<Long, Integer> factors = new TreeMap<>();
		for (long i = 2; i <= 20; i++) {
			for (Map.Entry<Long, Integer> entry : MathUtil.getPrimeFactors(i).entrySet()) {
				factors.put(entry.getKey(), factors.containsKey(entry.getKey()) ? Math.max(entry.getValue(), factors.get(entry.getKey())) : entry.getValue());
			}
		}
		long ret = 1;
		for (Map.Entry<Long, Integer> entry : factors.entrySet()) {
			for (int i = 0; i < entry.getValue(); i++) {
				ret *= entry.getKey();
			}
		}
		return ret;
	}
}
