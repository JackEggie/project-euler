## Language

English | [简体中文](README-zh_CN.md)

## [Largest prime factor](https://projecteuler.net/problem=3)

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

## Solution

Answer: 6857

```java
long num = 600851475143L;
return MathUtil.getPrimeFactors(num).lastKey();
```

## Discussion

Find all the prime factors and get the largest one.
