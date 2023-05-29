package junit_framework;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnit_annotations {
	@BeforeClass
	public static void singleBefore() {
		System.out.println("before test single time");
	}

	@Before
	public void beforeTest() {
		System.out.println("method ruuning before test");
	}

	@Test
	public void test1() {
		System.out.println("running test 1");
	}

	@Test
	public void test2() {
		System.out.println("running test 2");
	}

	@Test
	public void test3() {
		System.out.println("running test 3");
	}

	@Test
	public void test4() {
		System.out.println("running test 4");
	}

	@After
	public void afterTest() {
		System.out.println("method running after test");
	}

	@AfterClass
	public static void singleAfter() {
		System.out.println("after test single time");
	}
}
