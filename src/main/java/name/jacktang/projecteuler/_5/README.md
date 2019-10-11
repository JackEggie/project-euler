## Language

English | [简体中文](README-zh_CN.md)

## [Smallest multiple](https://projecteuler.net/problem=5)

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is _evenly divisible_ by all of the numbers from 1 to 20?

## Solution

Answer: 232792560

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

## Discussion

The answer should be all the prime factors' product of all the numbers from 1 to 20. The times a prime factor occurs should be the index of its highest power.
