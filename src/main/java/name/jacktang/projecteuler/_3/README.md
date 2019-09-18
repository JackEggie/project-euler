## Language

English | [简体中文](README-zh_CN.md)

## [Largest prime factor](https://projecteuler.net/problem=3)

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

## Solution

Answer: 6857

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

## Discussion

Find all the factors and determine whether they are prime or not.
