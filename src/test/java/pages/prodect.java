package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class prodect {
	
	WebDriver driver;
	
	
	WebElement product;
	
	private static final String USER_XPATH ="//div[@class='inventory_item_name' and text()='%s']"
			+ "//ancestor::div[@class='inventory_item_label']//following-sibling::div[@class='pricebar']"
			+ "//child::button";
	

	 public void prodect(String prodctName) {
	      String fullXpath = String.format(USER_XPATH, prodctName);
	      WebElement findElement = driver.findElement(By.xpath(fullXpath));
	      findElement.click();
	    }
	 
	 @FindBy(xpath="//a[@class=\"shopping_cart_link\"]")
	 WebElement btn_cart;
	 
	 public void cart() {
		btn_cart.click();
	}
	 
	 public prodect(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	 
}
