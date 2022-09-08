package mainjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	@FindBy(id="user-name")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement passWord;
	
	@FindBy(id="login-button")
	private WebElement btnLogin;
	
	@FindBy(xpath="//h4[text()='Accepted usernames are:']")
	private WebElement titlePage;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() {
		userName.sendKeys("standard_user");
		passWord.sendKeys("secret_sauce");
		btnLogin.click();
	}
	
	public String titlePage() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return titlePage.getText();
	}
	
	public String currentUrl() {
		return driver.getCurrentUrl();
	}

}





















