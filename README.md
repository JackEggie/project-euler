## Language

English | [简体中文](/README-zh_CN.md)

## Introduction

This project is my personal translation and solution for the [Euler Project](https://projecteuler.net/). 

> This project should only be used for personal study usage. If you find any abuse, please [contact me](mailto:er_tzw@163.com) or [report it](https://github.com/jackeggie/project-euler/issues/new).

## How To Use This Project

You can find the answer below, but I extremely don't recommend you to just copy the answer.

This is a Maven project. You can find the Java solution in my code, and you can test the solution with my test cases.

## About Mathematical Formula

Please install the [Google Chrome plugin](https://github.com/orsharir/github-mathjax) to display LaTeX or Mathjax expression correctly.

## Problems

| No   | Title                                                                               | Answer       | Performance      |
| ---- | ----------------------------------------------------------------------------------- | ------------ | ---------------- |
| 1    | [Multiples of 3 and 5](/src/main/java/name/jacktang/projecteuler/_1)                | 233168       | less than 10 ms  |
| 2    | [Even Fibonacci numbers](/src/main/java/name/jacktang/projecteuler/_2)              | 4613732      | less than 10 ms  |
| 3    | [Largest prime factor](/src/main/java/name/jacktang/projecteuler/_3)                | 6857         | less than 10 ms  |
| 4    | [Largest palindrome product](/src/main/java/name/jacktang/projecteuler/_4)          | 906609       | less than 20 ms  |
| 5    | [Smallest multiple](/src/main/java/name/jacktang/projecteuler/_5)                   | 232792560    | less than 10 ms  |
| 6    | [Sum square difference](/src/main/java/name/jacktang/projecteuler/_6)               | 25164150     | less than 10 ms  |
| 7    | [10001st prime](/src/main/java/name/jacktang/projecteuler/_7)                       | 104743       | less than 5 s    |
| 8    | [Largest product in a series](/src/main/java/name/jacktang/projecteuler/_8)         | 23514624000  | less than 10 ms  |
| 9    | [Special Pythagorean triplet](/src/main/java/name/jacktang/projecteuler/_9)         | 31875000     | less than 10 ms  |
| 10   | [Summation of primes](/src/main/java/name/jacktang/projecteuler/_10)                | 142913828922 | less than 50 ms  |
| 11   | [Largest product in a grid](/src/main/java/name/jacktang/projecteuler/_11)          | 70600674     | less than 10 ms  |
| 12   | [Highly divisible triangular number](/src/main/java/name/jacktang/projecteuler/_12) | 76576500     | less than 150 ms |
| 13   | [Large sum](/src/main/java/name/jacktang/projecteuler/_13)                          | 5537376230   | less than 50 ms  |
| 14   | [Longest Collatz sequence](/src/main/java/name/jacktang/projecteuler/_14)           | 837799       | less than 1 s    |

I am working hard on the rest problems...

## Knowledge Base

### Factor

In mathematics, a divisor of an integer n, also called a factor of n, is an integer m that may be multiplied by some integer to produce n.

If you want to dig further more, please see [Factor](https://en.wikipedia.org/wiki/Divisor).

#### How to find factors of an integer?

Find the smallest factor, and divide it. Just repeat that. See [my implementation](/src/main/java/name/jacktang/projecteuler/util/MathUtil.java).

Or you can easily get the factors by [Factor Calculator](https://www.calculator.net/factor-calculator.html).

#### [Unique Factorization Theorem](https://en.wikipedia.org/wiki/Fundamental_theorem_of_arithmetic)

Every integer greater than 1 either is a prime number itself or can be represented as the product of prime numbers and that, moreover, this representation is unique, up to (except for) the order of the factors.

#### Counting Factors

Number of factors equals each prime factor's power exponent plus 1 and multiply together. We use power exponent due to the possible composition of a factor is affected by certain prime factor's count. And we should take the condition of power exponent equals 0 into consideration, so we add 1 on the power exponents.

See [Counting Factors](https://www.basic-mathematics.com/counting-factors.html).

### Prime Number

A prime number (or a prime) is a natural number greater than 1 that cannot be formed by multiplying two smaller natural numbers.

If you want to dig further more, please see [Prime Number](https://en.wikipedia.org/wiki/Prime_number).

#### How to tell if a number is prime?

Determine if the minimum factor is equal to itself. See [my implementation](/src/main/java/name/jacktang/projecteuler/util/MathUtil.java).

#### [Prime Number Sieve](https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes)

A prime number generator with $O(n log log n)$ complexity. Here's the steps:

1. Create a list of consecutive integers from 2 through n: $(2, 3, 4, ..., n)$.
2. Initially, let p equal 2, the smallest prime number.
3. Enumerate the multiples of p by counting in increments of p from 2p to n, and mark them in the list (these will be $2p, 3p, 4p, ...$; the p itself should not be marked).
4. Find the first number greater than p in the list that is not marked. If there was no such number, stop. Otherwise, let p now equal this new number (which is the next prime), and repeat from step 3.
5. When the algorithm terminates, the numbers remaining not marked in the list are all the primes below n.

See [my implementation](/src/main/java/name/jacktang/projecteuler/util/MathUtil.java).

### Palindromic Number

A palindromic number (also known as a numeral palindrome or a numeric palindrome) is a number that remains the same when its digits are reversed. Like 16461, for example, it is "symmetrical".

If you want to dig further more, please see [Palindromic Number](https://en.wikipedia.org/wiki/Palindromic_number).

#### How to tell if a number is palindromic?

Determine whether the first and last Numbers are the same one by one. See [my implementation](/src/main/java/name/jacktang/projecteuler/util/MathUtil.java).

### Pythagorean Theorem

In mathematics, the Pythagorean theorem, also known as Pythagoras' theorem, is a fundamental relation in Euclidean geometry among the three sides of a right triangle. It states that the area of the square whose side is the hypotenuse (the side opposite the right angle) is equal to the sum of the areas of the squares on the other two sides. This theorem can be written as an equation relating the lengths of the sides a, b and c, often called the "Pythagorean equation": $a^2 + b^2 = c^2$.

If you want to dig further more, please see [Pythagorean Theorem](https://en.wikipedia.org/wiki/Pythagorean_theorem).
