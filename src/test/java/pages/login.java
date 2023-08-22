package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	WebDriver driver;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement username_locat;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password_locat;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement login_locat;
	

	public void username(String username) {
		username_locat.sendKeys(username);
	}
	
	public void Password(String password) {
		password_locat.sendKeys(password);
	}
	
	public void btn_login() {
		login_locat.click();
	}
	
	public login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
}
