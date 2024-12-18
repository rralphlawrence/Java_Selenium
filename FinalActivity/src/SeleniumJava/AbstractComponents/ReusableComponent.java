package SeleniumJava.AbstractComponents;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableComponent {
	
			public static WebDriver driver; //To be more accessible and initialize first in test method
		
		// Chrome driver manager

	public void gotoWebsite() {
		// TODO Auto-generated method stub
		// driver.manage().window().maximize();
		
		WebDriverManager.chromedriver().setup(); //Driver setup
		 driver = new ChromeDriver();
		
		 driver.get("https://demo.seleniumeasy.com/"); //selenium link
		 driver.manage().window().maximize(); // Maximize the window
		
	}
	
				public void Sleep(int Time) throws InterruptedException {
					
					Thread.sleep(Time);
				
			}
			public void FivesecondsSleep() throws InterruptedException {
				
					Thread.sleep(5000);
				
			}
	
			public void SixsecondsSleep() throws InterruptedException {
				
					Thread.sleep(6000);
				
			}
			
			public void ThreesecondsSleep() throws InterruptedException {
			
					Thread.sleep(3000);
				
			}
	
			public void TwosecondsSleep() throws InterruptedException {
				
					Thread.sleep(2000);
				
			}
			
			public void OnesecondsSleep() throws InterruptedException {
				
				Thread.sleep(1000);
			
		}

			
			public WebElement waitForElementToAppear(By findBy) {
				 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5) );
				 return wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
			}
			
			public  void waitForProgressBar(WebDriver driver, int targetProgress, By findBy) {
		   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30) ); // Set your desired timeout
		     

		       // Wait until the progress bar reaches the target progress
		       wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
		   }
			
			public void waitforWindow(WebDriver driver) {
				 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
			        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
			}
			
			 
		}


	







