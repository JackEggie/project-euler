## Language

English | [简体中文](README-zh_CN.md)

## [Longest Collatz sequence](https://projecteuler.net/problem=14)

The following iterative sequence is defined for the set of positive integers:

$$n → n/2 (n is even) \\ n → 3n + 1 (n is odd)$$

Using the rule above and starting with 13, we generate the following sequence:

$$13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1$$

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet ([Collatz Problem](https://en.wikipedia.org/wiki/Collatz_conjecture)), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.

## Solution

Answer: 837799

```java
long longestNumber = 0;
long longestLength = 0;
for (long i = 1; i < 1_000_000; i++) {
	long number = i;
	long length = 1;
	while (number > 1) {
		if (number % 2 == 0) {
			number /= 2;
		} else {
			number = 3 * number + 1;
		}
		length++;
	}
	if (length > longestLength) {
		longestLength = length;
		longestNumber = i;
	}
}
return longestNumber;
```

## Discussion

Just list all the Collatz sequence from 1 to 1 million.
