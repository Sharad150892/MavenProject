package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	@Test(priority=1)
	public void verifyUrl() {
		AssertJUnit.assertEquals(loginPage.currentUrl(),"https://www.saucedemo.com/");
		
	}
	
	@Test(priority=2)
	public void verifyTitle() {
		AssertJUnit.assertEquals(loginPage.titlePage(),"Accepted usernames are:");
	}
	
	@Test(priority=3)
	public void verifyLoginPage() {
		loginPage.loginMethod();
		AssertJUnit.assertEquals(productPage.titlePage(), "PRODUCTS");
	}
}
