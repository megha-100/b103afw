package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;

public class TC3 extends BaseTest
{
	@Test
	public void test2()
	{
		test.info(driver.getTitle());
	}
}
