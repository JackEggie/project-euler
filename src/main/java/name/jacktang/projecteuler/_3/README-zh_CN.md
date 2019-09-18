## 语言

[English](README.md) | 简体中文

## [最大质因数](https://projecteuler.net/problem=3)

13195 的质因数为 5、7、13 和 29。

求 600851475143 的最大质因数。

## 解答

答案：6857

```java
public class Solution {
	public long resolve() {
		long num = 600851475143L;
		TreeSet<Long> factors = new TreeSet<>(Comparator.reverseOrder());
		factors.addAll(MathUtil.getFactors(num));
		for (long factor : factors) {
			if (MathUtil.isPrime(factor)) {
				return factor;
			}
		}
		return 0;
	}
}
```

## 研讨

找出所有因数，并从大到小判断是否质数。
