package testNG.TestNg_Learning;

import static org.testng.Assert.assertTrue;

import java.io.File;

public class gertresource {
	public static void main(String[] args) {
		String path = "src/test/resources";

		File file = new File(path);
		String absolutePath = file.getAbsolutePath();

		System.out.println(absolutePath);

		assertTrue(absolutePath.endsWith("src/test/resources"));
	}
}
