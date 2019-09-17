### Language

English | [简体中文](/README-zh_CN.md)

### Introduction

This project is my personal translation and solution for the [Euler Project](https://projecteuler.net/). 

> This project should only be used for personal study usage. If you find any abuse, please [contact me](mailto:er_tzw@163.com) or [report it](https://github.com/jackeggie/project-euler/issues/new).

### How To Use This Project

You can find the answer below, but I extremely don't recommend you to just copy the answer.

This is a Maven project. You can find the Java solution in my code, and you can test the solution with my test cases.

### Problems

| No   | Title                                                                        | Answer      | Performance     |
| ---- | ---------------------------------------------------------------------------- | ----------- | --------------- |
| 1    | [Multiples of 3 and 5](/src/main/java/name/jacktang/projecteuler/_1)         | 233168      | less than 10 ms |
| 2    | [Even Fibonacci numbers](/src/main/java/name/jacktang/projecteuler/_2)       | 4613732     | less than 10 ms |
| 3    | [Largest prime factor](/src/main/java/name/jacktang/projecteuler/_3)         | 6857        | less than 10 ms |
| 4    | [Largest palindrome product](/src/main/java/name/jacktang/projecteuler/_4)   | 906609      | less than 20 ms |
| 5    | [Smallest multiple](/src/main/java/name/jacktang/projecteuler/_5)            | 232792560   | less than 10 ms |
| 6    | [Sum square difference](/src/main/java/name/jacktang/projecteuler/_6)        | 25164150    | less than 10 ms |
| 7    | [10001st prime](/src/main/java/name/jacktang/projecteuler/_7)                | 104743      | less than 5 s   |
| 8    | [Largest product in a series](/src/main/java/name/jacktang/projecteuler/_8)  | 23514624000 | less than 10 ms |

I am working hard on the rest problems...

### About Mathematical Formula

Please install the [Google Chrome plugin](https://github.com/orsharir/github-mathjax) to display LaTeX or Mathjax expression correctly.

### Knowledge Base

#### Factor

In mathematics, a divisor of an integer n, also called a factor of n, is an integer m that may be multiplied by some integer to produce n.

1. How to find factors of an integer?

Find the smallest factor, and divide it. Just repeat that. See [my implementation](/src/main/java/name/jacktang/projecteuler/util/MathUtil.java).

Or you can easily get the factors by [Factor Calculator](https://www.calculator.net/factor-calculator.html).

2. [Unique Factorization Theorem](https://en.wikipedia.org/wiki/Fundamental_theorem_of_arithmetic)

每个大于1的自然数，要么本身就是质数，要么可以写为2个或以上的质数的积，而且这些质因子按大小排列之后，写法仅有一种方式。

如果你对因数有更多的疑问，请参见[因数](https://zh.wikipedia.org/wiki/%E5%9B%A0%E6%95%B8)。

#### 质数

在大于 1 的自然数中，除了 1 和该数自身外，无法被其他自然数整除的数。

1. 如何判断一个数是否质数

判断最小因数是否自身相等。参见[本项目实现](/src/main/java/name/jacktang/projecteuler/util/MathUtil.java)。

如果你对质数有更多的疑问，请参见[质数](https://zh.wikipedia.org/wiki/%E7%B4%A0%E6%95%B0)。
