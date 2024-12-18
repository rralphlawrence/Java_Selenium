package InputForms;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertandModals {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver ();
		 driver.manage().window().maximize();
		 
	 
		 /*  FOR THE SIMPLE FORM **/
		 driver.get("https://demo.seleniumeasy.com/");
		 
		
		
		 Thread.sleep(2000);
		 	driver.findElement(By.xpath("(//li[@class='dropdown'])[5]")).click();
			driver.findElement(By.xpath("//li[@class='dropdown open']//li[1]")).click();
			
			
			/* AUTO CLOSE MODAL */
//			driver.findElement(By.xpath("//button[@id='autoclosable-btn-success']")).click();
//			
//			// TODO Auto-generated method stub
//			String autoClose = driver.findElement(By.xpath("//div[@class='alert alert-success alert-autocloseable-success']")).getText();
//			 
//			 if (autoClose.isEmpty()) {
//				 System.out.println("No modal displayed");
//				 
//			 }else {
//				 
//			 Assert.assertEquals("I'm an autocloseable success message. I will hide in 5 seconds.",autoClose);
//			 System.out.println(autoClose);
//		 }
			 
			 
			/* NORMAL MODAL */
//			 driver.findElement(By.xpath("//button[@id='normal-btn-success']")).click();
//			String normalMessage = driver.findElement(By.xpath("//div[@class='alert alert-success alert-normal-success']")).getText();
//			 
//			 if (normalMessage.isEmpty()) {
//				 System.out.println("No modal displayed");
//				 
//			 }else {
//				 
//			 Assert.assertEquals("×\n"+ "I'm a normal success message. To close use the appropriate button.",normalMessage);
//			 System.out.println(normalMessage);
//			 driver.findElement(By.xpath("//div[@class='alert alert-success alert-normal-success']//button")).click();
//		 }
			/* AUTO CLOSE WARNING MODAL */
//			driver.findElement(By.xpath("//button[@id='autoclosable-btn-warning']")).click();
//			String autocloseWarning = driver.findElement(By.xpath("//div[@class='alert alert-warning alert-autocloseable-warning']")).getText();
//			 
//			 if (autocloseWarning.isEmpty()) {
//				 System.out.println("No modal displayed");
//				 
//			 }else {
//				 
//			 Assert.assertEquals("I'm an autocloseable warning message. I will hide in 3 seconds.",autocloseWarning);
//			 System.out.println(autocloseWarning);
//		 }
			 
			 /* NORMAL WARNING MODAL */
//				driver.findElement(By.xpath("//button[@id='normal-btn-warning']")).click();
//				String normalWarning = driver.findElement(By.xpath("//div[@class='alert alert-warning alert-normal-warning']")).getText();
//				 
//				 if (normalWarning.isEmpty()) {
//					 System.out.println("No modal displayed");
//					 
//				 }else {
//					 
//				 Assert.assertEquals("×\n"+"I'm a normal warning message. To close use the appropriate button.",normalWarning);
//				 System.out.println(normalWarning);
//				 driver.findElement(By.xpath("//div[@class='alert alert-warning alert-normal-warning']//button")).click();
//			 }
			 
			 
			 /* AUTO CLOSE DANGER MODAL */
//				 driver.findElement(By.xpath("//button[@id='autoclosable-btn-danger']")).click();
//					String autocloseDanger = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-autocloseable-danger']")).getText();
//					 
//					 if (autocloseDanger.isEmpty()) {
//						 System.out.println("No modal displayed");
//						 
//					 }else {
//						 
//					 Assert.assertEquals("I'm an autocloseable danger message. I will hide in 5 seconds.",autocloseDanger);
//					 System.out.println(autocloseDanger);
//				 }
					 /* NORMAL DANGER MODAL */
//						driver.findElement(By.xpath("//button[@id='normal-btn-danger']")).click();
//						String normalDanger = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-normal-danger']")).getText();
//						 
//						 if (normalDanger.isEmpty()) {
//							 System.out.println("No modal displayed");
//							 driver.close();
//							 
//						 }else {
//							 
//						 Assert.assertEquals("×\n"+"I'm a normal danger message. To close use the appropriate button.",normalDanger);
//						 System.out.println(normalDanger);
//						 Thread.sleep(3000);
//						 driver.findElement(By.xpath("//div[@class='alert alert-danger alert-normal-danger']//button")).click();
//						
//					 }
					 
						 /* AUTO CLOSE Info message */
						 
//						 driver.findElement(By.xpath("//button[@id='autoclosable-btn-info']")).click();
//							String autocloseInfo = driver.findElement(By.xpath("//div[@class='alert alert-info alert-autocloseable-info']")).getText();
//							 
//							 if (autocloseInfo.isEmpty()) {
//								 System.out.println("No modal displayed");
//								 driver.close();
//								 
//							 }else {
//								 
//							 Assert.assertEquals("I'm an autocloseable info message. I will hide in 6 seconds.",autocloseInfo);
//							 System.out.println(autocloseInfo);
//							 
//						 }
			
						/* Normal Info message */
			
						driver.findElement(By.xpath("//button[@id='normal-btn-info']")).click();
						String normalInfo = driver.findElement(By.xpath("//div[@class='alert alert-info alert-normal-info']")).getText();
						 
						 if (normalInfo.isEmpty()) {
							 System.out.println("No modal displayed");
							 driver.close();
							 
						 }else {
							 
						 Assert.assertEquals("×\n"+"I'm a normal info message. To close use the appropriate button.",normalInfo);
						 System.out.println(normalInfo);
						 Thread.sleep(3000);
						 driver.findElement(By.xpath("//div[@class='alert alert-info alert-normal-info']//button")).click();
					 }
						 
	}

	
}


