package StepDiffenation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.login;
import pages.prodect;

public class LoginSteps {
	WebDriver driver;

	@When("Browser Configuration")
	public void browser_Configuration() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);

	}

	@Then("Check the {string} and {string}")
	public void check_the_and(String string, String string2) throws Exception {
		login loginPage = new login(driver);
		loginPage.username(string);
		loginPage.Password(string2);
		loginPage.btn_login();
		Thread.sleep(1500);
	}

	@And("To check whether the page login or not")
	public void to_check_whether_the_page_login_or_not() {
		// boolean text_From_Home =
		// driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).isDisplayed();
		// Assert.assertEquals(true, text_From_Home);

		try {
			WebElement element_Home = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
			System.out.println("Valid user Credential");
			driver.quit();
		} catch (NoSuchElementException e) {
			System.out.println("invalid user Credential");
			driver.quit();
			throw new io.cucumber.tagexpressions.TagExpressionException("The Invalid credential", null);
		}

	}

	@When("login the browser {string} and {string}")
	public void login_the_browser_and(String string, String string2) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		login loginPage = new login(driver);
		loginPage.username(string);
		loginPage.Password(string2);
		loginPage.btn_login();
		
	}
	
	@Then("Check the product list in the {string}")
	public void check_the_product_list_in_the(String string) {
		prodect prodPage = new prodect(driver);
		prodPage.prodect(string);
		prodPage.cart();
		
	}

	@Then("Check the product added in the card")
	public void check_the_product_added_in_the_card() {
		try {
			WebElement element_Card = driver.findElement(By.xpath("//div[@class=\"cart_desc_label\"]"));
			System.out.println("Product Moved to Card");
			driver.quit();
		} catch (NoSuchElementException e) {
			System.out.println("Doesn't prod added in the Card");
			driver.quit();
			throw new io.cucumber.tagexpressions.TagExpressionException("Prod not added", null);
		}
	}

}
