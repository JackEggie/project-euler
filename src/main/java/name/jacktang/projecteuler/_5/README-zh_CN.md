## 语言

[English](README.md) | 简体中文

## [最小公倍数](https://projecteuler.net/problem=5)

2520 是可以被任意 1 到 10 中的数整除的最小数。

求可以被任意 1 到 20 中的数**整除**的最小数。

## 解答

答案：232792560

```java
Set<Long> factors = new HashSet<>();
for (long i = 2; i <= 20; i++) {
	if (MathUtil.isPrime(i)) {
		factors.add(i);
	}
}
for (long i = 20; i > 1; i--) {
	long base = MathUtil.isPowerNumber(i, 5);
	if (base != 0 && factors.contains(base)) {
		factors.remove(base);
		factors.add(i);
	}
}
long ret = 1;
for (long num : factors) {
	ret *= num;
}
return ret;
```

## 研讨

答案应为 1 到 20 中所有数的所有质因数的积。其中某个质因数出现的次数为其出现的最高次幂的指数。
