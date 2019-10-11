## 语言

[English](README.md) | 简体中文

## [三角形数的因数数量](https://projecteuler.net/problem=12)

三角形数的数列是通过不断对前一项加上自然数得到的。因此，第 7 个三角形数应为 $1 + 2 + 3 + 4 + 5 + 6 + 7 = 28$。三角形数的数列前 10 项为：

$$1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...$$

我们来看看前 7 项三角形数的因数：

```text
 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
```

由上表可知，28 是第一个拥有 5 个因数的三角形数。

求第一个拥有超过 500 个因数的三角形数。

## 解答

答案：76576500

```java
long i = 1;
long sum = i;
TreeMap<Long, Integer> factors;
while (true) {
	i++;
	sum += i;
	factors = MathUtil.getPrimeFactors(sum);
	int count = 1;
	for (Map.Entry<Long, Integer> entry : factors.entrySet()) {
		count *= entry.getValue() + 1;
	}
	if (count > 500) {
		return sum;
	}
}
```

## 研讨

依次求得三角形数的质因数与质因数的幂指数。因数的数量即为各个质因数的幂指数加一（因为指数为 0 也是一种可能）再相乘。
