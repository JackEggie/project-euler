### 语言

[English](/README.md) | 简体中文

### 简介

本项目包含了我个人对[欧拉计划](https://projecteuler.net/)的翻译和解答。

> 本项目仅供个人学习交流使用。如果你发现任何不当行为，请立即[联系作者](mailto:er_tzw@163.com)或[举报](https://github.com/jackeggie/project-euler/issues/new)。

### 如何使用本项目

你可以在下面的表格中找到所有解答，但我不建议你直接抄答案！

本项目是一个 Maven 项目。代码中包含了用 Java 实现的解答步骤，项目中的测试用例可以直接运行。

### 题目列表

| 序号  | 标题                                                                   | 答案        | 性能        |
| ----- | --------------------------------------------------------------------- | ----------- | ----------- |
| 1     | [3 或 5 的倍数](/src/main/java/name/jacktang/projecteuler/_1)          | 233168      | 低于 10 ms  |
| 2     | [斐波那契数列中的偶数](/src/main/java/name/jacktang/projecteuler/_2)    | 4613732     | 低于 10 ms  |
| 3     | [最大质因数](/src/main/java/name/jacktang/projecteuler/_3)             | 6857        | 低于 10 ms  |
| 4     | [最大回文乘积](/src/main/java/name/jacktang/projecteuler/_4)           | 906609      | 低于 20 ms  |
| 5     | [最小公倍数](/src/main/java/name/jacktang/projecteuler/_5)             | 232792560   | 低于 10 ms  |
| 6     | [平方和与和平方之差](/src/main/java/name/jacktang/projecteuler/_6)      | 25164150    | 低于 10 ms  |
| 7     | [第 10001 个质数](/src/main/java/name/jacktang/projecteuler/_7)        | 104743      | 低于 5 s    |
| 8     | [数列中的最大乘积](/src/main/java/name/jacktang/projecteuler/_8)        | 23514624000 | 低于 10 ms  |

未完待续……

### 关于数学公式

请安装以下 [Chrome 浏览器插件](https://github.com/orsharir/github-mathjax)以保证项目中的 LaTeX 和 Mathjax 表达式正常显示。

### 知识储备

#### 因数

因数是一个常见的数学名词，用于描述非零整数 a 和整数 b 之间存在的整除关系，即 b 可以被 a 整除。这里我们称 b 是 a 的倍数， a 是 b 的因数、约数或因子。

1. 如何求因数

找出某数的最小因数，除之取其商。反复执行即可。参见[本项目实现](/src/main/java/name/jacktang/projecteuler/util/MathUtil.java)。

你也可以求助于[因数分解计算器](https://www.calculator.net/factor-calculator.html)。

2. [质因数分解](https://zh.wikipedia.org/wiki/%E7%AE%97%E6%9C%AF%E5%9F%BA%E6%9C%AC%E5%AE%9A%E7%90%86)

每个大于1的自然数，要么本身就是质数，要么可以写为2个或以上的质数的积，而且这些质因子按大小排列之后，写法仅有一种方式。

如果你对因数有更多的疑问，请参见[因数](https://zh.wikipedia.org/wiki/%E5%9B%A0%E6%95%B8)。

#### 质数

在大于 1 的自然数中，除了 1 和该数自身外，无法被其他自然数整除的数。

1. 如何判断一个数是否质数

判断最小因数是否自身相等。参见[本项目实现](/src/main/java/name/jacktang/projecteuler/util/MathUtil.java)。

如果你对质数有更多的疑问，请参见[质数](https://zh.wikipedia.org/wiki/%E7%B4%A0%E6%95%B0)。
