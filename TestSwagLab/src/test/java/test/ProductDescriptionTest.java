package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductDescriptionTest extends BaseTest {
	
	@BeforeClass
	public void login() {
		loginPage.loginMethod();
	}
	
	@Test(priority=8)
	public void verifyBackToProduct() {
		productPage.selectProduct();
		AssertJUnit.assertEquals(productDescriptionPage.getBackProduct(), "BACK TO PRODUCTS");
	}
	
	@Test(priority=9)
	public void verifyAddToCart() {
		productDescriptionPage.addToCart();
	}

}
