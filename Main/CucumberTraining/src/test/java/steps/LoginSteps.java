package steps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5) );

	@Given("User should navigate to the application")
	public void BookCart_application_login() {
		WebDriverManager.chromedriver().setup(); // Driver setup
		driver = new ChromeDriver();
		driver.get("https://bookcart.azurewebsites.net"); // Replace with actual URL
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());



	}
	
	@And("User clicks on the login link")
	public void BookCart_cick_login() {

		WebElement loginButton = driver.findElement(By.xpath("(//span[@class='mdc-button__label'][normalize-space()='Login'])[1]")); // Replace with actual ID or locator
		loginButton.click();
	}
	@And("^User enter the username as (.+)$")
	public void user_enter_the_username(String name) {
		System.out.println("Username passed from Examples: " + name);
		WebElement usernameField = driver.findElement(By.xpath("//input[@id='mat-input-0']")); // Replace with actual ID or locator
		usernameField.click();
		usernameField.sendKeys(name);
	}

	@And("^User enter the password (.+)$")
	public void user_enter_the_password(String password) {
		System.out.println("Password passed from Examples: " + password);
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='mat-input-1']")); // Replace with actual ID or locator
		passwordField.click();
		passwordField.sendKeys(password);
	}

	@When("User click on the login button to bookcart")
	public void user_click_login_button2() {
		WebElement submitButton = driver.findElement(By.xpath("(//button[@class='mdc-button mdc-button--raised mat-mdc-raised-button mat-primary mat-mdc-button-base'])[1]")); // Replace with actual ID or locator
		submitButton.click();

	}
	@Then("User login successfully")
	public void user_login_successfully() {
		WebElement LoginVisible = driver.findElement(By.xpath("(//span[@class='mat-mdc-button-touch-target'])[4]"));
		WebElement Visible =  wait.until(ExpectedConditions.visibilityOf(LoginVisible));
		Assert.assertTrue(Visible.isDisplayed());
		driver.close();
	}
	//----------------------
	 @Given("User enter the username {string}")
	 public void user_enter_the_username2(String name) {
		 System.out.println("Username passed from Examples: " + name);
	     WebElement usernameField = driver.findElement(By.xpath("//input[@id='mat-input-0']")); // Replace with actual ID or locator
	     usernameField.click();
	     usernameField.sendKeys(name);
	 }


	 @Given("User enter the password as kyoshik")
	 public void user_enter_the_password2(String password) {
	     System.out.println("Password passed from Examples: " + password);
	     WebElement passwordField = driver.findElement(By.xpath("//input[@id='mat-input-1']")); // Replace with actual ID or locator
	     passwordField.click();
	     passwordField.sendKeys(password);
	 }

	 @When("User click on the login button")
	 public void user_click_login_button1() {
	     WebElement submitButton = driver.findElement(By.xpath("(//button[@class='mdc-button mdc-button--raised mat-mdc-raised-button mat-primary mat-mdc-button-base'])[1]")); // Replace with actual ID or locator
	     submitButton.click();
	  
	 }

		@But("User login must failed")
		public void user_login_must_failed() throws InterruptedException {
			Thread.sleep(2000);
			WebElement FailedValidation = driver.findElement(By.xpath("//mat-error[@id='mat-mdc-error-0']"));
			Assert.assertEquals(FailedValidation.getText(), "Username or Password is incorrect.");
			driver.close();
		}
	
	
}
