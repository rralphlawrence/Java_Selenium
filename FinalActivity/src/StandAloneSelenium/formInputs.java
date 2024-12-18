package StandAloneSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class formInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver ();
		 driver.manage().window().maximize();
		 
		 driver.get("https://demo.seleniumeasy.com/");
		 
		 driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Ralph");
		 driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Ralph");
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Ralph");
		 driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("Ralph");
		 driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Ralph");
		 driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Ralph");
		 driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Ralph");
		 
		 WebElement selectState=  driver.findElement(By.id("select-demo"));
		 Select dropdown = new  Select(selectState);
		 dropdown.selectByVisibleText("Alaska");
		 driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("Ralph");
		 driver.findElement(By.xpath("//input[@name='website']")).sendKeys("Ralph");
		 driver.findElement(By.xpath("//input[@value='yes'][@name='hosting']")).click();
		 driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("Ralph");
			
		 driver.findElement(By.xpath("//button[@type='submit'][@class='btn btn-default']")).click();

		
	}

}
