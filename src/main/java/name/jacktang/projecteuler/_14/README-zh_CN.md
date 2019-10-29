## 语言

[English](README.md) | 简体中文

## [最长考拉兹数列](https://projecteuler.net/problem=14)

在正整数集上定义如下迭代数列：

$$n → n/2 (n 为偶数时) \\ n → 3n + 1 (n 为奇数时)$$

将 13 作为起始数，利用上述规则生成的数列如下：

$$13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1$$

可以看到该数列（第一项为 13，最后一项为 1）有 10 项。我们可以预测，当使用上述规则时，将任意数字作为第一项所生成的数列的最后一项均为 1，这就是仍未被证明的[考拉兹猜想](https://zh.wikipedia.org/wiki/%E8%80%83%E6%8B%89%E5%85%B9%E7%8C%9C%E6%83%B3)。

当把小于一百万的数字作为第一项时，哪一个数字会生成最长的考拉兹数列？

注：除第一项以外的其他项是可以大于一百万的。

## 解答

答案：837799

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

## 研讨

依次对 1 到 1000000 之间的数字生成考拉兹数列并记录其长度。
