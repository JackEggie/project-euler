## Language

English | [简体中文](README-zh_CN.md)

## [Smallest multiple](https://projecteuler.net/problem=5)

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is _evenly divisible_ by all of the numbers from 1 to 20?

## Solution

Answer: 232792560

```java
public class Solution {
	public long resolve() {
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
	}
}
```

## Discussion

The answer should be all the prime factors' product of all the numbers from 1 to 20. The times a prime factor occurs should be the index of its highest power.
