package StandAloneSelenium;

import java.util.List;
import java.util.stream.Collectors;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableSort {

	


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		

		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver ();
		 driver.manage().window().maximize();
		 
		 
	 
		 /*  FOR THE SIMPLE FORM **/
		 driver.get("https://demo.seleniumeasy.com/");
		 
		
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//li[@class='dropdown'])[3]")).click();
		 driver.findElement(By.xpath("//li[@class='dropdown open']//li[4]")).click();
		 WebElement showEntries =  driver.findElement(By.xpath("//select[@name='example_length']"));
		 Select dropEntries = new Select(showEntries);
		 dropEntries.selectByVisibleText("25");
		 driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Marshall");
		 List<WebElement>  elementsList = driver.findElements(By.xpath("(//tr[@class='odd'])[1]"));
		 List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		 List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		 
		 
		
		 List<String> Name;
		 List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr[1]"));

		 Name = rows.stream().filter(s -> s.getText().contains("Marshall")).map(s -> getTableValue(s)).collect(Collectors.toList());

		 Name.forEach(a -> System.out.println(a));
		 
		 Assert.assertTrue(Name.equals(sortedList));
		 if(Name.equals(sortedList)) {
			 System.out.println("Name of data sorted is "+originalList);
			 
		 }else {
			 System.out.println("Not Match");
			 driver.close();
		 }
		
	}
		
	
	private static String getTableValue(WebElement s) {

		// TODO Auto-generated method stub

		String dataName = s.findElement(By.xpath("(//tr[@class='odd'])[1]")).getText();



		return dataName;

		}
}
