package InputForms;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;




public class FormDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver ();
		 driver.manage().window().maximize();
		 
	
	 
		 /*  FOR THE SIMPLE FORM **/
		 driver.get("https://demo.seleniumeasy.com/");
		 
		 
		driver.findElement(By.xpath("(//li[@class='dropdown'])[1]")).click();

		 driver.findElement(By.xpath("//li[@class='dropdown open']//li[1]")).click();
		 driver.findElement(By.className("form-control")).sendKeys("Ralph");
		 driver.findElement(By.className("btn-primary")).click();
		 
		 // (Form Two input fields)
		 Thread.sleep(1000);
		 
		 driver.findElement(By.name("sum1")).sendKeys("100");
		 driver.findElement(By.name("sum2")).sendKeys("1200");
		 
		 
		 driver.findElement(By.xpath("(//button[normalize-space()='Get Total'])[1]")).click();
		 
		 Thread.sleep(1000);
		 
		 
		 /*  FOR THE CHECKBOX **/
		 //driver.findElement(By.xpath("(//li[@class='dropdown'])[1]")).click();
		 driver.findElement(By.xpath("(//li[@class='dropdown'])[1]")).click();
		 driver.findElement(By.xpath("//ul[@class='dropdown-menu']/li[2]"));
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Checkbox Demo')]")).click();
		 driver.findElement(By.id("isAgeSelected")).click();
		 WebElement check =  driver.findElement(By.id("isAgeSelected"));
		 Assert.assertTrue(check.isSelected());
		 System.out.println(check);
		 
		 WebElement check1 =  driver.findElement(By.id("check1"));
		 check1.click();
		 Assert.assertEquals("Uncheck All",check1.getAttribute("value"));
		 System.out.println(check1.getAttribute("value"));
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click();
		 
		 /*  FOR THE RADIO BUTTONS **/
		 
//		 Thread.sleep(1000);
//		 driver.findElement(By.xpath("(//li[@class='dropdown'])[1]")).click();
//		 driver.findElement(By.xpath("//ul[@class='dropdown-menu']/li[3]")).click();
//		 
//		 driver.findElement(By.cssSelector(".radio-inline> input[value=Female][name='optradio']")).click();
//		 driver.findElement(By.id("buttoncheck")).click();
//		 System.out.println(driver.findElement(By.className("radiobutton")).getText()); 
//		 
//		 driver.findElement(By.cssSelector(".radio-inline> input[value=Female][name='gender']")).click();
//		 driver.findElement(By.cssSelector(".radio-inline> input[value='15 - 50'][name='ageGroup']")).click();
//		 
//		 driver.findElement(By.cssSelector("button[onclick='getValues();']")).click();
//		 System.out.println(driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText()); 
//		 
//		 
//		 /*  FOR THE DROP DOWN **/	 
//		
//		 
//		 
//		 Thread.sleep(1000);
//		 driver.findElement(By.xpath("(//li[@class='dropdown'])[1]")).click();
//		 driver.findElement(By.xpath("//ul[@class='dropdown-menu']/li[4]")).click();
//		
//		 WebElement selectDay =  driver.findElement(By.id("select-demo"));
//		 Select dropdown = new  Select(selectDay);
//		 dropdown.selectByVisibleText("Wednesday");
//		 System.out.println("Day Selected:" + dropdown.getFirstSelectedOption().getText());
//		 
//		 
//		 driver.findElement(By.xpath("//option[@value='New Jersey']")).click();
//		 driver.findElement(By.xpath("//BUTTON[@value='Print First']")).click();
//		  
//		 System.out.println(driver.findElement(By.xpath("//p[@class='getall-selected']")).getText());
////		 
////		 /*  FOR THE AJAX **/
////		 
//		 Thread.sleep(1000);
//		 driver.findElement(By.xpath("(//li[@class='dropdown'])[1]")).click();
//		 driver.findElement(By.xpath("//ul[@class='dropdown-menu']/li[6]")).click();
//		 driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Ralph");
//		 driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Ralph");
//		 driver.findElement(By.xpath("//div[@id='submit-control']//input")).click();
//		 Thread.sleep(3000);
//		 System.out.println(driver.findElement(By.xpath("//div[@id='submit-control']")).getText());
//		
//		 
//		 /*  FOR THE jquery **/
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//li[@class='dropdown'])[1]")).click();
		 driver.findElement(By.xpath("//li[@class='dropdown open']//li[7]")).click();
		 
		 
		 driver.findElement(By.xpath("(//span[@role='combobox'])[1]")).click();
		 driver.findElement(By.xpath("//li[contains(text(),'United States of America')]")).click();
		 
		 
		 
	
		 driver.findElement(By.cssSelector("input[placeholder='Select state(s)']")).sendKeys("alabama");
		 driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Alaska");
		 driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();
		 
		
		 
		 driver.findElement(By.xpath("//span[@title='American Samoa']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span/input[@class='select2-search__field']")).sendKeys("Puerto Rico");
		 Thread.sleep(1000);
		 WebElement  enterKeys = driver.findElement(By.xpath("//span/input[@class='select2-search__field']"));
		 enterKeys.sendKeys(Keys.RETURN);
		  
		 
		
		 WebElement selectFile =  driver.findElement(By.xpath("//select[@name='files']"));
		 Select dropdownFile = new  Select(selectFile);
		 dropdownFile.selectByVisibleText("PHP");
		 System.out.println("Day Selected:" + dropdownFile.getFirstSelectedOption().getText());
		 
		 
		 
		
	}
	
	

}
