## Language

English | [简体中文](README-zh_CN.md)

## [Sum square difference](https://projecteuler.net/problem=6)

The sum of the squares of the first ten natural numbers is,

$$1^2 + 2^2 + ... + 10^2 = 385$$

The square of the sum of the first ten natural numbers is,

$$(1 + 2 + ... + 10)^2 = 55^2 = 3025$$

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

## Solution

Answer: 25164150

```java
long sum = 0;
long squareSum = 0;
for (long i = 1; i <= 100; i++) {
	sum += i;
	squareSum += i * i;
}
long sumSquare = sum * sum;
return sumSquare > squareSum ? sumSquare - squareSum : squareSum - sumSquare;
```

## Discussion

Calculate the square of the sum and the sum of the squares, then calculate the difference.
