package name.jacktang.projecteuler._14;

public class Solution {
	public long resolve() {
		long longestNumber = 0;
		long longestLength = 0;
		for (long i = 1; i < 1_000_000; i++) {
			long number = i;
			long length = 1;
			while (number > 1) {
				if (number % 2 == 0) {
					number /= 2;
				} else {
					number = 3 * number + 1;
				}
				length++;
			}
			if (length > longestLength) {
				longestLength = length;
				longestNumber = i;
			}
		}
		return longestNumber;
	}
}
