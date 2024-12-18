package StandAloneSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver ();
		 driver.manage().window().maximize();
		 
	 
		 /*  FOR THE SIMPLE FORM **/
		 driver.get("https://demo.seleniumeasy.com/");
		
		/*  FOR THE Date Picker **/
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//li[@class='dropdown'])[2]")).click();
		 driver.findElement(By.xpath("//li[@class='dropdown open']//li[1]")).click();
		 
		 driver.findElement(By.xpath("//span[@class='input-group-addon']/i")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//th[@class='today'])[1]")).click();
		 driver.findElement(By.xpath("//span[@class='input-group-addon']/i")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//th[@class='clear'])[1]")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//div[@id='datepicker']/input[1]")).click();
		 Thread.sleep(2000);
		 
		
		 
		 List <WebElement> startDate = driver.findElements(By.xpath("//tr//td[@class='day']")); 
		 
		 for(int i=0; i<startDate.size(); i++)
		    {
		        String datee = startDate.get(i).getText();
		        if(datee.equalsIgnoreCase("12")){
		        	startDate.get(i).click();
		            break;// break out of the loop after clicking the date
		        }
        
		}

		 
		 	driver.findElement(By.xpath("//div[@id='datepicker']/input[2]")).click();
	       List <WebElement>  endDate = driver.findElements(By.xpath("//tr//td[@class='day']"));
	       
	       for (int k = 0; k < endDate.size(); k++) {
	    	    String datee1 = endDate.get(k).getText();
	    	    if (datee1.equalsIgnoreCase("28")) {
	    	        endDate.get(k).click();
	    	        break; // break out of the loop after clicking the date
	    	    } 
	    	    
	    	    
	       }
	}

}
