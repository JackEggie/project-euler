## 语言

[English](README.md) | 简体中文

## [3 或 5 的倍数](https://projecteuler.net/problem=1)

找出所有小于 10 的 3 或 5 的倍数，得到 3，5，6，9。他们的和为 23。

求所有小于 1000 的 3 或 5 的倍数的和。

## 解答

答案：233168

```java
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
```

## 研讨

从小到大找出所有 3 或 5 的倍数，并求和。
