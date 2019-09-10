package name.jacktang.projecteuler.test._1;

import name.jacktang.projecteuler._1.Solution;
import org.junit.Assert;
import org.junit.Test;

public class Validation {

	@Test
	public void validate() {
		Assert.assertEquals(233168, new Solution().resolve());
	}
}
