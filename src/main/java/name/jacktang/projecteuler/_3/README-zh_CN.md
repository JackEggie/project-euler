## 语言

[English](README.md) | 简体中文

## [最大质因数](https://projecteuler.net/problem=3)

13195 的质因数为 5、7、13 和 29。

求 600851475143 的最大质因数。

## 解答

答案：6857

```java
long num = 600851475143L;
return MathUtil.getPrimeFactors(num).lastKey();
```

## 研讨

找出所有质因数，并求其最大值。
