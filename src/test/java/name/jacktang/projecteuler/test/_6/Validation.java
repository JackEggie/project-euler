package name.jacktang.projecteuler.test._6;

import name.jacktang.projecteuler._6.Solution;
import org.junit.Assert;
import org.junit.Test;

public class Validation {

	@Test
	public void validate() {
		Assert.assertEquals(new Solution().resolve(), 25164150);
	}
}
