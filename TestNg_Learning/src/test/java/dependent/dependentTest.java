package dependent;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class dependentTest {
	@Test
	public void test1() {
		System.out.println("test 1 running");
		assertFalse(true);
	}
	@Test(dependsOnMethods = "test1")
	public void test2() {
		System.out.println("test 2 running");
	}
}
