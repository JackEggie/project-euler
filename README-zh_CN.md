## 语言

[English](/README.md) | 简体中文

## 简介

本项目包含了我个人对[欧拉计划](https://projecteuler.net/)的翻译和解答。

> 本项目仅供个人学习交流使用。如果你发现任何不当行为，请立即[联系作者](mailto:er_tzw@163.com)或[举报](https://github.com/jackeggie/project-euler/issues/new)。

## 如何使用本项目

你可以在下面的表格中找到所有解答，但我不建议你直接抄答案！

本项目是一个 Maven 项目。代码中包含了用 Java 实现的解答步骤，项目中的测试用例可以直接运行。

## 关于数学公式

请安装以下 [Chrome 浏览器插件](https://github.com/orsharir/github-mathjax)以保证项目中的 LaTeX 和 Mathjax 表达式正常显示。

## 题目列表

| 序号  | 标题                                                                                     | 答案         | 性能        |
| ----- | --------------------------------------------------------------------------------------- | ------------ | ----------- |
| 1     | [3 或 5 的倍数](/src/main/java/name/jacktang/projecteuler/_1/README-zh_CN.md)            | 233168       | 低于 10 ms  |
| 2     | [斐波那契数列中的偶数](/src/main/java/name/jacktang/projecteuler/_2/README-zh_CN.md)      | 4613732      | 低于 10 ms  |
| 3     | [最大质因数](/src/main/java/name/jacktang/projecteuler/_3/README-zh_CN.md)               | 6857         | 低于 10 ms  |
| 4     | [最大回文乘积](/src/main/java/name/jacktang/projecteuler/_4/README-zh_CN.md)             | 906609       | 低于 20 ms  |
| 5     | [最小公倍数](/src/main/java/name/jacktang/projecteuler/_5/README-zh_CN.md)               | 232792560    | 低于 10 ms  |
| 6     | [平方和与和平方之差](/src/main/java/name/jacktang/projecteuler/_6/README-zh_CN.md)        | 25164150     | 低于 10 ms  |
| 7     | [第 10001 个质数](/src/main/java/name/jacktang/projecteuler/_7/README-zh_CN.md)          | 104743       | 低于 5 s    |
| 8     | [数列中的最大乘积](/src/main/java/name/jacktang/projecteuler/_8/README-zh_CN.md)          | 23514624000  | 低于 10 ms  |
| 9     | [毕达哥拉斯三元组的一个特例](/src/main/java/name/jacktang/projecteuler/_9/README-zh_CN.md) | 31875000     | 低于 10 ms  |
| 10    | [质数的和](/src/main/java/name/jacktang/projecteuler/_10/README-zh_CN.md)                | 142913828922 | 低于 50 ms  |

未完待续……

## 知识储备

### 因数

因数是一个常见的数学名词，用于描述非零整数 a 和整数 b 之间存在的整除关系，即 b 可以被 a 整除。这里我们称 b 是 a 的倍数， a 是 b 的因数、约数或因子。

如果你对因数有更多的疑问，请参见[因数](https://zh.wikipedia.org/wiki/%E5%9B%A0%E6%95%B8)。

#### 如何求因数

找出某数的最小因数，除之取其商。反复执行即可。参见[本项目实现](/src/main/java/name/jacktang/projecteuler/util/MathUtil.java)。

你也可以求助于[因数分解计算器](https://www.calculator.net/factor-calculator.html)。

#### [质因数分解](https://zh.wikipedia.org/wiki/%E7%AE%97%E6%9C%AF%E5%9F%BA%E6%9C%AC%E5%AE%9A%E7%90%86)

每个大于1的自然数，要么本身就是质数，要么可以写为2个或以上的质数的积，而且这些质因子按大小排列之后，写法仅有一种方式。

### 质数

在大于 1 的自然数中，除了 1 和该数自身外，无法被其他自然数整除的数。

如果你对质数有更多的疑问，请参见[质数](https://zh.wikipedia.org/wiki/%E7%B4%A0%E6%95%B0)。

#### 如何判断一个数是否质数

判断最小因数是否等与自身。参见[本项目实现](/src/main/java/name/jacktang/projecteuler/util/MathUtil.java)。

#### [质数筛](https://zh.wikipedia.org/wiki/%E5%9F%83%E6%8B%89%E6%89%98%E6%96%AF%E7%89%B9%E5%B0%BC%E7%AD%9B%E6%B3%95)

质数筛是一种复杂度为 $O(n log log n)$ 的质数生成算法。其步骤如下：

1. 创建一个 2 到 n 的自然数列：$(2, 3, 4, ..., n)$。
2. 将 p 初始化为 2，即最小的质数。
3. 将数列中所有 p 的倍数都标记为非质数（除了 p 本身）。
4. 将 p 置为数列中第一个大于 p 的未被标记的值，即下一个质数。然后重复步骤 3，直到全部数字都被标记为止。
5. 当上面的循环终止时，如果数列中还存在没有被标记的数字，那么它们都是质数。

参见[本项目实现](/src/main/java/name/jacktang/projecteuler/util/MathUtil.java)。

### 回文数

回文数或迴文数是指一个像 14641 这样“对称”的数，即：将这个数的数字按相反的顺序重新排列后，所得到的数和原来的数一样。

如果你对回文数有更多的疑问，请参见[回文数](https://zh.wikipedia.org/wiki/%E5%9B%9E%E6%96%87%E6%95%B0)。

#### 如何判断一个数是否回文

依次判断首尾数字是否相同。参见[本项目实现](/src/main/java/name/jacktang/projecteuler/util/MathUtil.java)。

### 毕达哥拉斯定理

勾股定理，又称毕达哥拉斯定理、商高定理、新娘座椅定理、百牛定理，是平面几何中一个基本而重要的定理。勾股定理说明，平面上的直角三角形的两条直角边的长度（古称勾长、股长）的平方和等于斜边长（古称弦长）的平方。反之，若平面上三角形中两边长的平方和等于第三边边长的平方，则它是直角三角形（直角所对的边是第三边）。

如果你对毕达哥拉斯定理有更多的疑问，请参见[毕达哥拉斯定理](https://zh.wikipedia.org/wiki/%E5%8B%BE%E8%82%A1%E5%AE%9A%E7%90%86)。
