package name.jacktang.projecteuler.test._4;

import name.jacktang.projecteuler._4.Solution;
import org.junit.Assert;
import org.junit.Test;

public class Validation {

	@Test
	public void validate() {
		Assert.assertEquals(new Solution().resolve(), 906609);
	}
}
