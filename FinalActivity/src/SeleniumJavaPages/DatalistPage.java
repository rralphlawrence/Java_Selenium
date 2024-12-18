package SeleniumJavaPages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DataDriven.dataDriven;
import SeleniumJava.AbstractComponents.ReusableComponent;
import SeleniumJava.pageobjects.Datalist;


public class DatalistPage extends ReusableComponent{


	@BeforeTest
	 public void gotoWebsites(){
		 gotoWebsite();// method from the Base utility
		
	 }
	 
	 @Test
	 public void DataListDemo() throws IOException {
		  try {
			  
			  
		 Datalist Data = new Datalist(driver);  // Create an instance of the Data list class
		 Data.dropDownDataList.click(); 
		 TwosecondsSleep();
		 Data.DataListDropdown.click();
		 TwosecondsSleep();

			List <WebElement> Rows = Data.elementsList.findElements(By.className("items"));
			String Expected = "Brian Hoyies";
			
			Rows.stream().filter(item -> item.getText().contains("Brian Hoyies")).map(item -> item.getText()) //Filter and extract the text 
             .forEach(name ->   Assert.assertTrue(name.contains(Expected), "not found in the element text"));// Iterates to find the element

		     ThreesecondsSleep();
			
		     dataDriven dataa = new dataDriven();
			ArrayList<String> data1 = dataa.getData("datalist","testdata"); 
			Data.dataSearch.sendKeys(data1.get(1));
			 TwosecondsSleep();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Error");
			}
		}
	 
	 @AfterTest
	 public void closeDriver() {
		 driver.close();
	 }
}
