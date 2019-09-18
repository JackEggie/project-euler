## 语言

[English](README.md) | 简体中文

## [毕达哥拉斯三元组的一个特例](https://projecteuler.net/problem=9)

毕达哥拉斯三元组由三个自然数组成，对于 $a < b < c$，满足：

$$a^2 + b^2 = c^2$$

例如：$3^2 + 4^2 = 9 + 16 = 25 = 5^2$。

存在唯一一个毕达哥拉斯三元组满足条件 $a + b + c = 1000$。

求其积 $abc$。

## 解答

答案：31875000

```java
public class Solution {
	public long resolve() {
		for (long i = 1; i < 1000; i++) {
			for (long j = 1; j < 1000 - i; j++) {
				long base3 = 1000 - i - j;
				if (base3 * base3 == i * i + j * j) {
					return i * j * base3;
				}
			}
		}
		return 0;
	}
}
```

## 研讨

由于已知只存在唯一一组毕达哥拉斯三元组，因此直接从小到大计算同时满足毕达哥拉斯定理以及 $a + b + c = 1000$ 条件的三元组即可。
