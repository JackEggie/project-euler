package name.jacktang.projecteuler.test._10;

import name.jacktang.projecteuler._10.Solution;
import org.junit.Assert;
import org.junit.Test;

public class Validation {

	/**
	 * performance: less than 30 min
	 */
	@Test
	public void validate1() {
		Assert.assertEquals(142913828922L, new Solution().resolve1());
	}

	@Test
	public void validate2() {
		Assert.assertEquals(142913828922L, new Solution().resolve2());
	}
}
