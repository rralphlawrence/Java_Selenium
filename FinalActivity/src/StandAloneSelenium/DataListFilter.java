package StandAloneSelenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataListFilter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver ();
		 driver.manage().window().maximize();
		 driver.get("https://demo.seleniumeasy.com/");
		 

		 		Thread.sleep(2000);
			 	driver.findElement(By.xpath("(//li[@class='dropdown'])[6]")).click();
				driver.findElement(By.xpath("//li[@class='dropdown open']//li[3]")).click();
				Thread.sleep(3000);
				
				String Filtername = "Brian";
				
				WebElement dataSearch = driver.findElement(By.xpath("//input[@type='search'][@class='form-control']"));
				dataSearch.sendKeys(Filtername);
				 List<WebElement>  elementsList = driver.findElements(By.xpath("//section[@class='content']"));
				 List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
				 List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
			     List<WebElement> filteredList= elementsList.stream().filter(ele->ele.getText().contains("Hoyies")).collect(Collectors.toList());
			     
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


