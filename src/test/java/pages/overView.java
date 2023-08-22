package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class overView {
	
	WebDriver driver;
	
	@FindBy(xpath = "//button[@name=\"finish\"]")
	WebElement confiremOrder;
	
	public void fullName() {
		confiremOrder.click();
	}

	@FindBy (id="cancel")
	WebElement cancel;
	
	public void cancelOverView() {
		cancel.click();

	}

	public overView(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
