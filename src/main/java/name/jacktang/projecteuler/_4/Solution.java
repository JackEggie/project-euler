package name.jacktang.projecteuler._4;

import name.jacktang.projecteuler.util.MathUtil;

public class Solution {
	public int resolve() {
		int ret = 0;
		for (int i = 999; i > 0; i--) {
			for (int j = 999; j > 0; j--) {
				int num = i * j;
				if (num > ret && MathUtil.isPalindrome(num)) {
					ret = num;
				}
			}
		}
		return ret;
	}
}
