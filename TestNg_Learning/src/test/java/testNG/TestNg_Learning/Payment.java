package testNG.TestNg_Learning;

import org.testng.annotations.Test;

public class Payment {
	@Test(groups = "purchase")
	public void creditCard() {
		System.out.println("pay by credit card");
	}
	@Test(groups = "smokes")
	public void debitCard() {
		System.out.println("pay by debit card");
	}
	@Test
	public void COD() {
		System.out.println("pay by COD");
	}
}
