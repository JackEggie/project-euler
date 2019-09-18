## 语言

[English](README.md) | 简体中文

## [平方和与和平方之差](https://projecteuler.net/problem=6)

前 10 个自然数的平方和如下：

$$1^2 + 2^2 + ... + 10^2 = 385$$

前 10 个自然数的和的平方如下：

$$(1 + 2 + ... + 10)^2 = 55^2 = 3025$$

因此，前 10 个自然数的平方和与和的平方之间的差值为 $3025 − 385 = 2640$。

求前 100 个自然数的平方和与和的平方之间的差值。

## 解答

答案：25164150

```java
public class Solution {
	public long resolve() {
		long sum = 0;
		long squareSum = 0;
		for (long i = 1; i <= 100; i++) {
			sum += i;
			squareSum += i * i;
		}
		long sumSquare = sum * sum;
		return sumSquare > squareSum ? sumSquare - squareSum : squareSum - sumSquare;
	}
}
```

## 研讨

分别求平方和与和的平方，并求其差。
