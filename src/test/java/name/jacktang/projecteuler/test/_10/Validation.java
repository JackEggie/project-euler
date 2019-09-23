package name.jacktang.projecteuler.test._10;

import name.jacktang.projecteuler._10.Solution;
import org.junit.Assert;
import org.junit.Test;

public class Validation {

	@Test
	public void validate() {
		Assert.assertEquals(142913828922L, new Solution().resolve());
	}
}
