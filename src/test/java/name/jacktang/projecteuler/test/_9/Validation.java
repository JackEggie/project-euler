package name.jacktang.projecteuler.test._9;

import name.jacktang.projecteuler._9.Solution;
import org.junit.Assert;
import org.junit.Test;

public class Validation {

	@Test
	public void validate() {
		Assert.assertEquals(31875000L, new Solution().resolve());
	}
}
