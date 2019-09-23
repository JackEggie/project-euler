## 语言

[English](README.md) | 简体中文

## [第 10001 个质数](https://projecteuler.net/problem=7)

前 6 个质数为：2、3、5、7、11 和 13，因此第 6 个质数为 13。

求第 10 001 个质数。

## 解答

答案：104743

```java
long num = 2;
for (long i = 1; i <= 10_001; num++) {
	if (MathUtil.isPrime(num)) {
		i++;
	}
}
return num - 1;
```

## 研讨

从小到大依次判断是否质数，直到计数为 10 001。
