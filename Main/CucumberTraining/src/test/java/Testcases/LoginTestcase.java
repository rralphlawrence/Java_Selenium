package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class LoginTestcase {
	WebDriver driver;
	 
	
    public void I_landed_on_ecommerce_Page() {
        // Set up the driver and navigate to the application
		WebDriverManager.chromedriver().setup(); //Driver setup
		 driver = new ChromeDriver();
        driver.get("https://bookcart.azurewebsites.net"); // Replace with actual URL
        Options manage = driver.manage();
        manage.timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
    }
	
    public void userClicksOnTheLoginButton() {
        // Locate and click the login button
        WebElement loginButton = driver.findElement(By.xpath("//span[normalize-space()='Login']")); // Replace with actual ID or locator
        loginButton.click();
        
    }

  
    public void user_Enter_username() {
        // Locate the username field and enter the username
    	 WebElement usernamefield = driver.findElement(By.xpath("//input[@id='mat-input-0']")); // Replace with actual ID or locator
    	 usernamefield.click();
    	 usernamefield.sendKeys("ortoni");
    	    }

    
    public void user_Enter_password() {
        // Locate the password field and enter the password
        WebElement passwordField = driver.findElement(By.xpath("(//input[@id='mat-input-1'])[1]")); // Replace with actual ID or locator
        passwordField.click();
        passwordField.sendKeys("pass1234");
        
    }
   
    public void user_enter_login() {
        // Locate and click the login button
        WebElement submitButton = driver.findElement(By.xpath("(//button[@class='mdc-button mdc-button--raised mat-mdc-raised-button mat-primary mat-mdc-button-base'])[1]")); // Replace with actual ID or locator
        submitButton.click();
        driver.close();
    }
}
