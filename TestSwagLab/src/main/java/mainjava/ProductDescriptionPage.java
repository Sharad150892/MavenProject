package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDescriptionPage extends BaseClass {
	
	@FindBy(xpath="//*[text()='Back to products']")
	WebElement backProduct;
	
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	WebElement addCart;
	
	public ProductDescriptionPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getBackProduct() {
		return backProduct.getText();
	}
	
	public void addToCart() {
		addCart.click();
	}
}
