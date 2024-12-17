package steps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCartSteps {

	 WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5) );

	@Given("User should navigate to the application login")
	 public void I_landed_on_ecommerce_Page() {
		 WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://bookcart.azurewebsites.net"); // Replace with actual URL
	     driver.manage().window().maximize();
	     System.out.println(driver.getTitle());
	}
	
	@And("User clicks on the login")
	public void userClicksOnTheLoginLink() {
		WebElement loginButton = driver.findElement(By.xpath("(//span[@class='mdc-button__label'][normalize-space()='Login'])[1]")); // Replace with actual ID or locator
		loginButton.click();
	 }
	


	@And("^user login into the application with (.+) and (.+)")
	public void user_enter_the_application(String Uname, String pass) {
		System.out.println("Username passed from Examples: " + Uname);
		WebElement Userfield = driver.findElement(By.xpath("//input[@id='mat-input-0']")); // Replace with actual ID or locator
		Userfield.click();
		Userfield.sendKeys(Uname);
		System.out.println("Password passed from Examples: " + pass);
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='mat-input-1']")); // Replace with actual ID or locator
		passwordField.click();
		passwordField.sendKeys(pass);
	}
	
	@Given("^user search for a book (.+)$")
	public void user_search_for_a_book(String book) throws InterruptedException {
		WebElement submitButton = driver.findElement(By.xpath("(//button[@class='mdc-button mdc-button--raised mat-mdc-raised-button mat-primary mat-mdc-button-base'])[1]")); // Replace with actual ID or locator
		submitButton.click();
		Thread.sleep(2000);
		WebElement searchBook = driver.findElement(By.xpath("//input[@placeholder='Search books or authors']"));
		searchBook.sendKeys(book);
		WebElement searchClick = driver.findElement(By.xpath("(//div[@id='mat-autocomplete-0'])[1]"));
		searchClick.click();
		
	}
	@When("user add the book to the cart")
	public void user_add_the_book_to_the_cart() {
		WebElement BtnaddCart = driver.findElement(By.xpath("(//span[normalize-space()='Add to Cart'])[1]"));
		BtnaddCart.click();
	 
	}
	@Then("the cart badge should be updated")
	public void the_cart_badge_should_be_updated() throws InterruptedException {
		
	
		WebElement ShoppingBadge = driver.findElement(By.xpath("//span[@id='mat-badge-content-0']"));
		String text = ShoppingBadge.getText();
		Thread.sleep(2000);
		Assert.assertEquals(Integer.parseInt(text)>0, true);
		 driver.quit();
	}


}
