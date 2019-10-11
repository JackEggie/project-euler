package name.jacktang.projecteuler.test;

import org.junit.Assert;
import org.junit.Test;

public class Validation {

	@Test
	public void validate1() {
		Assert.assertEquals(233168L, new name.jacktang.projecteuler._1.Solution().resolve());
	}

	@Test
	public void validate2() {
		Assert.assertEquals(4613732L, new name.jacktang.projecteuler._2.Solution().resolve());
	}

	@Test
	public void validate3() {
		Assert.assertEquals(6857L, new name.jacktang.projecteuler._3.Solution().resolve());
	}

	@Test
	public void validate4() {
		Assert.assertEquals(906609L, new name.jacktang.projecteuler._4.Solution().resolve());
	}

	@Test
	public void validate5() {
		Assert.assertEquals(232792560L, new name.jacktang.projecteuler._5.Solution().resolve());
	}

	@Test
	public void validate6() {
		Assert.assertEquals(25164150L, new name.jacktang.projecteuler._6.Solution().resolve());
	}

	@Test
	public void validate7() {
		Assert.assertEquals(104743L, new name.jacktang.projecteuler._7.Solution().resolve());
	}

	@Test
	public void validate8() {
		Assert.assertEquals(23514624000L, new name.jacktang.projecteuler._8.Solution().resolve());
	}

	@Test
	public void validate9() {
		Assert.assertEquals(31875000L, new name.jacktang.projecteuler._9.Solution().resolve());
	}

	/**
	 * performance warning: about 30 min
	 */
	@Test
	public void validate10_1() {
		Assert.assertEquals(142913828922L, new name.jacktang.projecteuler._10.Solution().resolve1());
	}

	@Test
	public void validate10_2() {
		Assert.assertEquals(142913828922L, new name.jacktang.projecteuler._10.Solution().resolve2());
	}

	@Test
	public void validate11() {
		Assert.assertEquals(70600674L, new name.jacktang.projecteuler._11.Solution().resolve());
	}

	@Test
	public void validate12() {
		Assert.assertEquals(76576500L, new name.jacktang.projecteuler._12.Solution().resolve());
	}
}
