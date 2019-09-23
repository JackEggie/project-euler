## Language

English | [简体中文](README-zh_CN.md)

## [10001st prime](https://projecteuler.net/problem=7)

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?

## Solution

Answer: 104743

```java
long num = 2;
for (long i = 1; i <= 10_001; num++) {
	if (MathUtil.isPrime(num)) {
		i++;
	}
}
return num - 1;
```

## Discussion

Determine whether the number is prime from small to large until the count is 10 001.
