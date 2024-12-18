package InputForms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProgressBar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver ();
		 driver.manage().window().maximize();
		 
	 
		 /*  FOR THE SIMPLE FORM **/
		 driver.get("https://demo.seleniumeasy.com/");
		 
		
		
		 	Thread.sleep(2000);
		 	driver.findElement(By.xpath("(//li[@class='dropdown'])[4]")).click();
		 	driver.findElement(By.xpath("//li[@class='dropdown open']//li[2]")).click();
		 	driver.findElement(By.xpath("//button[@id='cricle-btn']")).click();
		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); 
		 	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".circle")));
			Thread.sleep(25000);
			System.out.println("The download Percentage is: "+ driver.findElement(By.cssSelector(".percenttext")).getText());
			
			String progressBarActualTitle = driver.findElement(By.cssSelector(".percenttext")).getText();
			String progressBarExpectedTitle = "100%";
			Assert.assertEquals(progressBarActualTitle, progressBarExpectedTitle);

 }
		 
		 
	

}
