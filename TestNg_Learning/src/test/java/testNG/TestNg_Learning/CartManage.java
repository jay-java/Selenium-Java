package testNG.TestNg_Learning;

import org.testng.annotations.Test;

public class CartManage {
	@Test(groups = {"purchase","smoke"})
	public void addtocart() {
		System.out.println("product added to cart");
	}

	@Test
	public void removefromCart() {
		System.out.println("product remove to cart");
	}

	@Test
	public void editcart() {
		System.out.println("product edit to cart");
	}

}
