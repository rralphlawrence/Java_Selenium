package InputForms;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WindowPopupModal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver ();
		 driver.manage().window().maximize();
		 
		 
	 
		 /*  FOR THE SIMPLE FORM **/
		 driver.get("https://demo.seleniumeasy.com/");
		 
		 
		    
		 		Thread.sleep(2000);
			 	driver.findElement(By.xpath("(//li[@class='dropdown'])[5]")).click();
				driver.findElement(By.xpath("//li[@class='dropdown open']//li[3]")).click();
//			
		       
		      
		        WebElement followButton = driver.findElement(By.xpath("//a[text()='Follow Twitter & Facebook']"));

		        
		        followButton.click(); 
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); 
		        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		        Thread.sleep(2000);
		        Set<String> allWindows = driver.getWindowHandles();
		        String mainWindowHandle = driver.getWindowHandle();
		        Assert.assertEquals(allWindows.size(),3);

		        Iterator<String> iterator = allWindows.iterator();
		        while (iterator.hasNext()) {
		        	
		        	String windowHandle = iterator.next();
		        	driver.switchTo().window(windowHandle);           
		        	System.out.println(driver.getTitle());
		        	
		           
		        	 
		           
		            if (!windowHandle.equals(mainWindowHandle)) {
		                driver.close();
		            }
		            
		           
		        }
		      
		     
		        driver.switchTo().window(mainWindowHandle);
		        Thread.sleep(5000);
		        driver.quit();
		    }
		}