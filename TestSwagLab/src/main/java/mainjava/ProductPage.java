package mainjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends BaseClass {
	
	@FindBy(css=".title")
	WebElement title;
	
	@FindBy(id="react-burger-menu-btn")
	WebElement elipsis;
	
	@FindBy(id="react-burger-cross-btn")
	WebElement cross;
	
	@FindBy(css = ".product_sort_container")
	WebElement filter;
	
	@FindBy(xpath="//div[text()='Sauce Labs Bike Light']")
	WebElement product;
	
	public ProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public String titlePage() {
		return title.getText();
	}
	
	public void clickElipsis() {
		elipsis.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		cross.click();
	}
	
	public void filter() {
		filter.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Select selFilter = new Select(filter);
		selFilter.selectByValue("za");
	}
	
	
	public void selectProduct() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		product.click();
	}

}
