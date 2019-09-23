## Language

English | [简体中文](README-zh_CN.md)

## [Special Pythagorean triplet](https://projecteuler.net/problem=9)

A Pythagorean triplet is a set of three natural numbers, $a < b < c$, for which,

$$a^2 + b^2 = c^2$$

For example, $3^2 + 4^2 = 9 + 16 = 25 = 5^2$.

There exists exactly one Pythagorean triplet for which $a + b + c = 1000$.

Find the product $abc$.

## Solution

Answer: 31875000

```java
for (long i = 1; i < 1000; i++) {
	for (long j = 1; j < 1000 - i; j++) {
		long base3 = 1000 - i - j;
		if (base3 * base3 == i * i + j * j) {
			return i * j * base3;
		}
	}
}
return 0;
```

## Discussion

Since there exists exactly one Pythagorean triplet, we just need to calculate the 2 condition(Pythagorean theorem and $a + b + c = 1000$) from small to large.
