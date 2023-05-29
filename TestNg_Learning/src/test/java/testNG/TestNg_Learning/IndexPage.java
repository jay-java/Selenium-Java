package testNG.TestNg_Learning;

import org.testng.annotations.Test;

public class IndexPage {
	
	@Test(priority = 2,groups = "purchase")
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
}
