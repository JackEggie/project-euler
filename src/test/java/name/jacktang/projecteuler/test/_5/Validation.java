package name.jacktang.projecteuler.test._5;

import name.jacktang.projecteuler._5.Solution;
import org.junit.Assert;
import org.junit.Test;

public class Validation {

	@Test
	public void validate() {
		Assert.assertEquals(new Solution().resolve(), 232792560);
	}
}
