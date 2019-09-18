## 语言

[English](README.md) | 简体中文

## [最大回文乘积](https://projecteuler.net/problem=4)

回文数从前往后与从后往前是完全对称的。最大的两位数回文乘积为 9009 = 91 × 99。

求最大的三位数回文乘积。

## 解答

答案：906609

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

## 研讨

从大到小依次求乘积，并判断其是否回文。
