## Language

English | [简体中文](README-zh_CN.md)

## [Largest palindrome product](https://projecteuler.net/problem=4)

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

## Solution

Answer: 906609

```java
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
```
## Discussion

Take the product from large to small, and determine whether it is palindrome.
