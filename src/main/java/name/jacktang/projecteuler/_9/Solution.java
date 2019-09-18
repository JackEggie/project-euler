package name.jacktang.projecteuler._9;

public class Solution {
	public long resolve() {
		for (long i = 1; i < 1000; i++) {
			for (long j = 1; j < 1000 - i; j++) {
				long base3 = 1000 - i - j;
				if (base3 * base3 == i * i + j * j) {
					return i * j * base3;
				}
			}
		}
		return 0;
	}
}
