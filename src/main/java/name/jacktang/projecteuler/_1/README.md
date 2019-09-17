### Language

English | [简体中文](README-zh_CN.md)

### [Multiples of 3 and 5](https://projecteuler.net/problem=1)

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

### Solution

Answer: 233168

```java
public class Solution {
	public int resolve() {
		int sum = 0;
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
```

### Discussion

Find all the multiples of 3 or 5 from small to large and sum them.
