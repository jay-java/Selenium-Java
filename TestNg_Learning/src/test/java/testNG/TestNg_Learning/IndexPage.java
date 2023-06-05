package testNG.TestNg_Learning;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IndexPage {
	
	@Test(priority = 2,groups = "purchase",expectedExceptions = Exception.class)
	public void login() {
		System.out.println("login method");
	}
	@Test(priority = 1,groups = "smoke")
	public void register() {
		System.out.println("register method");
	}
	@Test(priority = 3)
	public void logout() {
		System.out.println("logout method");
	}
//	@BeforeTest
	@BeforeMethod
	public void beforeTest() {
		System.out.println("method called before evry test");
	}
//	@AfterTest
	@AfterMethod
	public void afterTest() {
		System.out.println("method called after evry test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("test method before class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("test method after class");
	}
}
