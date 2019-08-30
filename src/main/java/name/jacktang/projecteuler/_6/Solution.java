package name.jacktang.projecteuler._6;

public class Solution {
	public long resolve() {
		long sum = 0;
		long squareSum = 0;
		for (long i = 1; i <= 100; i++) {
			sum += i;
			squareSum += i * i;
		}
		long sumSquare = sum * sum;
		return sumSquare > squareSum ? sumSquare - squareSum :squareSum - sumSquare;
	}
}
