package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {
	
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@name=\"firstName\"]")
	WebElement txt_fullname;
	
	public void fullName(String first) {
		txt_fullname.sendKeys(first);
	}
	
	@FindBy(xpath = "//input[@name=\"lastName\"]")
	WebElement txt_lastName;
	
	public void lastName(String last) {
		txt_lastName.sendKeys(last);
	}
	
	@FindBy(xpath = "//input[@name=\"postalCode\"]")
	WebElement txt_postalCode;
	
	public void postalCode(String code) {
		txt_postalCode.sendKeys(code);
	}

	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement btn_submit;
	
	public void btn_Continue() {
		btn_submit.click();

	}

	@FindBy(xpath = "//button[@name=\"cancel\"]")
	WebElement cancel;
	
	public void btn_cancel() {
		btn_submit.click();

	}
	
	public CheckOut(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
