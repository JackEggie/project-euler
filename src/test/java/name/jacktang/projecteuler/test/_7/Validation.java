package name.jacktang.projecteuler.test._7;

import name.jacktang.projecteuler._7.Solution;
import org.junit.Assert;
import org.junit.Test;

public class Validation {

	@Test
	public void validate() {
		Assert.assertEquals(104743, new Solution().resolve());
	}
}
