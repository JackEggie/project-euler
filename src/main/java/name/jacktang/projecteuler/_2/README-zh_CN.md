## 语言

[English](README.md) | 简体中文

## [斐波那契数列中的偶数](https://projecteuler.net/problem=2)

斐波那契数列的每一项都是由前两项相加所得。前两项为 1 和 2，则前十项为：

1，2，3，5，8，13，21，34，55，89……

求斐波那契数列中小于等于四百万的项中的所有偶数项的和。

## 解答

答案：4613732

```java
public class Solution {
	public int resolve() {
		int a = 1;
		int b = 2;

		int sum = b;

		int i = 3;
		while (a <= 4_000_000 && b <= 4_000_000) {
			if (i % 2 == 0) {
				b += a;
				if (b % 2 == 0) {
					sum += b;
				}
			} else {
				a += b;
				if (a % 2 == 0) {
					sum += a;
				}
			}
			i++;
		}
		return sum;
	}
}
```

## 研讨

从小到大找出所有偶数项，并求和。