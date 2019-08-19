package name.jacktang.projecteuler.test._2;

import name.jacktang.projecteuler._2.Solution;
import org.junit.Assert;
import org.junit.Test;

public class Validation {

	@Test
	public void validate() {
		Assert.assertEquals(new Solution().resolve(), 4613732);
	}
}
