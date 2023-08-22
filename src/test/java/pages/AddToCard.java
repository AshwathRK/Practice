package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCard {
	
	WebDriver driver;
	
WebElement product;
	
	private static final String USER_XPATH ="//div[@class=\"cart_item\"]//child::div[text()=%s]"
			+ "//parent::a//following-sibling::div[@class=\"item_pricebar\"]//child::button";
	

	 public void myMethod(String remove_prodctName) {
	      String fullXpath = String.format(USER_XPATH, remove_prodctName);
	      driver.findElement(By.xpath(fullXpath)).click();
	    }
	 @FindBy(xpath = "//button[@name=\"continue-shopping\"]")
	 WebElement btn_ContinueShopping;
	 
	 public void continueShopping() {
		btn_ContinueShopping.click();
	}
	 
	 @FindBy(xpath = "//button[@name=\"checkout\"]]")
	 WebElement btn_Checkout;
	 
	 public void checkout() {
		 btn_Checkout.click();
	 }
	 
	 
	 public AddToCard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
