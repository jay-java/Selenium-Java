package junit_framework;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import basic.Addition;

public class J_001_Addition {
	@Test
	public void testAddition() {
//		Addition a = new Addition();
//		int actual = a.add(10,20);
//		int expected = 40;
//		assertEquals(expected, actual);
//		assertTrue(true);
//		assertNull(123);
		int a[] = {10,20,30,40,50};
		int b[]  = {10,20,30,40,50};
		assertArrayEquals(a, b);
	}
}
