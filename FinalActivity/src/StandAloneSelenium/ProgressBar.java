package StandAloneSelenium;

import java.time.Duration;


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
		 driver.get("http://demo.seleniumeasy.com/bootstrap-download-progress-demo.html");

	        // Find and click the "Download" button to start the progress
	        WebElement downloadButton = driver.findElement(By.id("cricle-btn"));
	        downloadButton.click();

	        // Wait for the progress to reach 100%
	        waitForProgressBar(driver, 100);

	        // Perform actions after the progress is complete
	        String progressBarActualTitle = driver.findElement(By.cssSelector(".percenttext")).getText();
	    	String progressBarExpectedTitle = "100%";
	    	Assert.assertEquals(progressBarActualTitle, progressBarExpectedTitle);
	        System.out.println("Download complete!");

	        // Close the browser
	        driver.quit();
	    }

	    private static void waitForProgressBar(WebDriver driver, int targetProgress) {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30) ); // Set your desired timeout
	        By progressBarLocator = By.xpath("//div[@class='percenttext' and contains(text(), '" + targetProgress + "%')]");

	        // Wait until the progress bar reaches the target progress
	        wait.until(ExpectedConditions.visibilityOfElementLocated(progressBarLocator));
	    }
		 
	
	

}
