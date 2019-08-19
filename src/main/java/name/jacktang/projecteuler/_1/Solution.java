package name.jacktang.projecteuler._1;

public class Solution {
	public int resolve() {
		int sum = 0;
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}