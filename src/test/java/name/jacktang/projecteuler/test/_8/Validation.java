package name.jacktang.projecteuler.test._8;

import name.jacktang.projecteuler._8.Solution;
import org.junit.Assert;
import org.junit.Test;

public class Validation {

	@Test
	public void validate() {
		Assert.assertEquals(23514624000L, new Solution().resolve());
	}
}
