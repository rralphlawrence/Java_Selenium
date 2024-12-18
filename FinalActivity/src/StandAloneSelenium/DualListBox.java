package StandAloneSelenium;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DualListBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver ();
		 driver.manage().window().maximize();
		 driver.get("https://demo.seleniumeasy.com/");
		 

		 		Thread.sleep(2000);
			 	driver.findElement(By.xpath("(//li[@class='dropdown'])[6]")).click();
				driver.findElement(By.xpath("//li[@class='dropdown open']//li[1]")).click();
				Thread.sleep(3000);

				WebDriverWait holdBack = new WebDriverWait(driver, Duration.ofSeconds(5)); 
			 	WebElement dataList = holdBack.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[normalize-space()='bootstrap-duallist'])[1]")));
			 	dataList.click();
			 	
				var moveToRight = dataList.findElement(By.xpath("//button[@class='btn btn-default btn-sm move-right']"));
				moveToRight.click();
				String dataSearch = "bootstrap";
				 driver.findElement(By.xpath("(//input[@placeholder='search'])[2]")).sendKeys(dataSearch);
				 
				 List<WebElement>  dataElementList = driver.findElements(By.xpath("//div[@class='well']//ul[@class='list-group']"));
				 List<String> originalList = dataElementList.stream().map(s->s.getText()).collect(Collectors.toList());
				 List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
				 List<WebElement> filteredList= dataElementList.stream().filter(ele->ele.getText().contains("bootstrap")).collect(Collectors.toList());
			     
			     Assert.assertEquals(sortedList.size(), filteredList.size());
				 Assert.assertTrue(originalList.equals(sortedList));
				 if(originalList.equals(sortedList)) {
					 sortedList.forEach(System.out::println);
					 
					 
				 }else {
					 System.out.println("Not Match");
					 driver.close();
				 }
	}

}
