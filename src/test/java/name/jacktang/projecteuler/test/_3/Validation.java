package name.jacktang.projecteuler.test._3;

import name.jacktang.projecteuler._3.Solution;
import org.junit.Assert;
import org.junit.Test;

public class Validation {

	@Test
	public void validate() {
		Assert.assertEquals(new Solution().resolve(), 6857);
	}
}