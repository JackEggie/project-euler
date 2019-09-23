## 语言

[English](README.md) | 简体中文

## [质数的和](https://projecteuler.net/problem=10)

小于 10 的所有质数的和为 $2 + 3 + 5 + 7 = 17$。

求小于 2,000,000 的所有质数的和。

## 解答

答案：142913828922

```java
long sum = 0;
boolean[] primes = MathUtil.generatePrimes(2_000_000);
for (int i = 0; i < primes.length; i++) {
	if (primes[i]) {
		sum += i + 1;
	}
}
return sum;
```

## 研讨

你可以很方便地通过对递增的自然数依次判断是否质数来求和，但这种方式性能很差。

用[质数筛](https://zh.wikipedia.org/wiki/%E5%9F%83%E6%8B%89%E6%89%98%E6%96%AF%E7%89%B9%E5%B0%BC%E7%AD%9B%E6%B3%95)可以提升生成质数的效率。

前者的性能大约在 30 分钟，而后者能达到 50 毫秒。
