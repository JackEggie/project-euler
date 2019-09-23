## Language

English | [简体中文](README-zh_CN.md)

## [Summation of primes](https://projecteuler.net/problem=10)

The sum of the primes below 10 is $2 + 3 + 5 + 7 = 17$.

Find the sum of all the primes below two million.

## Solution

Answer: 142913828922

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

## Discussion

To get the summation, I just summate all the prime number. Unfortunately, The judgement of if a number is prime is slow.

How to generate prime numbers faster? The answer is [prime number sieve](https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes).

With the judgement of if a number is prime, it costs about 30 minutes. However, it will only cost about 50 milliseconds by prime number sieve.
