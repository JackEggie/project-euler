## 语言

[English](README.md) | 简体中文

## [最小公倍数](https://projecteuler.net/problem=5)

2520 是可以被任意 1 到 10 中的数整除的最小数。

求可以被任意 1 到 20 中的数**整除**的最小数。

## 解答

答案：232792560

```java
TreeMap<Long, Integer> factors = new TreeMap<>();
for (long i = 2; i <= 20; i++) {
	for (Map.Entry<Long, Integer> entry : MathUtil.getPrimeFactors(i).entrySet()) {
		factors.put(entry.getKey(), factors.containsKey(entry.getKey()) ? Math.max(entry.getValue(), factors.get(entry.getKey())) : entry.getValue());
	}
}
long ret = 1;
for (Map.Entry<Long, Integer> entry : factors.entrySet()) {
	for (int i = 0; i < entry.getValue(); i++) {
		ret *= entry.getKey();
	}
}
return ret;
```

## 研讨

答案应为 1 到 20 中所有数的所有质因数的积。其中某个质因数出现的次数为其出现的最高次幂的指数。
