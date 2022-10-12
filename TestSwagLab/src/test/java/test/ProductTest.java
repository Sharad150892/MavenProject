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
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
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

public class ProductTest extends BaseTest {
	
	@BeforeClass
	public void login() {
		loginPage.loginMethod();
	}
	
	@Test(priority=4)
	public void verifyTitleofPage() {
		AssertJUnit.assertEquals(productPage.titlePage(), "PRODUCTS");
	}
	
	@Test(priority=5)
	public void verifyElipsis() {
		productPage.clickElipsis();
	}
	@Test(priority=6)
	public void verifyFilter() {
		productPage.filter();
	}
	@Test(priority=7)
	public void verifyProductSelection() {
		productPage.selectProduct();
		AssertJUnit.assertEquals(productDescriptionPage.getBackProduct(), "BACK TO PRODUCTS");
	}
}
