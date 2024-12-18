package SeleniumJavaPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumJava.AbstractComponents.ReusableComponent;

import SeleniumJava.pageobjects.Progressbar;

public class ProgressbarPage extends ReusableComponent{ 
	

	@BeforeTest
	 public void gotoWebsites()  {
		 gotoWebsite();
		
	 }
	 
	 @Test
	 public void  ProgressbarDemo() {
		 try {
		 
			 Progressbar progress = new Progressbar(driver); // Click the preferred class from navigation menu
			 progress.dropDownProgressBar.click(); // Click the preferred class from navigation menu
			 TwosecondsSleep();
			 progress.progressBarDropdown.click();
		 	 progress.clickDownload.click();
		 	
				
		 	 waitForProgressBar(driver,100);// wait sa progress bar to 100 percent and declating targetProgress text
		 	 
		        // Perform actions after the progress is complete
		        String progressBarActualTitle = driver.findElement(By.cssSelector(".percenttext")).getText(); //getting text from the actual percentage
		    	String progressBarExpectedTitle = "100%"; //expected text
		    	Assert.assertEquals(progressBarActualTitle, progressBarExpectedTitle);
		        System.out.println("Download complete!");
		        
		       
		        ThreesecondsSleep();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Error");
			}
		}
		
	 
	 	//Driver wait with Integer declaration to pass the value to the By locator
		public void waitForProgressBar(WebDriver driver,int targetProgress) {
	   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30) ); // Set mo ilang seconds gusto mo
	       By progressBarLocator = By.xpath("//div[@class='percenttext' and contains(text(), '" + targetProgress + "%')]"); // 

	       // Wait until the progress bar reaches the target progress
	       wait.until(ExpectedConditions.visibilityOfElementLocated(progressBarLocator));
	   }
	

	 
	 @AfterTest
	 public void closeDriver() {
		 driver.close();
	 }
}
