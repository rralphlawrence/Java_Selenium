package InputForms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapModal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver ();
		 driver.manage().window().maximize();
		 
	 
		 /*  Bootstrap Modal **/
		 driver.get("https://demo.seleniumeasy.com/");
		 
		
		/*  SINGLE MODALS */
		 	Thread.sleep(2000);
		 	driver.findElement(By.xpath("(//li[@class='dropdown'])[5]")).click();
			driver.findElement(By.xpath("//li[@class='dropdown open']//li[2]")).click();
//			
//			var modalButton1 = driver.findElement(By.xpath("(//a[@class='btn btn-primary'][normalize-space()='Launch modal'])[1]"));
//			modalButton1.click();
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); 
//			WebElement modalContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='myModal0']//div[@class='modal-content']")));
//			WebElement modalContentBody = modalContainer.findElement(By.xpath(".//div[@class='modal-body']"));
//			Assert.assertEquals("This is the place where the content for the modal dialog displays", modalContentBody.getText());
//			System.out.println(driver.findElement(By.xpath(".//div[@class='modal-body']")).getText());
//			WebElement modalSavebutton = modalContainer.findElement(By.xpath("(//a[@class='btn btn-primary'][normalize-space()='Save changes'])[1]"));
//			modalSavebutton.click();
//			
			/*MULTIPLE MODALS*/
		 
		 	var modalButton2 = driver.findElement(By.xpath("//a[@href='#myModal']"));
		 	modalButton2.click();
		 	WebDriverWait holdBack = new WebDriverWait(driver, Duration.ofSeconds(5)); 
		 	WebElement modalBody = holdBack.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='myModal']//div[@class='modal-content']")));
		 	
		 	WebElement modalBodyContent = modalBody.findElement(By.xpath("//div[@id='myModal']//div[@class='modal-body']"));
		 	Assert.assertTrue(modalBodyContent.getText().contains("Click launch modal button to launch second modal."));
		 	System.out.println(modalBodyContent.getText());
		 	
		 	var secondLunch = modalBodyContent.findElement(By.xpath("(//a[@class='btn btn-primary'][normalize-space()='Launch modal'])[3]"));
		 	secondLunch.click();
		 	
		 	WebElement secondModalContainer = holdBack.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='myModal2']//div[@class='modal-content']")));
			WebElement secondModalContent = secondModalContainer.findElement(By.xpath("//div[@id='myModal2']//div[@class='modal-body']"));
			Assert.assertTrue(secondModalContent.getText().contains("This is the place where the content for the modal dialog displays."));
			System.out.println(secondModalContent.getText());
			
			WebElement secondModalButton = secondModalContainer.findElement(By.xpath("(//a[@class='btn btn-primary'][normalize-space()='Save changes'])[3]"));
			secondModalButton.click();
			
			
	}

}
