package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.BaseClass;
import mainjava.LoginPage;
import mainjava.ProductDescriptionPage;
import mainjava.ProductPage;

public class BaseTest extends BaseClass {
	
	@BeforeClass
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@BeforeClass
	public void pageObject() {
		loginPage = new LoginPage(driver);
		productPage = new ProductPage(driver);
		productDescriptionPage = new ProductDescriptionPage(driver);
	}
	
	@AfterClass
	public void tearDownEnvironment() {
		driver.quit();
	}

}
